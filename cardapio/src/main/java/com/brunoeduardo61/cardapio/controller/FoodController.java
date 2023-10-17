package com.brunoeduardo61.cardapio.controller;


import com.brunoeduardo61.cardapio.food.Food;
import com.brunoeduardo61.cardapio.food.FoodRepository;
import com.brunoeduardo61.cardapio.food.FoodRequestDTO;
import com.brunoeduardo61.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
private FoodRepository repository;
@CrossOrigin(origins = "*", allowCredentials = "*")
@PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
    Food foodData = new Food(data);
    repository.save(foodData);
    return;


    }

    @CrossOrigin(origins = "*", allowCredentials = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){

    List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;

    }
}
