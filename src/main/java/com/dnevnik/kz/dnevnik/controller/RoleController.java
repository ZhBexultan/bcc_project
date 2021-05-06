package com.dnevnik.kz.dnevnik.controller;

import com.dnevnik.kz.dnevnik.model.Role;
import com.dnevnik.kz.dnevnik.service.impl.AdditionalInfoService;
import com.dnevnik.kz.dnevnik.service.impl.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dnevnik/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public ResponseEntity<List<Role>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(roleService.getAll());
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<Role> getById(@PathVariable Long roleId) {
        return ResponseEntity.ok().body(roleService.findById(roleId));
    }

    @PostMapping
    public ResponseEntity<Role> create(@RequestBody Role role) {
        return ResponseEntity.ok().body(roleService.create(role));
    }

    @DeleteMapping("/{roleId}")
    public ResponseEntity<?> delete(@PathVariable Long roleId) {
        roleService.deleteById(roleId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
