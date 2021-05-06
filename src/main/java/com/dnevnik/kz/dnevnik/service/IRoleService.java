package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.Role;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

public interface IRoleService {

    Role create(Role role);

    List<Role> getAll();

    Role findById(Long id);

    void deleteById(Long id);

}
