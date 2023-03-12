package tn.ey.productmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ey.productmanager.entities.Produit;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
        Optional<Produit> findByNom(String nom);
        List<Produit> findByDisponiblite(boolean disponible);
}
