/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author Gustavo Rafael Nunes Durães
 */
abstract class Aprovador {
    protected static final double valorBase = 50;
    protected Aprovador superior;
    
    abstract protected double getPermissao();
    
    abstract protected String getPosicao();
    
    public void setSuperior (Aprovador superior){
        this.superior = superior;
    }
    
    public void solicitarEmprestimo(Emprestimo request)
    {
        if (request.getValor() < this.getPermissao())
        {
            System.out.println(this.getPosicao() + " pode aprovar $" + request.getValor());
        }
        else if (superior != null)
        {
            superior.solicitarEmprestimo(request);
        }
    }
}
