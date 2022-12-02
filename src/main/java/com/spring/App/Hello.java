package com.spring.App;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("Hello")
public class Hello {
   private static final  String vista="Inicio";


   @GetMapping("/Indice")
    public String Hello2(){
    //ModelAndView inicio=new ModelAndView(vista);
    //inicio.addObject(nombre,"nombre");

        return "Hola mundo";


    }


}
