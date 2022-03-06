package com.addressRegistration.AddressRegistration.service.entityservice;

import com.addressRegistration.AddressRegistration.dao.CityDao;
import com.addressRegistration.AddressRegistration.entity.City;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CityEntityService {

    private final CityDao cityDao;

    public City save(City city){
        return cityDao.save(city);
    }

    public City findByPlateCode(String plateCode){
        return cityDao.findByPlateCode(plateCode);
    }
}
