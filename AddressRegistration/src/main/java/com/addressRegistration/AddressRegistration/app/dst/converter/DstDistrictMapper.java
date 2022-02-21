package com.addressRegistration.AddressRegistration.app.dst.converter;

import com.addressRegistration.AddressRegistration.app.dst.dto.DstDistrictDto;
import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DstDistrictMapper {
    DstDistrictMapper INSTANCE = Mappers.getMapper(DstDistrictMapper.class);

    DstDistrict convertToDstDistinct(DstDistrictDto ctyCitySaveRequestDto);

    DstDistrictDto convertToDstDistinctDto(DstDistrict province);
}
