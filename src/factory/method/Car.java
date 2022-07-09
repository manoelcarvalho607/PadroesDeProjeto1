/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
//product concret
public class Car extends Autos {
    
     String color;
        boolean automatic;
        
    public Car(int horsePower, int year, String color, boolean automatic){
        super(horsePower, year);
        this.color = color;
        this.automatic = automatic;
    }

    
    
    
     public void transmission(){
        System.out.println(" The car is automatic transmission:  " + automatic );
    }
}
