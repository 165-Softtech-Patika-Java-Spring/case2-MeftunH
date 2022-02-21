package com.addressRegistration.AddressRegistration.app.cnt.dao;

import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CntCountryDao extends JpaRepository<CntCountryEntity, Long> {
    List<CntCountryEntity> findAllByNameOrderByName(String name);

}
