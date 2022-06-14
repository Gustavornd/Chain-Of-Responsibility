/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author Gustavo Rafael Nunes Durães
 */
public class GerenteAssistente extends Aprovador{
    
    @Override
    protected double getPermissao()
    {
        return valorBase*30;
    }

    @Override
    protected String getPosicao()
    {
        return "Gerente Assistente";
    }
}
