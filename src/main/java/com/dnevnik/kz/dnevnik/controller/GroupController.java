package com.dnevnik.kz.dnevnik.controller;

import com.dnevnik.kz.dnevnik.model.Group;
import com.dnevnik.kz.dnevnik.service.impl.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dnevnik/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @GetMapping
    public ResponseEntity<List<Group>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(groupService.getAll());
    }

    @GetMapping("/{groupId}")
    public ResponseEntity<Group> getById(@PathVariable Long groupId) {
        return ResponseEntity.ok().body(groupService.findById(groupId));
    }

    @PostMapping
    public ResponseEntity<Group> create(@RequestBody Group group) {
        return ResponseEntity.ok().body(groupService.create(group));
    }

    @DeleteMapping("/{groupId}")
    public ResponseEntity<?> delete(@PathVariable Long groupId) {
        groupService.deleteById(groupId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
