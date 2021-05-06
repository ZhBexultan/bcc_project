package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.AdditionalInfo;

import java.util.List;

public interface IAdditionalInfoService {

    AdditionalInfo create(AdditionalInfo additionalInfo);

    List<AdditionalInfo> getAll();

    AdditionalInfo findById(Long id);

    void deleteById(Long id);

}
