package com.addressRegistration.AddressRegistration.app.cty.dao;

import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public interface CtyCityDao extends JpaRepository<CtyCityEntity, Long> {
    List<CtyCityEntity> findAllByIdOrderById(Long id);
    CtyCityEntity findByPlate(Integer id);

}
