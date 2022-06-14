/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.program;

/**
 *
 * @author Gustavo Rafael Nunes Durães
 */
public class Emprestimo {
    private double valor;
    private String motivo;

    public Emprestimo(double valor, String motivo)
    {
        this.valor = valor;
        this.motivo = motivo;
    }

    public double getValor()
    {
        return valor;
    }

    public void setAmount(double val)
    {
        valor  = val;
    }

    public String getPurpose()
    {
        return motivo;
    }

    public void setPurpose(String razao)
    {
        motivo = razao;
    }
}
