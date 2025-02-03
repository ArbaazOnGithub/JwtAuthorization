package com.jwt.authorization.services;

import com.jwt.authorization.models.PackageInfo;
import com.jwt.authorization.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageService {

    @Autowired
    private PackageRepository packageRepository;

    public PackageInfo createPackage(PackageInfo packageInfo) {
        return packageRepository.save(packageInfo);
    }

    public PackageInfo findById(Integer packageId) {
        return packageRepository.findById(packageId).orElse(null);
    }
}