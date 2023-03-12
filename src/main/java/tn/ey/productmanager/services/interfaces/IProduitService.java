package tn.ey.productmanager.services.interfaces;

import tn.ey.productmanager.entities.Produit;

import java.util.List;
import java.util.Optional;

public interface IProduitService {
    Produit save(Produit produit);

    Produit update(Produit produit);

    void delete (long idProduit);

    List<Produit> getAllProduit();

    Produit findByNom(String nom);
    List<Produit> findByDisponibilite(boolean disponibilite);


}
