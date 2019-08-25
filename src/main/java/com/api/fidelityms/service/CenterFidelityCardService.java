/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 19:00
 */

package com.api.fidelityms.service;

import com.api.fidelityms.model.CenterFidelityCard;
import com.api.fidelityms.repository.CenterFidelityCardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CenterFidelityCardService {

    private final CenterFidelityCardRepository centerFidelityCardRepository;

    public CenterFidelityCardService(CenterFidelityCardRepository centerFidelityCardRepository) {
        this.centerFidelityCardRepository = centerFidelityCardRepository;
    }

    public List<CenterFidelityCard> getAllCenterFidelityCards() {
        return centerFidelityCardRepository.findAll();
    }

    public Optional<CenterFidelityCard> getByIdCenterFidelityCard(Long id) {
        return centerFidelityCardRepository.findById(id);
    }

    public CenterFidelityCard addCenterFidelityCard(CenterFidelityCard centerFidelityCard) {
        return centerFidelityCardRepository.save(centerFidelityCard);
    }

    public CenterFidelityCard updateCenterFidelityCard(Long id, CenterFidelityCard centerFidelityCard) {
        Optional<CenterFidelityCard> data = centerFidelityCardRepository.findById(id);
        return centerFidelityCardRepository.save(centerFidelityCard);
    }
}
