package com.addressRegistration.AddressRegistration.app.cnt.service.entity;

import com.addressRegistration.AddressRegistration.app.cnt.dao.CntCountryDao;
import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.gen.service.BaseEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CntCountryEntityService extends BaseEntityService<CntCountryEntity, CntCountryDao> {
    @Autowired
    public CntCountryEntityService(CntCountryDao dao){
        super(dao);
    }

}
