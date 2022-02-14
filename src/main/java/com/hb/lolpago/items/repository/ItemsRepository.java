package com.hb.lolpago.items.repository;

import com.hb.lolpago.items.entity.Item;

import org.springframework.data.mongodb.repository.MongoRepository;
public interface ItemsRepository extends MongoRepository<Item, String> {

  public Item findItemsByName(String name);

  public Item findItemById(int id);

}