package com.example.facture.controller;

import com.example.facture.entities.Facteur;
import com.example.facture.services.FacteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Facteur")
public class FacteurController {
    private FacteurService facteurService ;

    public FacteurController(FacteurService facteurService) {
        this.facteurService = facteurService;
    }

    @GetMapping("/")
    public List<Facteur> getAll(){
        return this.facteurService.getAll();
    }

    @GetMapping("/{id]")
    public Facteur getFacteurById(@PathVariable Long id){
        return this.facteurService.findFacteurById(id);
    }

    @PostMapping("/add")
    public Facteur addFacteur(@RequestBody Facteur facteur){
        return this.facteurService.addFacteur(facteur) ;

    }
    @PutMapping("/update")
    public Facteur updateFacteur(@RequestBody Facteur facteur){
        return this.facteurService.updateFacteur(facteur);
    }

    @DeleteMapping("/delete")
    public void deleteFacteur(@RequestBody Facteur facteur){
        this.facteurService.deleteFacteur(facteur);
    }




}
