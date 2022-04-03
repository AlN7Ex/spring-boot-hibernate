package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Заказ - ид покупателя, ид заказа, сумма покупки
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orders_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column
    private Integer purchase_amount;

    // У одного заказа - одна дополнительная информация о нём
    @OneToOne(mappedBy = "orders", cascade = CascadeType.ALL)
    private OrderDetails orderDetails;

}
