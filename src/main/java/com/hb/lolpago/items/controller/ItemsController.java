package com.hb.lolpago.items.controller;

import java.util.List;

import com.hb.lolpago.items.dto.ItemsDto;
import com.hb.lolpago.items.entity.Item;
import com.hb.lolpago.items.service.ItemsService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/items")
@CrossOrigin(origins = "http://localhost:3333")
@RequiredArgsConstructor
public class ItemsController {

    private final ItemsService itemsService;

    @GetMapping("/all")
    public List<Item> fetchAllitems() {
        return itemsService.getAllitems();
    }

    @GetMapping("/{name}")
    public Item getItemByName(@PathVariable String name){        
        return itemsService.getItemByName(name);
    }

    @GetMapping("/{id}")
    public Item getItemByName(@PathVariable int id){        
        return itemsService.getItemById(id);
    }

    // @GetMapping("/{name}")
    // public ResponseEntity<items> getItems(@PathVariable String name){        
    //     return ResponseEntity.ok(itemsService.getItemsByName(name));
    // }

}
