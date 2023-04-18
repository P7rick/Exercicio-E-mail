package com.primeirotrampodev.Exercicio.Email.Service;

import com.primeirotrampodev.Exercicio.Email.Entidade.Pessoa;
import org.apache.catalina.valves.rewrite.InternalRewriteMap;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

@Service
public class PessoaService {

    public List<Pessoa> atributosPessoa(List<String> nomeList) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        Random telefone = new Random();

        Integer iniciotelefone = telefone.nextInt(999);
        Integer finalTelefone = telefone.nextInt(9999);

        Pessoa pessoa = new Pessoa();

        for (Integer cont = 0; cont < nomeList.size(); cont++) {

            pessoa.setTelefone(String.valueOf("(31) 3" + iniciotelefone + "-" + finalTelefone));

            pessoa.setNome(nomeList.get(cont));

            listaDePessoas.add(pessoa);

            pessoa.setEmail((nomeList.get(cont).toLowerCase() + "@gmail.com"));

            pessoa.setId(cont);
        }

        return listaDePessoas;
    }
}



