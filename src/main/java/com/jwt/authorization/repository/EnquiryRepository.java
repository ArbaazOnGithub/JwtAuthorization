package com.jwt.authorization.repository;


import com.jwt.authorization.models.Enquiry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnquiryRepository extends JpaRepository<Enquiry, Integer> {
}