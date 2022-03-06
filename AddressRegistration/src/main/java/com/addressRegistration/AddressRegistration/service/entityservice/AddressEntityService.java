package com.addressRegistration.AddressRegistration.service.entityservice;

import com.addressRegistration.AddressRegistration.dao.AddressDao;
import com.addressRegistration.AddressRegistration.dto.AddressDetailDto;
import com.addressRegistration.AddressRegistration.dto.AddressResponseDto;
import com.addressRegistration.AddressRegistration.converter.AddressMapper;
import com.addressRegistration.AddressRegistration.dto.AddressSaveRequestDto;
import com.addressRegistration.AddressRegistration.entity.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressEntityService {

    private final AddressDao addressDao;

    public AddressResponseDto save(AddressSaveRequestDto addressSaveRequestDto){

        Address address = AddressMapper.INSTANCE.convertToAddress(addressSaveRequestDto);

        address = addressDao.save(address);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public void delete(Long id){

        Address address = getById(id);

        addressDao.delete(address);
    }

    public AddressResponseDto findById(Long id){

        Address address = getById(id);

        AddressResponseDto addressResponseDto = AddressMapper.INSTANCE.convertToAddressResponseDto(address);

        return addressResponseDto;
    }

    public AddressDetailDto findAddressDetails(Long id){
        return addressDao.findAddressDetails(id);
    }

    private Address getById(Long id) {

        Optional<Address> addressOptional = addressDao.findById(id);

        Address address;
        if (addressOptional.isPresent()) {
            address = addressOptional.get();
        } else {
            throw new RuntimeException("Item not found!");
        }
        return address;
    }
}
