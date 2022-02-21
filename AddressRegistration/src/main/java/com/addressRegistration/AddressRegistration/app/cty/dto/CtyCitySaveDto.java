package com.addressRegistration.AddressRegistration.app.cty.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CtyCitySaveDto {
    private Long id;
    private String name;
    private Integer plate;
    private Long country_id;
}
