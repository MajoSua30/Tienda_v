
package com.tienda.controller;

import ch.qos.logback.core.model.Model;
import com.tienda.entity.Pais;
import com.tienda.entity.Persona;
import com.tienda.service.IPaisService;
import com.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author María José
 */
@Controller
public class PersonaController {
    @Autowired
    private IPersonaService personaService;
     @Autowired
     private IPaisService paisService;
     @GetMapping("/persona")
     public String index(Model model){
         List<Persona>listaPersona=personaService.getAllPersona();
         model.addAttribute("titulo","Tabla Persona");
         model.addAttribute("personas", listaPersona);
         return "Personas";
     }
    @GetMapping("/persona")
    public String crearPersona(Model model){
        List<Pais> listaPaises= paisService.listCountry();
        model.addAttribute("persona",new Persona());
         model.addAttribute("paises", listaPaises);
         return "crear"; 
    }
    
    
}
