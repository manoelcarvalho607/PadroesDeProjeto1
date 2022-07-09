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
public class CarMontadora extends Montadora {

    @Override
    Autos modeloAuto(String modeloSolicitado) {
        if ("A".equals(modeloSolicitado)) {
            return new Jeta(200, 2020, "blue", true);
        } else {
            return new Fusca(100, 1970, "white", false);
        }
    }

}
