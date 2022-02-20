package com.addressRegistration.AddressRegistration.app.cnt.controller;

import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cnt.service.CntCountryService;
import com.addressRegistration.AddressRegistration.app.cnt.service.entity.CntCountryEntityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/countries")
@AllArgsConstructor


public class CntCountryController {
    private final CntCountryService cntCountryService;
    @PostMapping
    public ResponseEntity save(@RequestBody CntCountryDto cntCountrySaveDto){

        CntCountryDto cntCountryDto = cntCountryService.save(cntCountrySaveDto);

        return ResponseEntity.ok(cntCountryDto);
    }
}
