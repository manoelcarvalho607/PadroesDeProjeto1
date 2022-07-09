/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
// criador concreto com parametro
public class ConcessionariaApp {

   
    public static void main(String[] args) {
        //na linha abaixo o new client escolhe o modelo e o tipo do auto (truck ou car)
        Client client = new Client("A", false);
        Montadora montadora = getMontadora(client);
        Autos autos = montadora.modeloAuto(client.getModelAuto());
        autos.starEngine();
    }

    

    private static Montadora getMontadora(Client client) {
        if (client.typeAuto()) {
            return new TruckMontadora();
        } else if (client.typeAuto() == false) {
            return new CarMontadora();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
