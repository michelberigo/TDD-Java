/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Michel Berigo
 */
public class Leilao {
    private String descricao;
    private List<Lance> lances;
    
    public Leilao (String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<Lance>();
    }
    
    public void propoe (Lance lance) {
        lances.add(lance);
    }
    
    public String getDescricao () {
        return descricao;
    }

    public List<Lance> getLances() {
        return Collections.unmodifiableList (lances);
    }
}
