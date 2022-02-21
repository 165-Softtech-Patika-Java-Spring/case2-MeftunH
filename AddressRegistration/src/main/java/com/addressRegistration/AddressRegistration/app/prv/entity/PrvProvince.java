package com.addressRegistration.AddressRegistration.app.prv.entity;

import com.addressRegistration.AddressRegistration.app.dst.entity.DstDistrict;
import com.addressRegistration.AddressRegistration.app.gen.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRV_PROVINCE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrvProvince extends BaseEntity {
    @Id
    @SequenceGenerator(name = "PrvProvince" , sequenceName = "PRV_PROVINCE_ID_SEQ")
    @GeneratedValue(generator = "PrvProvince")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

}
