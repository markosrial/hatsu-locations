package com.hitomi.hop.catalog.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.awt.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Location {

    @Id
    private String reference;

    private Point geoPosition;

    private Address address;

    private String phoneNumber;

    private String faxNumber;

    private LocationEnum type;

    private boolean active;

    private boolean delivery;

}
