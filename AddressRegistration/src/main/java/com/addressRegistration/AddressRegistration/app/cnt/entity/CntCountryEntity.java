package com.addressRegistration.AddressRegistration.app.cnt.entity;

import com.addressRegistration.AddressRegistration.app.cty.entity.CtyCityEntity;
import com.addressRegistration.AddressRegistration.app.gen.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CNT_COUNTRY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","cities"})
public class CntCountryEntity extends BaseEntity {

    @Id
    @SequenceGenerator(name = "CntCountry" , sequenceName = "CNT_COUNTRY_ID_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "CODE", length = 11, nullable = false,unique = true)
    private Integer code;

}
