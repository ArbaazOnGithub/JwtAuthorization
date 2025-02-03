package com.jwt.authorization.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "ContentPages")
@Data
public class ContentPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id")
    private Integer pageId;

    @Column(name = "page_name", length = 50, nullable = false)
    private String pageName;

    @Column(name = "content", columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(name = "last_updated", nullable = false)
    private Date lastUpdated = new Date();
}