package ru.learnup.spring.springboothibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Автор - ФИО, ид
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "book_shop")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    @Column
    private String name;

    @Column
    private String surname;

    // У одного автора может быть несколько произведений
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> book;
}
