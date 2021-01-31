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
public class Teste {
    
    public static void main(String[] args) {
        ProfessorHorista profHorista = new ProfessorHorista();
        ProfessorPesquisador profPesquisador = new ProfessorPesquisador();
        /*
        profHorista.nome = "Rafael";
        profPesquisador.nome = "Nino";
        */
        
        profHorista.setNome("Rafael");
        profPesquisador.setNome("Nino");
        profHorista.lecionar();
        profPesquisador.lecionar();                
    }    
}
