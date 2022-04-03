package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Книга содержит информацию:
 * о названии
 * идентификаторе автора
 * годе издания
 * количестве страниц
 * цене
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer book_id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @OneToOne(mappedBy = "book")
    private StorageBook storageBook;

    @OneToOne(mappedBy = "book")
    private OrderDetails orderDetails;

    @Column
    private String publish_year;

    @Column
    private Integer pages;

    @Column
    private Integer price;
}
