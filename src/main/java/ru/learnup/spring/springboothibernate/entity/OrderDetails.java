package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Детали заказа - ид заказа, ид книги, количество, цена
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class OrderDetails implements Serializable{

    @Id
    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders_id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book_id;

    @Column(nullable = false)
    private Integer amount;

    @Column(nullable = false)
    private Integer price;
}
