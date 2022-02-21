package com.addressRegistration.AddressRegistration.app.cty.controller;

import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCityDto;
import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCitySaveDto;
import com.addressRegistration.AddressRegistration.app.cty.service.CtyCityService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/cities")
@AllArgsConstructor

public class CtyCityController {

    private final CtyCityService ctyCityService;
    @PostMapping
    public ResponseEntity save(@RequestBody CtyCitySaveDto ctyCitySaveDto){

        CtyCityDto ctyCityDto = ctyCityService.save(ctyCitySaveDto);

        return ResponseEntity.ok(ctyCityDto);
    }

    @GetMapping("/{plate}")
    public ResponseEntity<CtyCityDto> findByPlate(@PathVariable Long plate){
        CtyCityDto ctyCityDto = ctyCityService.findByPlate(plate.intValue());

        return ResponseEntity.ok(ctyCityDto);
    }
}
