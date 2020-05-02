package com.esi.webclient.model;

import lombok.Data;

@Data
public class Etudiant {
    private String nom;
    private String promo;

    private Formation formation;
}
