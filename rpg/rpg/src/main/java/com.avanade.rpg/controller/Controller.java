package com.avanade.rpg.controller;

import com.avanade.rpg.model.Character;
import com.avanade.rpg.repository.Character.CharacterRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rpg")
@Api(value = "API REST RPG Characters")
@CrossOrigin(origins = "*")

public class Controller {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping("/characters")
    @ApiOperation(value = "Returns a list of RPG characters")
    public List<Character> listCharacters() {
        return characterRepository.findAll();


    }

    @GetMapping("/characters/{id}")
    @ApiOperation(value = "Returns a specific character")
    public Character listEspecificCharacter(@PathVariable(value = "id") long id) {
        return characterRepository.findById(id);
    }

    @PostMapping("/characters")
    @ApiOperation(value = "Saves a character")
    public Character saveCharacter(@RequestBody Character character) {
        return characterRepository.save(character);
    }

    @DeleteMapping("/characters")
    @ApiOperation(value = "Deletes a character")
    public void deleteCharacter(@RequestBody Character character) {
        characterRepository.delete(character);
    }

    @PutMapping("/characters")
    @ApiOperation(value = "Updates a character")
    public Character updateCharacter(@RequestBody Character character) {
        return characterRepository.save(character);

    }

}