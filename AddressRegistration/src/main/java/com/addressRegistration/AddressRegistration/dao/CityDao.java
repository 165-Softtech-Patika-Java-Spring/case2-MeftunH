package com.addressRegistration.AddressRegistration.dao;

import com.addressRegistration.AddressRegistration.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CityDao extends JpaRepository<City, Long> {

    City findByPlateCode(String plateCode);
}
