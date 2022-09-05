/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clsinterfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ClsPersonas {
    public static List<ClsPersonas>Lista= new ArrayList();
    public static ClsPersonas per = new ClsPersonas();
    
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //elimine el @Override porque me tiraba error

    public void llenar_informacion() {
        ClsPersonas persona = new ClsPersonas();
        Scanner t = new Scanner(System.in);
        String arch;
        
         System.out.println("Ingresa un nombre de persona o de cosa que desea agregar: ");
        arch=t.nextLine();
        
       persona.Cargar_información(arch);
        System.out.println("Su informacion esta cargada");
        
        for(ClsPersonas v : Lista){
            
            System.out.println(v.getNombre());
            
            }
        System.out.println("\t");
        
        for(ClsPersonas v : Lista){
            
            arch= v.getNombre();
            per.guardar_información(arch);
            System.out.println("Sus datos han sido guardados correctamente: "+ v.getNombre());
            }
        
        
    }

    public void Cargar_información(String archivo) {
        File archivos = new File("C:\\Users\\Programacion 2\\Registros.txt");
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivos));
            String lectura;
            lectura = entrada.readLine();
            int NoLinea = 1;
            
            per.setNombre(archivo);
            Lista.add(per);
            per= new ClsPersonas();
            
            while (lectura!= null){                

                per.setNombre(lectura);
                Lista.add(per);
                lectura=entrada.readLine();
                per = new ClsPersonas();
                
                NoLinea++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            System.out.println("Su archivo se encontro");
        } catch (IOException ex){
            System.out.println("Tiene un problema en su archivo ");
        } 
    }

    public void guardar_información(String archivo) {
        File archivos = new File("C:\\Users\\Programacion 2\\Registros.txt");
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivos,true));
            String contenido = archivo;
            salida.println(contenido);
            salida.close();
            
        } catch (IOException e) {
            System.out.println(" Se encontro un error en abrir o ingresar un dato porfavor revise");
        }
        
    
    }
}
