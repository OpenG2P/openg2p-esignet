/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */
package io.mosip.householdid.esignet.integration.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "household_view")
public class HouseholdView {
    @Id
    @Column(name = "household_ID")
    private long householdId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "ID_number")
    private String idNumber;

    @Column(name = "password")
    private String password;

    @Column(name = "tamwini_consented")
    private boolean tamwiniConsented;
}
