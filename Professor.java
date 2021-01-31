/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ads1an_pla_heranca3;

/**
 *
 * @author JFernandes
 */
public class Professor extends Pessoa {
    
    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    void lecionar () {
        //System.out.println(nome + "lecionando...");
        System.out.println(getNome() + "lecionando...");
        
    }
    
}
