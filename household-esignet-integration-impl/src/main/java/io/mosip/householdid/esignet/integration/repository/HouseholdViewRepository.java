/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.householdid.esignet.integration.repository;

import io.mosip.householdid.esignet.integration.entity.HouseholdView;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import org.springframework.stereotype.Repository;


@Repository
public interface HouseholdViewRepository extends JpaRepository<HouseholdView, Long> {
    Optional<HouseholdView> findByIdNumber(String idNumber);
}
