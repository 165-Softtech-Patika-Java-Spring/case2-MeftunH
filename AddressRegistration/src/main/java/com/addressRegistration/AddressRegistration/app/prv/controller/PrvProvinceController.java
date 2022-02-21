package com.addressRegistration.AddressRegistration.app.prv.controller;


import com.addressRegistration.AddressRegistration.app.prv.dto.PrvProvinceDto;
import com.addressRegistration.AddressRegistration.app.prv.service.PrvProvinceService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/provinces")
@AllArgsConstructor
public class PrvProvinceController {
    private final PrvProvinceService provinceService;
    @PostMapping
    public ResponseEntity save(@RequestBody PrvProvinceDto provinceSaveDto){

        PrvProvinceDto prvProvinceDto = provinceService.save(provinceSaveDto);

        return ResponseEntity.ok(prvProvinceDto);
    }
}
