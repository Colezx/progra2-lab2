/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.lab2;

/**
 *
 * @author AdminColeexz
 */
public abstract class Plan {
  
    private String numerodetelefono;
    private String numerodecliente;

    public Plan(String numerodetelefono, String numerodecliente) {
        this.numerodetelefono = numerodetelefono;
        this.numerodecliente = numerodecliente;
    }

    public String getNumerodetelefono() {
        return numerodetelefono;
    }

    public String getNumerodecliente() {
        return numerodecliente;
    }
    
    abstract double pagoMensual(int mins, int msgs);
    
    abstract void imprimir();
    
    
}
