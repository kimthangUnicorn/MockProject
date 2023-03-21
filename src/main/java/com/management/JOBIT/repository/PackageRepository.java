package com.management.JOBIT.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.JOBIT.model.PackageName;
@Repository 
public interface PackageRepository extends JpaRepository<PackageName, Integer>{
	Optional<PackageName> findByPackageName(String name);
	Optional<PackageName> deleteByPackageName(String packname);
}
