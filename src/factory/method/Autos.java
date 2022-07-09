/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
//produto abstrato
public abstract class Autos {

    private int horsePower;
    private int year;

    public Autos(int horsePower, int year) {
        this.horsePower = horsePower;
        this.year = year;

    }

    public void year() {
        System.out.println("Year of manufacture " + year);
    }
    
     public void starEngine(){
        System.out.println(" Model Car: " + getClass().getSimpleName());
        System.out.println(" year of manufacture: " + year);
    }

}
