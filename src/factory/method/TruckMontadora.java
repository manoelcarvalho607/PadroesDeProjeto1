/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
//create concrect
public class TruckMontadora extends Montadora {

    @Override
    Autos modeloAuto(String modeloSolicitado) {
        if ("A".equals(modeloSolicitado)) {
            return new Volvo(200, 2020, "blue", true);
        } else {
            return new Scania(200, 1980, "white", false);
        }
    }

}
