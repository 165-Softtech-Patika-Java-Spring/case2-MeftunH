package com.addressRegistration.AddressRegistration.service.entityservice;

import com.addressRegistration.AddressRegistration.dao.DistrictDao;
import com.addressRegistration.AddressRegistration.entity.District;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DistrictEntityService {

    private final DistrictDao districtDao;

    public District save(District district){
        return districtDao.save(district);
    }

    public List<District> findAllByCityId(Long cityId){
        return districtDao.findAllByCityId(cityId);
    }
}
