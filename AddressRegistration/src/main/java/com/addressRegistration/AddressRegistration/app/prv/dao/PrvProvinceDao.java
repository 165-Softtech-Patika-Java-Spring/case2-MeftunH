package com.addressRegistration.AddressRegistration.app.prv.dao;

import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrvProvinceDao extends JpaRepository<PrvProvince, Long> {

}
