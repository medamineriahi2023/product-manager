package tn.ey.productmanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class Produit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String nom;
    private Boolean disponiblite;
    private Integer qte;
    @ManyToOne
    @JsonIgnore
    private Categorie categorie;

}
