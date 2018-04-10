package com.parse.starter.util;

import java.util.HashMap;

/**
 * Created by Thiago on 21/03/2018.
 */
public class ParseErros {

    private HashMap<Integer, String> erros;

    public ParseErros() {
        this.erros = new HashMap<>();
        this.erros.put(202, "Já existe usuário com este nome, por favor, escolha outro nome.");
        this.erros.put(201, "Senha não preenchida! Por favor, digite uma senha!");
    }

    public String getErro(int codErro){
        return this.erros.get(codErro);
    }
}
