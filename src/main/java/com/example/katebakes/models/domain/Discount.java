package com.example.katebakes.models.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="discount")
public class Discount {

    @Id
    @SequenceGenerator(name="discount_sequence", sequenceName="discount_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "discount_sequence")
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="discount_percent")
    private double price;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy="discount", fetch = FetchType.LAZY)
    private Set<Product> products = new HashSet<>();

}
