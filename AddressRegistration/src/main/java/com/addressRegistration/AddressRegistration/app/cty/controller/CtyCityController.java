package com.addressRegistration.AddressRegistration.app.cty.controller;

import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCityDto;
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
    public ResponseEntity save(@RequestBody CtyCityDto ctyCitySaveDto){

        CtyCityDto ctyCityDto = ctyCityService.save(ctyCitySaveDto);

        return ResponseEntity.ok(ctyCityDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CtyCityDto> findById(@PathVariable Long id){
        CtyCityDto ctyCityDto = ctyCityService.findByPlate(id.intValue());

        return ResponseEntity.ok(ctyCityDto);
    }
}
