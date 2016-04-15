/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */

public class MetodoBiblioteca
{
    private ArrayList<Biblioteca> arrayBiblioteca;
    String arregloInformacion[]= new String[3];
   
    public MetodoBiblioteca()
    {
        arrayBiblioteca=new ArrayList<Biblioteca>();
    }
    
    public void AgregrarBiblioteca(String informacion[])
    {
       Biblioteca tempo= new Biblioteca(informacion[0], informacion[1], informacion[2], informacion[3]);
        
        arrayBiblioteca.add(tempo);
    }
     public void mostrarInformacion()
     {
         for(int contador=0; contador<arrayBiblioteca.size(); contador++)
         {
             System.out.println(arrayBiblioteca.get(contador).Informacion());
         }
     }
    public boolean consultarPrestamo(String getNumeroPrestamo)
    {
        boolean existe=false;
        for(int contador=0; contador<arrayBiblioteca.size(); contador++)
        {
             //   System.out.println(arrayBiblioteca.get(contador)getInformacion());
         
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(getNumeroPrestamo))
            {
                arregloInformacion[0]= arrayBiblioteca.get(contador).getUsuario();
                arregloInformacion[1]= arrayBiblioteca.get(contador).getCedula();
                arregloInformacion[2]= arrayBiblioteca.get(contador).getIsbn();
            
                existe=true;
            }
        }
        return existe;
    }
    
    public void modificarBiblioteca(String arraglo[])
    {
         for(int contador=0; contador<arrayBiblioteca.size(); contador++)
        {
             //   System.out.println(arrayBiblioteca.get(contador)getInformacion());
         
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(arraglo[0]))
            {
                arrayBiblioteca.get(contador).setUsuario(arraglo[1]);
                arrayBiblioteca.get(contador).setCedula(arraglo[2]);
                arrayBiblioteca.get(contador).setIsbn(arraglo[3]); 
            }
        }
    }
    public void eliminarBiblioteca(String arraglo[])
    {
        for(int contador=0; contador<arrayBiblioteca.size(); contador++)
        {
             //   System.out.println(arrayBiblioteca.get(contador)getInformacion());
         
            if(arrayBiblioteca.get(contador).getNumeroPrestamo().equals(arraglo[0]))
            {
                arrayBiblioteca.remove(contador);
            }
        }
    }
    public String[] getarregloInformacion()
    {
        return
        this.arregloInformacion;
    }
}
