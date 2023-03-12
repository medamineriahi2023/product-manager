package tn.ey.productmanager.services;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.ey.productmanager.entities.Produit;
import tn.ey.productmanager.repository.ProduitRepository;
import tn.ey.productmanager.services.interfaces.IProduitService;

import java.util.List;

@Service
public class ProduitService implements IProduitService {

    private ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }


    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit update(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void delete(long idProduit) {
      produitRepository.deleteById(idProduit);
    }
    @Override
    public List<Produit> getAllProduit() {
        return produitRepository.findAll();
    }
    @Override
    public Produit findByNom(String nom) {
        Produit p = produitRepository.findByNom(nom).orElse(null);
        Assert.notNull(p, "Produit not found");
        return p;
    }
    @Override
    public List<Produit> findByDisponibilite(boolean disponibilite) {
        return produitRepository.findByDisponiblite(disponibilite);
    }
}
