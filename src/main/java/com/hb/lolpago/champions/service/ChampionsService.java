package com.hb.lolpago.champions.service;

import java.util.List;

import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.repository.ChampionsRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ChampionsService {

  private final ChampionsRepository repository;
  
  public List<Champions> getAllChampions() {
    return repository.findAll();
  }

  public Champions getChampionByName(String name) {
    Champions champ = repository.findChampionsByName(name);
    System.out.println(name);
    System.out.println(champ);
    return champ;
  }

}
