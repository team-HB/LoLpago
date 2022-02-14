package com.hb.lolpago.champions.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("champions")
public record recodeChampions(@Id String _id, String name, String championId, int cost, List<String> traits) {

    @PersistenceConstructor
    public recodeChampions {}

    public recodeChampions(String name, String championId, int cost, List<String> traits) {
        this(null, name, championId, cost, traits);
    }
    // @Id
    // private ObjectId _id;
    // private String name;
    // private String championId;
    // private int cost;
    // private List<String> traits;

    // public Champions(ObjectId _id, String name, String championId, String cost, List<String> traits) {
    //     super();
    //     this._id = _id;
    //     this.name = name;
    //     this.championId = championId;
    //     this.cost = cost;
    //     this.traits = traits;
    // }

}
