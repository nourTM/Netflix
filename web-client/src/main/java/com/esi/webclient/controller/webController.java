package com.esi.webclient.controller;

import com.esi.webclient.proxy.FormationProxy;
import com.esi.webclient.proxy.ScolariteProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class webController {

    @Autowired
    FormationProxy formationProxy;

    @Autowired
    ScolariteProxy scolariteProxy;

    @RequestMapping("/formation")

    public String getformation(Model model){
        model.addAttribute("formations",new ArrayList<>(formationProxy.getFormations().getContent()));
        return "FormationView";
    }

    @GetMapping("/student/{id}")
    public String getEtudiant(Model model,@PathVariable("id") Long ide){
        model.addAttribute("etudiant",scolariteProxy.getEtudiant(ide));

        return "EtudiantView";
    }
}
