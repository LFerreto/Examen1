/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis
 */
public class Biblioteca 
{
    private String numeroPrestamo;
    private String usuario;
    private String cedula;
    private String isbn;

    public Biblioteca(String numeroPrestamo, String usuario, String cedula, String isbn) {
        this.numeroPrestamo = numeroPrestamo;
        this.usuario = usuario;
        this.cedula = cedula;
        this.isbn = isbn;
    }

  
    
    
    
    public String Informacion()
    {
        return "Numero de Prestamo: "+getNumeroPrestamo()+"Nombre de Usuario: "+getUsuario()+"Cedula de Usuario: "+getCedula()+"ISBN del Libro: "+getIsbn(); 
    }

    /**
     * @return the numeroPrestamo
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * @param numeroPrestamo the numeroPrestamo to set
     */
    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
