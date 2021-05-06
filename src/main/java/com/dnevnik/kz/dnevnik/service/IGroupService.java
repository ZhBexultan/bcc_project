package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.Group;

import java.util.List;

public interface IGroupService {

    Group create(Group group);

    List<Group> getAll();

    Group findById(Long id);

    void deleteById(Long id);

}

