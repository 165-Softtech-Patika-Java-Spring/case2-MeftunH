package com.addressRegistration.AddressRegistration.app.cty.service.entity;

import com.addressRegistration.AddressRegistration.app.cnt.dao.CntCountryDao;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.cty.dao.CtyCityDao;
import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import com.addressRegistration.AddressRegistration.app.gen.service.BaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CtyCityEntityService extends BaseEntityService<CtyCityEntity, CtyCityDao> {
    @Autowired
    public CtyCityEntityService(CtyCityDao dao){
        super(dao);
    }

}
