package fr.laerce.thymesecurity.security.service;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class ServiceSecurise
{
    //ANNOTATION POUR SECURISER LES METHODES
    //Attention: une méthode non sécurisée faisant appel à une méthode sécurisée rendra la méthode sécurisée non sécurisée...
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostAuthorize("hasAnyAuthority('ROOT')")
    public void machin(){
        System.out.println("machin");
    }

    public void truc(){
        machin();
    }
}
