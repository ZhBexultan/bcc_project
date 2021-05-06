package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.Account;

import java.util.List;

public interface IAccountService {

    Account create(Account account);

    List<Account> getAll();

    Account findById(Long id);

    void deleteById(Long id);

}
