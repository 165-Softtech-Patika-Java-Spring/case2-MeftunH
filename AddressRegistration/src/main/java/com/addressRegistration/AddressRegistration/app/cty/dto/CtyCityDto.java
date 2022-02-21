package com.addressRegistration.AddressRegistration.app.cty.dto;

import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CtyCityDto {
    private Long id;
    private String name;
    private Integer plate;
    private Integer country_id;

}
