package com.addressRegistration.AddressRegistration.app.dst.dao;


import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DstDistrictDao  extends JpaRepository<DstDistrict, Long> {
}
