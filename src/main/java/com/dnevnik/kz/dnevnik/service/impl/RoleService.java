package com.dnevnik.kz.dnevnik.service.impl;

import com.dnevnik.kz.dnevnik.model.Role;
import com.dnevnik.kz.dnevnik.repository.AdditionalInfoRepository;
import com.dnevnik.kz.dnevnik.repository.RoleRepository;
import com.dnevnik.kz.dnevnik.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleService implements IRoleService{

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role create(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }

}
