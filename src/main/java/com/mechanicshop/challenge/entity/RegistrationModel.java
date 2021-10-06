package com.mechanicshop.challenge.entity;

import com.mechanicshop.challenge.enuns.PerfilEnum;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@ToString
@Table(name = "cadastro")
public class RegistrationModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long code;

    @Basic
    @Column(name = "nome", nullable = false, length = 255)
    private String name;

    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;

    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Basic
    @Column(name = "tipo", nullable = true, length = 255)
    private PerfilEnum type;


}
