package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Детали заказа - ид заказа, ид книги, количество, цена
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class OrderDetails implements Serializable {

    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "orders_id", nullable = false)
    private Orders orders;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column
    private Integer amount;

    @Column
    private Integer price;
}
