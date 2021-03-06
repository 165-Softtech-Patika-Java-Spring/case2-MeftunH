package com.addressRegistration.AddressRegistration.converter;

import com.addressRegistration.AddressRegistration.dto.AddressResponseDto;
import com.addressRegistration.AddressRegistration.dto.AddressSaveRequestDto;
import com.addressRegistration.AddressRegistration.entity.Address;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

    AddressMapper INSTANCE = Mappers.getMapper(AddressMapper.class);

    Address convertToAddress(AddressSaveRequestDto addressSaveRequestDto);

    AddressResponseDto convertToAddressResponseDto(Address address);

}
