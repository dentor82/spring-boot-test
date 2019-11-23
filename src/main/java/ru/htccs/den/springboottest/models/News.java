package ru.htccs.den.springboottest.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Объект новость
 */
@Data
@Entity
@Table(name = "list_news")
public class News implements IViewNews {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "title_news")
    private String title;

    @Column(name = "text_news")
    private String text;

    @Override
    public long getId() {
        return this.Id;
    }

    @Override
    public Date getCreateDate() {
        return this.createDate;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getText() {
        return this.text;
    }
}
