package com.addressRegistration.AddressRegistration.app.cnt.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CntCountryDto {
    private Long id;
    private String name;
    private int code;
}
