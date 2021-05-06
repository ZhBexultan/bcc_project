package com.dnevnik.kz.dnevnik.controller;

import com.dnevnik.kz.dnevnik.model.AdditionalInfo;
import com.dnevnik.kz.dnevnik.service.impl.AdditionalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dnevnik/additionalInfo")
public class AdditionalInfoController {

    @Autowired
    private AdditionalInfoService additionalInfoService;

    @GetMapping
    public ResponseEntity<List<AdditionalInfo>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(additionalInfoService.getAll());
    }

    @GetMapping("/{additionalInfoId}")
    public ResponseEntity<AdditionalInfo> getById(@PathVariable Long additionalInfoId) {
        return ResponseEntity.ok().body(additionalInfoService.findById(additionalInfoId));
    }

    @PostMapping
    public ResponseEntity<AdditionalInfo> create(@RequestBody AdditionalInfo additionalInfo) {
        return ResponseEntity.ok().body(additionalInfoService.create(additionalInfo));
    }

    @DeleteMapping("/{additionalInfoId}")
    public ResponseEntity<?> delete(@PathVariable Long additionalInfoId) {
        additionalInfoService.deleteById(additionalInfoId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
