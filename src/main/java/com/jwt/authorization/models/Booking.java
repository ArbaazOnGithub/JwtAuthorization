package com.jwt.authorization.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "Bookings")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private PackageInfo packageInfo;

    @Column(name = "booking_date", nullable = false, updatable = false)
    private Date bookingDate = new Date();

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.Pending;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    public enum Status {
        Pending, Confirmed, Cancelled
    }
}