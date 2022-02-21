package com.addressRegistration.AddressRegistration.app.dst.service.entity;

import com.addressRegistration.AddressRegistration.app.dst.dao.DstDistrictDao;
import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import com.addressRegistration.AddressRegistration.app.gen.service.BaseEntityService;
import com.addressRegistration.AddressRegistration.app.prv.dao.PrvProvinceDao;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DstDistrictEntityService extends BaseEntityService<DstDistrict, DstDistrictDao> {
    @Autowired
    public DstDistrictEntityService(DstDistrictDao dao) {
        super(dao);
    }
}
