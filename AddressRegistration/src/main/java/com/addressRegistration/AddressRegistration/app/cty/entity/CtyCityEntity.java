package com.addressRegistration.AddressRegistration.app.cty.entity;

import com.addressRegistration.AddressRegistration.app.cnt.entity.CntCountryEntity;
import com.addressRegistration.AddressRegistration.app.gen.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CTY_CITY")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CtyCityEntity extends BaseEntity {

    @Id
    @SequenceGenerator(name = "CtyCity" , sequenceName = "CTY_CITY_ID_SEQ")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name",length = 100,nullable = false)
    private String name;

    @Column(name = "PLATE", length = 3, nullable = false,unique = true)
    private Integer plate;


    @ManyToOne
    @JoinColumn(name="country_id", nullable=false)
    private CntCountryEntity country;

  }
