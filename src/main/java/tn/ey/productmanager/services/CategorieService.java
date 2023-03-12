package tn.ey.productmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.ey.productmanager.entities.Categorie;
import tn.ey.productmanager.repository.CategoryRepository;
import tn.ey.productmanager.services.interfaces.ICategoryService;

import java.util.List;

@Service
public class CategorieService implements ICategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Categorie save(Categorie categorie) {
        return categoryRepository.save(categorie);
    }

    @Override
    public Categorie update(Categorie categorie) {
        return categoryRepository.save(categorie);
    }

    @Override
    public void delete(long idCategorie) {
        categoryRepository.deleteById(idCategorie);
    }

    @Override
    public List<Categorie> getAllCategories() {
        return categoryRepository.findAll();
    }
}
