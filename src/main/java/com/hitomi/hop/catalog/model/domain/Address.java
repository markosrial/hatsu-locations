package com.hitomi.hop.catalog.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Address {

    private final String street;
    private final int number;
    private final String postalCode;
    private final String city;
    private final String state;
    private final String isoCountry;

}
