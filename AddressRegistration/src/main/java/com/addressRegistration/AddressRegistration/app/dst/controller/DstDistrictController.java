package com.addressRegistration.AddressRegistration.app.dst.controller;

import com.addressRegistration.AddressRegistration.app.dst.dto.DstDistrictDto;
import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import com.addressRegistration.AddressRegistration.app.dst.service.DstDistrictsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/districts")
@AllArgsConstructor
public class DstDistrictController {
    private final DstDistrictsService dstDistrictsService;
    @PostMapping
    public ResponseEntity save(@RequestBody DstDistrictDto dstDistrictSaveDto){

        DstDistrictDto dstDistrictDto  = dstDistrictsService.save(dstDistrictSaveDto);

        return ResponseEntity.ok(dstDistrictDto);
    }
}
