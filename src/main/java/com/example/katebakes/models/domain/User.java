package com.example.katebakes.models.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="\"user\"")
public class User {

    @Id
    @SequenceGenerator(name="user_sequence", sequenceName="user_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="telephone")
    private String telephone;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy="user", fetch = FetchType.LAZY)
    private Set<OrderDetails> orderDetailsSet = new HashSet<>();

}
