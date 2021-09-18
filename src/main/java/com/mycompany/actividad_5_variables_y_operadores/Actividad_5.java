/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad_5_variables_y_operadores;

/**
 *
 * @author AlanEduardo
 */
public class Actividad_5 {
    
    private int suma(int num1, int num2){
        int res = 0;
        
        res = num1 + num2;
        
        return res;
    }
    
    private int resta(int num1, int num2){
        int res = 0;
        
        res = num1 - num2;
        
        return res;
    }
    
    private int multip(int num1, int num2){
        int res = 0;
        
        res = num1 * num2;
        
        return res;
    }
    
    private float divid(float num1, float num2){
        float res = 0;
        
        res = num1 / num2;
        
        return res;
    }
    
    private float modulo(float num1, float num2){
        float res = 0;
        
        res = num1 % num2;
        
        return res;
    }
    
    public static void main(String[] args) {
        
        Actividad_5 obj = new Actividad_5();
        
        System.out.println("X = {10}");
        System.out.println("Y = {3}");
        System.out.println("Suma: {" + obj.suma(10, 3) + "}");
        System.out.println("Resta: {" + obj.resta(10, 3) + "}");
        System.out.println("Division: {" + obj.divid(10, 3) + "}");
        System.out.println("Multiplicacion: {" + obj.multip(10, 3) + "}");
        System.out.println("Modulo: {" + obj.modulo(10, 3) + "}");
    }
}
