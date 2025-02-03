package com.jwt.authorization.controllers;

import com.jwt.authorization.models.PackageInfo;
import com.jwt.authorization.services.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/packages")
public class PackageController {

    @Autowired
    private PackageService packageService;

    @PostMapping
    public PackageInfo createPackage(@RequestBody PackageInfo packageInfo) {
        return packageService.createPackage(packageInfo);
    }

    @GetMapping("/{packageId}")
    public PackageInfo getPackage(@PathVariable Integer packageId) {
        return packageService.findById(packageId);
    }
}