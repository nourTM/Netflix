package com.esi.msscolarite.dao;

import com.esi.msscolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Repositor
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findEtudiantsByIdFormation(Long idf);
}
