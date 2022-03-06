package com.addressRegistration.AddressRegistration.service.entityservice;

import com.addressRegistration.AddressRegistration.dao.CountryDao;
import com.addressRegistration.AddressRegistration.entity.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryEntityService {

    private final CountryDao countryDao;

    public List<Country> findAll(){
        return countryDao.findAll();
    }

    public Country save(Country country){
        return countryDao.save(country);
    }

    public Country findByCountryCode(String countryCode){
        return countryDao.findByCode(countryCode);
    }
}
