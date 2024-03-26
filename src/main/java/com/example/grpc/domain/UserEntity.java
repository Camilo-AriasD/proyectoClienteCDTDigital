package com.example.grpc.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "USERS")
public class UserEntity {
    @Id
    @SequenceGenerator(name = "users_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "users_id_seq")
    private Long id;
    private String name;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}