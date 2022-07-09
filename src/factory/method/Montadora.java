/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
//create abstract
public abstract class Montadora {
    
     private Autos criador(String modeloSolicitado) {
        Autos auto = modeloAuto(modeloSolicitado);
        auto = preparandoCar(auto);
        return auto;
    }
    
    private Autos preparandoCar(Autos auto){
        auto.year();
     
        return auto;
    }
    
    abstract Autos modeloAuto(String modeloSolicitado);
    
}
