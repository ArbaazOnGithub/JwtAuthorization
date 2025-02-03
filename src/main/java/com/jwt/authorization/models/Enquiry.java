package com.jwt.authorization.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "Enquiries")
@Data
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enquiry_id")
    private Integer enquiryId;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private PackageInfo packageInfo;

    @Column(name = "enquiry_text", columnDefinition = "TEXT")
    private String enquiryText;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();
}