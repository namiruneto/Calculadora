
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.Logic;
import java.util.Scanner;
import com.mycompany.calculadora.Logic.Operaciones.Suma;
import com.mycompany.calculadora.Logic.Interface.IOperacion;
import com.mycompany.calculadora.Logic.Operaciones.RaizCuadrada;
import com.mycompany.calculadora.Logic.Operaciones.Resta;
import com.mycompany.calculadora.Logic.Operaciones.Division;
import com.mycompany.calculadora.Logic.Operaciones.Multiplicacion;

/**
 *
 * @author Namiruneto
 */
public class EjecutorCalculadora {
    private Scanner scanner;
    private double num1 = 0;
    private double num2 = 0;
    
    public  EjecutorCalculadora(){
        this.scanner = new Scanner(System.in);
    }
    
    public  void Ejecutar()
    {
        System.out.println("Ingresar el primernúmero");
        num1 = obtenerNumero();
        
        System.out.println("Ingresar la operacion(+, -, *, /, sqrt): ");
        String operacion = scanner.next();
        
        IOperacion operacionSelecionada = obtenerOperacion(operacion);      
        num2 = (operacion.equals("sqrt")) ? 0 : obtenerNumero();
          
        double resultado = operacionSelecionada.calcular(num1, num2);
        System.out.println(resultado);
        
    }
    
    private double obtenerNumero()
    {
        while(!scanner.hasNextDouble()){
            System.out.println("Entrada no valida");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    
    private IOperacion obtenerOperacion(String operacion){
        switch (operacion) {
            case "+":
                return new Suma();   
            case "-":
                return new Resta();   
            case "*":
                return new Multiplicacion();   
            case "/":
                return new Division(); 
            case "sqrt":
                return new RaizCuadrada(); 
             default:
                    return null;
        }
        
    }
}
