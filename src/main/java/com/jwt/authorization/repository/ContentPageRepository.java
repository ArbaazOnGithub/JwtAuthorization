package com.jwt.authorization.repository;

import com.jwt.authorization.models.ContentPage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentPageRepository extends JpaRepository<ContentPage, Integer> {
}