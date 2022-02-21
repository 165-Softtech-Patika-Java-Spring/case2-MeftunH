package com.addressRegistration.AddressRegistration.app.prv.service;

import com.addressRegistration.AddressRegistration.app.prv.converter.PrvProvinceMapper;
import com.addressRegistration.AddressRegistration.app.prv.dto.PrvProvinceDto;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import com.addressRegistration.AddressRegistration.app.prv.service.entity.PrvProvinceEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PrvProvinceService {

    private final PrvProvinceEntityService prvProvinceEntityService;

    public PrvProvinceDto save(PrvProvinceDto prvProvinceSaveDto) {

        PrvProvince prvProvince = PrvProvinceMapper.INSTANCE.convertToCtyCity(prvProvinceSaveDto);

        prvProvince = prvProvinceEntityService.save(prvProvince);

        PrvProvinceDto prvProvinceDto = PrvProvinceMapper.INSTANCE.convertToCtyCityDto(prvProvince);

        return prvProvinceDto;
    }
}
