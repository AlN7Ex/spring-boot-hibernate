package ru.learnup.spring.springboothibernate.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Покупатель - ид, ФИО, дата рождения
 */

@Entity
@Table(schema = "book_shop")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;

    // У одного покупателя может быть несколько заказов
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> orders;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String birth;
}
