/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 19:17
 */

package com.api.fidelityms.service;

import com.api.fidelityms.model.FidelityCard;
import com.api.fidelityms.repository.FidelityCardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FidelityCardService {

    private final FidelityCardRepository fidelityCardRepository;

    public FidelityCardService(FidelityCardRepository fidelityCardRepository) {
        this.fidelityCardRepository = fidelityCardRepository;
    }

    public List<FidelityCard> getAllFidelityCards() {
        return fidelityCardRepository.findAll();
    }

    public Optional<FidelityCard> getByIdFidelityCard(Long id) {
        return fidelityCardRepository.findById(id);
    }

    public FidelityCard addFidelityCard(FidelityCard fidelityCard) {
        return fidelityCardRepository.save(fidelityCard);
    }

    public FidelityCard updateFidelityCard(Long id, FidelityCard fidelityCard) {
        Optional<FidelityCard> data = fidelityCardRepository.findById(id);
        return fidelityCardRepository.save(fidelityCard);
    }
}
