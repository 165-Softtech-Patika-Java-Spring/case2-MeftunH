package com.addressRegistration.AddressRegistration.app.cnt.converter;

import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CntCountryMapper {

    CntCountryMapper INSTANCE = Mappers.getMapper(CntCountryMapper.class);

    CntCountryEntity convertToCntCountry(CntCountryDto cntCountrySaveRequestDto);

    CntCountryDto convertToCntCountryDto(CntCountryEntity cntCountrySaveRequestDto);

}
