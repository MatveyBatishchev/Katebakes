package com.example.katebakes.models.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="order_details")
public class OrderDetails {

    @Id
    @SequenceGenerator(name="order_details_sequence", sequenceName="order_details_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_details_sequence")
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
    @OneToMany(mappedBy="orderDetails", fetch = FetchType.LAZY)
    private Set<OrderItem> orderItems = new HashSet<>();

}
