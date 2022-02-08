package com.hb.lolpago.items.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
@Getter
@NoArgsConstructor
@Document(collection = "items")
public class Item {

    @Id
    private ObjectId _id;
    private int id;
    private String name;
    private String description;
    private Boolean isUnique;
    private Boolean isElusive;

    @Builder
    public Item(int id, String name, String description, Boolean isUnique, Boolean isElusive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isUnique = isUnique;
        this.isElusive = isElusive;
    }
}