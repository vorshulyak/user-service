package com.saly.user;

import com.saly.user.common.domain.AbstractEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer")
public class CustomerEntity extends AbstractEntity<CustomerEntity> {
    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;
}
