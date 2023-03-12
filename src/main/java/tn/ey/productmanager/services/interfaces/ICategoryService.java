package tn.ey.productmanager.services.interfaces;

import tn.ey.productmanager.entities.Categorie;
import tn.ey.productmanager.entities.Produit;

import java.util.List;

public interface ICategoryService {

    Categorie save(Categorie categorie);

    Categorie update(Categorie categorie);

    void delete (long idCategorie);

    List<Categorie> getAllCategories();

}
