package com.addressRegistration.AddressRegistration.app.dst.entity;

import com.addressRegistration.AddressRegistration.app.gen.entity.BaseEntity;
import com.addressRegistration.AddressRegistration.app.prv.entity.PrvProvince;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "DST_DISTRICT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DstDistrict extends BaseEntity {
    @Id
    @SequenceGenerator(name = "DstDistrict" , sequenceName = "DST_DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "DstDistrict")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name="province_id", nullable = false)
    private PrvProvince provinceId;
}

