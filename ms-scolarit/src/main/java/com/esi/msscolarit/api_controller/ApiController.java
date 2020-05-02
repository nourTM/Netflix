package com.esi.msscolarit.api_controller;

import com.esi.msscolarit.dao.EtudiantRepository;
import com.esi.msscolarit.entities.Etudiant;
import com.esi.msscolarit.proxy.FormationProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiController {
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    FormationProxy formationProxy;

    @GetMapping("/etudiant/{id}")
    Etudiant getEtudiantwithFormation(@PathVariable("id") Long id){
        Etudiant etudiant = etudiantRepository.findById(id).get();
        etudiant.setFormation(formationProxy.getFormation(etudiant.getIdFormation()));
        return etudiant;
    }
}
