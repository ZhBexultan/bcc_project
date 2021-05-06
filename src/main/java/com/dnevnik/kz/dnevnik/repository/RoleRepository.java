package com.dnevnik.kz.dnevnik.repository;

import com.dnevnik.kz.dnevnik.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
