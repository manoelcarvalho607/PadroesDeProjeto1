/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory.method;

/**
 *
 * @author visitante
 */
public class Client {
    
    private String modelAuto;
    private boolean typeAuto;
    
    
    public Client( String modelAuto, boolean typeAuto ){
        this.modelAuto= modelAuto;
        this.typeAuto = typeAuto;
    }
    
    public boolean typeAuto() {
        return typeAuto;
    }
    
    public String getModelAuto() {
        return modelAuto;
    }
    
    public String setModelAuto() {
        return modelAuto;
    }
    
}
