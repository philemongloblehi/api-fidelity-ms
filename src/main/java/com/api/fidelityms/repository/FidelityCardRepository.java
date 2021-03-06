/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 10:47
 */

package com.api.fidelityms.repository;

import com.api.fidelityms.model.FidelityCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FidelityCardRepository extends JpaRepository<FidelityCard, Long> {
}
