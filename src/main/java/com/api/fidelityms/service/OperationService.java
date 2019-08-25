/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 20:12
 */

package com.api.fidelityms.service;

import com.api.fidelityms.model.Operation;
import com.api.fidelityms.repository.OperationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class OperationService {

    private final OperationRepository operationRepository;

    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public List<Operation> getAllOperations() {
        return operationRepository.findAll();
    }

    public Optional<Operation> getByIdOperation(Long id) {
        return operationRepository.findById(id);
    }

    public Operation addOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    public Operation updateOperation(Long id, Operation operation) {
        Optional<Operation> data = operationRepository.findById(id);
        return operationRepository.save(operation);
    }
}
