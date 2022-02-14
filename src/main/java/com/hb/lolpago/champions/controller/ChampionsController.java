package com.hb.lolpago.champions.controller;

import java.util.List;

import com.hb.lolpago.champions.dto.ChampionsDto;
import com.hb.lolpago.champions.entity.Champions;
import com.hb.lolpago.champions.service.ChampionsService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/champions")
@CrossOrigin(origins = "http://localhost:3333")
@RequiredArgsConstructor
public class ChampionsController {

    private final ChampionsService championsService;

    @GetMapping("/all")
    public List<Champions> fetchAllChampions() {
        return championsService.getAllChampions();
    }

    @GetMapping("/{name}")
    public Champions getChampionByName(@PathVariable String name){        
        return championsService.getChampionByName(name);
    }

    // @GetMapping("/{name}")
    // public ResponseEntity<Champions> getChampion(@PathVariable String name){        
    //     return ResponseEntity.ok(championsService.getChampionByName(name));
    // }

}
