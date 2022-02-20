package com.addressRegistration.AddressRegistration.app.cnt.dao;

import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CntCountryDao extends JpaRepository<CntCountryEntity, Long> {

}
