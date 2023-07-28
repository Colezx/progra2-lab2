/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.lab2;

import java.util.ArrayList;

public class PlanSamsung extends Plan {
    
    
    private String Pin;
    private ArrayList<String> bbm = new ArrayList();

    public PlanSamsung(String Pin, String numerodetelefono, String numerodecliente) {
        super(numerodetelefono, numerodecliente);
        this.Pin = Pin;
        this.bbm = new ArrayList();
    }
    
    @Override
    public double pagoMensual(int mins, int msgs){
        int minut,messages;
        if(mins>200&msgs>300){
            minut = mins-200;
            messages = msgs-300;
            return 40+minut*0.8+0.2*messages;
        }
        return 40;
    }
    
    @Override
    public void imprimir(){
        Plan pl = new PlanSamsung (Pin, super.getNumerodetelefono(), super.getNumerodecliente());
        pl.imprimir();
        System.out.println("Pin: " + Pin);
    }

    public String getPin() {
        return Pin;
    }
    
    public void agregarPinAmigo(String pin){
        agregarPinAmigo(0,pin);
    }
    
    private void agregarPinAmigo(int count, String pin){
        if(!bbm.get(0).equals(pin)){
            bbm.add(pin);
            return;
        } else {
            agregarPinAmigo(count+1,pin);
        }
    }
    
    
    
}