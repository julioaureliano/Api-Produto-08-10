package com.produto.api.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProdutoController {
    @GetMapping("/Produto")
    public String Produto(){
        return "Api Funcionando";
    }
}