/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2.lab2;

import java.util.ArrayList;

public class Tigo {
    
    public ArrayList<Plan> planes = new ArrayList();
    
    public void AgregarPlan(int numeroTel,String nombre, String extra,String tipo){
        AgregarPlan(0,numeroTel,nombre,extra,tipo);
    }
    
    private void AgregarPlan(int count, int numeroTel, String nombre, String extra, String tipo){
        if(tipo.equals("Iphone")||tipo.equals("Samsung")){
            if(tipo.equals("Iphone")){
                if(planes.get(count).toString().isEmpty()){
                        Plan iphone= new PlanIphone(String.valueOf(numeroTel), nombre, extra);
                        planes.add(count,iphone);
                } 
            }else if (tipo.equals("Samsung")){
                if(planes.get(count).toString().isEmpty()){
                    Plan samsung = new PlanSamsung(String.valueOf(numeroTel),nombre,extra);
                    planes.add(count,samsung);
                }
            } 
        }
    }
    
    public boolean busqueda(int numeroTel, String datoExtra, String tipo){
        
       for (Plan pl : planes){
           if(pl.getNumerodetelefono().equals(numeroTel) || pl. || plsamsung.getPin().equals(datoExtra))
               return true;
           
       }
       return false;
    }
    
    
}
