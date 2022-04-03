package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Книжный склад хранит информацию об остатках книг
 * по идентификатору книги (ИД у книг должны быть уникальными)
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class StorageBook implements Serializable {

    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @Column
    private int amount;
}
