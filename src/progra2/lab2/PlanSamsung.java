/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.lab2;

import java.util.ArrayList;

public class PlanSamsung extends Plan {
    
    
    private String Pin;
    private ArrayList<Plan> bbm = new ArrayList();

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
        }
        return 40;
    }
    
    @Override
    public void imprimir(){
        
    }

    public String getPin() {
        return Pin;
    }
    
    
}