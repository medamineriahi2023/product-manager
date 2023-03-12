package tn.ey.productmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.ey.productmanager.entities.Categorie;
import tn.ey.productmanager.entities.Produit;

@Repository
public interface CategoryRepository extends JpaRepository<Categorie,Long> {
}
