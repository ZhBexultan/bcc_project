package com.dnevnik.kz.dnevnik.repository;

import com.dnevnik.kz.dnevnik.model.AdditionalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdditionalInfoRepository extends JpaRepository<AdditionalInfo, Long> {
}
