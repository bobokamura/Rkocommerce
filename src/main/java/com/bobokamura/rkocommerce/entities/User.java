package com.bobokamura.rkocommerce.entities;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private String password;
    private List<String> roles;

    public List<String> getRoles() {
        return roles;
    }
}
