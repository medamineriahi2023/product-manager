package tn.ey.productmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.ey.productmanager.entities.Produit;
import tn.ey.productmanager.services.interfaces.IProduitService;

import java.util.List;

@RestController
@RequestMapping(path = "/produits")
public class ProduitController {

    @Autowired
    IProduitService iProduitService;


    @GetMapping
    public List<Produit> getAll(){
        return iProduitService.getAllProduit();
    }

    @PostMapping
    public Produit save(@RequestBody Produit produit){
        return iProduitService.save(produit);
    }

    @PutMapping
    public Produit update(@RequestBody Produit produit){
        return iProduitService.update(produit);
    }


    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){
        iProduitService.delete(id);
    }

    @GetMapping("/{nom}")
    public Produit findByName(@PathVariable String nom){
        return iProduitService.findByNom(nom);
    }


    @GetMapping("filter/{disp}")
    public List<Produit> findByDisp(@PathVariable boolean disp){
        return iProduitService.findByDisponibilite(disp);
    }


}
