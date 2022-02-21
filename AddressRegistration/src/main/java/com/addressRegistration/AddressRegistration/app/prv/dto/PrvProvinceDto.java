package com.addressRegistration.AddressRegistration.app.prv.dto;

import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PrvProvinceDto {
    private Long id;
    private String name;
}
