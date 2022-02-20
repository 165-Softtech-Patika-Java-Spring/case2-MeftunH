package com.addressRegistration.AddressRegistration.app.cnt.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "CNT_COUNTRY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CntCountryEntity {

    @Id
    @SequenceGenerator(name = "CusCustomer" , sequenceName = "CNT_COUNTRY_ID_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CODE", length = 11, nullable = false)
    private Integer code;
}
