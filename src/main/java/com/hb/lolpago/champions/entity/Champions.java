package com.hb.lolpago.champions.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@Document(collection = "champions")
public class Champions {

    // @Transient
    // public static final String SEQUENCE_NAME = "champions_sequence";

    @Id
    private String id;
    private String name;
    private String championId;
    private int cost;
    private List<String> traits;

    // public void setId(Long id) {
    //     this.id = id;
    // }

    @Builder
    public Champions(String name, String championId, int cost, List<String> traits) {
        this.name = name;
        this.championId = championId;
        this.cost = cost;
        this.traits = traits;
    }
}