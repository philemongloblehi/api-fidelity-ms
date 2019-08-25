/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 19:45
 */

package com.api.fidelityms.service;

import com.api.fidelityms.model.FidelityProgram;
import com.api.fidelityms.repository.FidelityProgramRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FidelityProgramService {

    private final FidelityProgramRepository fidelityProgramRepository;

    public FidelityProgramService(FidelityProgramRepository fidelityProgramRepository) {
        this.fidelityProgramRepository = fidelityProgramRepository;
    }

    public List<FidelityProgram> getAllFidelityPrograms() {
        return fidelityProgramRepository.findAll();
    }

    public Optional<FidelityProgram> getByIdFidelityProgram(Long id) {
        return fidelityProgramRepository.findById(id);
    }

    public FidelityProgram addFidelityProgram(FidelityProgram fidelityProgram) {
        return fidelityProgramRepository.save(fidelityProgram);
    }

    public FidelityProgram updateFidelityProgram(Long id, FidelityProgram fidelityProgram) {
        Optional<FidelityProgram> data = fidelityProgramRepository.findById(id);
        return fidelityProgramRepository.save(fidelityProgram);
    }
}
