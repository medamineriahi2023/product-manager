package tn.ey.productmanager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.ey.productmanager.entities.Categorie;
import tn.ey.productmanager.services.interfaces.ICategoryService;

import java.util.List;

@RestController
@RequestMapping(path = "/categories")
public class CategorieController {

    @Autowired
    ICategoryService iCategoryService;


    @GetMapping
    public List<Categorie> getAll(){
        return iCategoryService.getAllCategories();
    }

    @PostMapping
    public Categorie save(@RequestBody Categorie categorie){
        return iCategoryService.save(categorie);
    }

    @PutMapping
    public Categorie update(@RequestBody Categorie categorie){
        return iCategoryService.update(categorie);
    }


    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id){
        iCategoryService.delete(id);
    }


}
