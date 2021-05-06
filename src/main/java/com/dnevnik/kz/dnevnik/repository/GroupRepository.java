package com.dnevnik.kz.dnevnik.repository;

import com.dnevnik.kz.dnevnik.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {
}
