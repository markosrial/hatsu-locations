package com.hitomi.hop.catalog.rest.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlockDto<T> {

    private List<T> items;
    private boolean hasNext;

}
