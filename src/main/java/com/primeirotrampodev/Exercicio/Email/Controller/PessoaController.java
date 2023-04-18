package com.primeirotrampodev.Exercicio.Email.Controller;

import com.primeirotrampodev.Exercicio.Email.Entidade.Pessoa;
import com.primeirotrampodev.Exercicio.Email.Service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;
@GetMapping("/pessoa-atributos")
    public List<Pessoa> getPessoa(@RequestParam("nome") List<String> nomeList){

        return pessoaService.atributosPessoa(nomeList);
    }
}
