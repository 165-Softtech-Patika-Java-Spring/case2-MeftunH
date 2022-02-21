package com.addressRegistration.AddressRegistration.app.prv.service.entity;

import com.addressRegistration.AddressRegistration.app.cty.dao.CtyCityDao;
import com.addressRegistration.AddressRegistration.app.gen.service.BaseEntityService;
import com.addressRegistration.AddressRegistration.app.prv.dao.PrvProvinceDao;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrvProvinceEntityService extends BaseEntityService<PrvProvince, PrvProvinceDao> {
    @Autowired
    public PrvProvinceEntityService(PrvProvinceDao dao){
        super(dao);
    }
}
