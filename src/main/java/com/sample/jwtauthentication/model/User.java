package com.sample.jwtauthentication.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String[] password;

    @Column
    private Date expiredDate;
}
