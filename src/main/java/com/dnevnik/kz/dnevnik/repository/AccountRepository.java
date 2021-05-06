package com.dnevnik.kz.dnevnik.repository;

import com.dnevnik.kz.dnevnik.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
