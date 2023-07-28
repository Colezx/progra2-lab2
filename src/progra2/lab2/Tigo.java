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
        if(planes.get(count).toString().isEmpty()){
            Plan info= new Plan(numeroTel,nombre);
            planes.add(count,info);
        }
    }
    
    
    
    
}
