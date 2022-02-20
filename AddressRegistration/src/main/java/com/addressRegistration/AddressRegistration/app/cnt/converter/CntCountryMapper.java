package com.addressRegistration.AddressRegistration.app.cnt.converter;

import com.addressRegistration.AddressRegistration.app.cnt.dto.CntCountryDto;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
//import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CntCountryMapper {

    CntCountryMapper INSTANCE = Mappers.getMapper(CntCountryMapper.class);

    CntCountryEntity convertToCntCountry(CntCountryDto prdProductSaveRequestDto);

    CntCountryDto convertToCntCountryDto(CntCountryEntity prdProductSaveRequestDto);

}
