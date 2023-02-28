package com.example.katebakes.models.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="shopping_session")
public class ShoppingSession {

    @Id
    @SequenceGenerator(name="shopping_session_sequence", sequenceName="shopping_session_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shopping_session_sequence")
    @Column(name="id")
    private int id;

    @Column(name="total")
    private double total;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy="shoppingSession", fetch = FetchType.LAZY)
    private Set<CartItem> cartItems = new HashSet<>();

}
