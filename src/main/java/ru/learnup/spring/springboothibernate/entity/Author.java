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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    // У одного автора может быть несколько произведений
    // Думаю, тут можно сделать отношение многие ко многим через дополнительную табличу
    // Но пока оставил так
    @OneToMany(mappedBy = "author_id", cascade = CascadeType.ALL)
    private List<Book> book;
}
