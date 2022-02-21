package com.addressRegistration.AddressRegistration.app.cty.converter;

import com.addressRegistration.AddressRegistration.app.cty.dto.CtyCityDto;
import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CtyCityMapper {
    CtyCityMapper INSTANCE = Mappers.getMapper(CtyCityMapper.class);

    CtyCityEntity convertToCtyCity(CtyCityDto ctyCitySaveRequestDto);

    CtyCityDto convertToCtyCityDto(CtyCityEntity ctyCitySaveRequestDto);
}
