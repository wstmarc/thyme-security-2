package fr.laerce.thymesecurity.web;

import fr.laerce.thymesecurity.security.service.ServiceSecurise;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private ServiceSecurise service;

    public AdminController(ServiceSecurise service){
        this.service = service;
    }

    @GetMapping("/")
    public String index(){
        System.out.println("Avant appel à truc()");
        service.truc();
        System.out.println("Après appel à truc()");
        System.out.println("Avant appel à machin()");
        service.machin();
        System.out.println("Après appel à machin()");

        return "admin/index"; // <--
    }

    @PreAuthorize("hasAuthority('ROOT')")
    public void bidule(){

    }
}
