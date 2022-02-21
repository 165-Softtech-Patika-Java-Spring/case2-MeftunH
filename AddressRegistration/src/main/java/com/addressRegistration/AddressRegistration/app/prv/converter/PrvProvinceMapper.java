package com.addressRegistration.AddressRegistration.app.prv.converter;

import com.addressRegistration.AddressRegistration.app.prv.dto.PrvProvinceDto;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PrvProvinceMapper {
    PrvProvinceMapper INSTANCE = Mappers.getMapper(PrvProvinceMapper.class);

    PrvProvince convertToCtyCity(PrvProvinceDto ctyCitySaveRequestDto);

    PrvProvinceDto convertToCtyCityDto(PrvProvince province);
}
