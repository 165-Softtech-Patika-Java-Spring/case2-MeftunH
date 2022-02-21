package com.addressRegistration.AddressRegistration.app.dst.service;

import com.addressRegistration.AddressRegistration.app.dst.converter.DstDistrictMapper;
import com.addressRegistration.AddressRegistration.app.dst.dto.DstDistrictDto;
import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import com.addressRegistration.AddressRegistration.app.dst.service.entity.DstDistrictEntityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DstDistrictsService {

    private final DstDistrictEntityService dstDistrictEntityService;

    public DstDistrictDto save(DstDistrictDto prvProvinceSaveDto) {

        DstDistrict dstDistrict = DstDistrictMapper.INSTANCE.convertToDstDistinct(prvProvinceSaveDto);

        dstDistrict = dstDistrictEntityService.save(dstDistrict);

        DstDistrictDto dstDistrictDto = DstDistrictMapper.INSTANCE.convertToDstDistinctDto(dstDistrict);

        return dstDistrictDto;
    }
}
