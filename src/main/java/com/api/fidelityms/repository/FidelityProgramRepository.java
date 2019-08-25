/*
 * Copyright (c) 2019. Philemon GLOBLEHI, Back-end developer.
 * Phone: (+225) 79-08-10-50
 * Email: philemongloblehi@gmail.com
 * CreatedAt 25/08/2019 12:27
 */

package com.api.fidelityms.repository;

import com.api.fidelityms.model.FidelityProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FidelityProgramRepository extends JpaRepository<FidelityProgram, Long> {
}
