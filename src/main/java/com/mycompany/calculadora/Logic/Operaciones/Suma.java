/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.Logic.Operaciones;

import com.mycompany.calculadora.Logic.Interface.IOperacion;

/**
 *
 * @author Namiruneto
 */
public class Suma implements IOperacion{
    public double calcular(double  num1, double  num2){
        return num1 + num2;
    }
    
}
