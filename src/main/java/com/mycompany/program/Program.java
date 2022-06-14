/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.program;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author Gustavo Rafael Nunes Durães
 */
public class Program {

    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        GerenteAssistente gerenteAssis = new GerenteAssistente();
        
        Gerente gerente = new Gerente();
        caixa.setSuperior(gerenteAssis);
        gerenteAssis.setSuperior(gerente);
       

        // Press Ctrl+C to end.
        try
        {
            while (true)
            {
                System.out.println("Insira um valor para saber quem pode aprovar seu emprestimo");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                caixa.solicitarEmprestimo(new Emprestimo(d, "General"));
                
                System.out.println("\n ####################################### \n");
            }
        } catch (Exception e)
        {
            System.exit(1);
        }
    }
}
