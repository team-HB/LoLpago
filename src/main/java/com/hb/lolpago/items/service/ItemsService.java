package com.hb.lolpago.items.service;

import java.util.List;

import com.hb.lolpago.items.entity.Item;
import com.hb.lolpago.items.repository.ItemsRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ItemsService {

  private final ItemsRepository repository;
  
  public List<Item> getAllitems() {
    return repository.findAll();
  }

  public Item getItemByName(String name) {
    Item item = repository.findItemsByName(name);
    return item;
  }

  public Item getItemById(int id) {
    Item item = repository.findItemById(id);
    return item;
  }

}
