/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MetodoBiblioteca;
import Vista.FRM_Biblioteca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Luis
 */
public abstract class controlador_FRM_Biblioteca implements ActionListener
{
    public MetodoBiblioteca metodoBiblioteca;
    FRM_Biblioteca frm_biblioteca;
    
    public controlador_FRM_Biblioteca(FRM_Biblioteca frm_biblioteca)
    {
        metodoBiblioteca =new MetodoBiblioteca();
        this.frm_biblioteca=frm_biblioteca;
    }
    public void ActionPerformed(ActionEvent f)
    {
        if(f.getActionCommand().equals("Agragar"))
        {
            MetodoBiblioteca.agregarBiblioteca(frm_biblioteca.devolverInformacion());
            frm_biblioteca.enseñarMsj("El libro ha sido agregado correctamente al sistema");
            frm_biblioteca.reset();
        }
    }
    
    public void ActionPerformed(ActionEvent f)
    {
        if(f.getActionCommand().equals("Buscar"))
        {
            MetodoBiblioteca.buscarBiblioteca(frm_biblioteca.devolverInformacion());
        }
    }
    
    public void ActionPerformed(ActionEvent f)
    {
        if(f.getActionCommand().equals("Modificar"))
        {
            MetodoBiblioteca.agregarBiblioteca(frm_biblioteca.devolverInformacion());
        }
    }
    
    public void ActionPerformed(ActionEvent f)
    {
        if(f.getActionCommand().equals("Eliminar"))
        {
            MetodoBiblioteca.agregarBiblioteca(frm_biblioteca.devolverInformacion());
        }
    }
}
