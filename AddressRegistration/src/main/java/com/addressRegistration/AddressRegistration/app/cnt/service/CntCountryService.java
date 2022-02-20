package com.addressRegistration.AddressRegistration.app.cnt.service;
import com.addressRegistration.AddressRegistration.app.cnt.converter.CntCountryMapper;
import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.cnt.service.entity.CntCountryEntityService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CntCountryService {

    private final CntCountryEntityService cntCountryEntityService;

    public CntCountryDto save(CntCountryDto cntCountrySaveRequestDto) {

        CntCountryEntity cntCountry = CntCountryMapper.INSTANCE.convertToCntCountry(cntCountrySaveRequestDto);

        cntCountry = cntCountryEntityService.save(cntCountry);

        CntCountryDto cntCountryDto = CntCountryMapper.INSTANCE.convertToCntCountryDto(cntCountry);

        return cntCountryDto;
    }
}
