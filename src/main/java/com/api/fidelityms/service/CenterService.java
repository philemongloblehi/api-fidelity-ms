/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 18:56
 */

package com.api.fidelityms.service;

import com.api.fidelityms.model.Center;
import com.api.fidelityms.repository.CenterRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CenterService {

    private final CenterRepository centerRepository;

    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public List<Center> getAllCenters() {
        return centerRepository.findAll();
    }

    public Optional<Center> getByIdCenter(Long id) {
        return centerRepository.findById(id);
    }

    public Center addCenter(Center center) {
        return centerRepository.save(center);
    }

    public Center updateCenter(Long id, Center center) {
        Optional<Center> data = centerRepository.findById(id);
        return centerRepository.save(center);
    }
}
