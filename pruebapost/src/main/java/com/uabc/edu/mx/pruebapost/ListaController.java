package com.uabc.edu.mx.pruebapost;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListaController {
    private List<String> valores = new ArrayList<>();

    @RequestMapping(path="/lista")
    public String lista (Model model){

        model.addAttribute("lista", valores);
        return "lista";
    }

    @PostMapping("/add")
    public String add(String nuevo){
        valores.add(nuevo);
        return "redirect:/lista";
    }

}
