package com.jwt.authorization.repository;

import com.jwt.authorization.models.PackageInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepository extends JpaRepository<PackageInfo, Integer> {
}