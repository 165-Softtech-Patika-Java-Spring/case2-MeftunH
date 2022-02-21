package com.addressRegistration.AddressRegistration.app.cty.service;

import com.addressRegistration.AddressRegistration.app.cnt.converter.CntCountryMapper;
import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.cty.converter.CtyCityMapper;
import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCityDto;
import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCitySaveDto;
import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import com.addressRegistration.AddressRegistration.app.cty.service.entity.CtyCityEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CtyCityService {

    private final CtyCityEntityService ctyCityEntityService;

    public CtyCityDto save(CtyCitySaveDto ctyCitySaveRequestDto) {

        CtyCityEntity ctyCity = CtyCityMapper.INSTANCE.convertToCtyCity(ctyCitySaveRequestDto);

        ctyCity = ctyCityEntityService.save(ctyCity);

        CtyCityDto ctyCityDto = CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);

        return ctyCityDto;
    }

    public CtyCityDto findByPlate(Integer plate) {

        CtyCityEntity ctyCity = ctyCityEntityService.getDao().findByPlate(plate);

        CtyCityDto ctyCityDto = CtyCityMapper.INSTANCE.convertToCtyCityDto(ctyCity);

        return ctyCityDto;
    }

}
