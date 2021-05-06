package com.dnevnik.kz.dnevnik.service.impl;

import com.dnevnik.kz.dnevnik.model.AdditionalInfo;
import com.dnevnik.kz.dnevnik.repository.AdditionalInfoRepository;
import com.dnevnik.kz.dnevnik.service.IAdditionalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdditionalInfoService implements IAdditionalInfoService {

    @Autowired
    private AdditionalInfoRepository additionalInfoRepository;

    @Override
    public AdditionalInfo create(AdditionalInfo additionalInfo) {
        return additionalInfoRepository.save(additionalInfo);
    }

    @Override
    public List<AdditionalInfo> getAll() {
        return additionalInfoRepository.findAll();
    }

    @Override
    public AdditionalInfo findById(Long id) {
        return additionalInfoRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        additionalInfoRepository.deleteById(id);
    }
}
