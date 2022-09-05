/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clsinterfaces;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ClsVendedores {
    
    private String nombre;
    private double Enero;
    private double Febrero;
    private double Marzo;
    
    public void llenarinformacion(){
        Scanner t = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        setNombre(t.nextLine());
        System.out.println("Ingrese a Enero");
        Enero= Double.valueOf(t.nextLine());
        System.out.println("Ingrese a Febrero");
        Febrero=t.nextDouble();
        System.out.println("Ingrese a Marzo");
        Marzo= t.nextDouble();
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Enero
     */
    public double getEnero() {
        return Enero;
    }

    /**
     * @param Enero the Enero to set
     */
    public void setEnero(double Enero) {
        this.Enero = Enero;
    }

    /**
     * @return the Febrero
     */
    public double getFebrero() {
        return Febrero;
    }

    /**
     * @param Febrero the Febrero to set
     */
    public void setFebrero(double Febrero) {
        this.Febrero = Febrero;
    }

    /**
     * @return the Marzo
     */
    public double getMarzo() {
        return Marzo;
    }

    /**
     * @param Marzo the Marzo to set
     */
    public void setMarzo(double Marzo) {
        this.Marzo = Marzo;
    }
    
}
