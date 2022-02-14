package com.hb.lolpago.items.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemsDto {
  
    private int id;
    private String name;
    private String description;
    private Boolean isUnique;
    private Boolean isElusive;
}
