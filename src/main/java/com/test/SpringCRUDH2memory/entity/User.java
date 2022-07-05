package com.test.SpringCRUDH2memory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="users")
/*@AllArgsConstructor
@NoArgsConstructor*/
public class User {

    @Id
    @GeneratedValue
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private int id;
    private String name;
    private String address;

}
