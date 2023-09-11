/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author lara
 */
public class Conversor {
    private double yourTemp;
    private double foreignTemp;
    private int conversaoTipo;
    
    public double convert(double conversaoTipo, double foreignTemp){
        if(conversaoTipo == 1){//farenheit to celcius
            this.foreignTemp = foreignTemp;
            this.yourTemp = (foreignTemp - 32) / 1.8;
        } else
            if(conversaoTipo == 2){//celcius to farenheit
               this.foreignTemp = foreignTemp;
               this.yourTemp = (foreignTemp * 1.8) + 32;
            }
        return this.yourTemp;
    }

    public double getYourTemp() {
        return yourTemp;
    }

    public double getForeignTemp() {
        return foreignTemp;
    }

    public int getConversaoTipo() {
        return conversaoTipo;
    }
    
    
}
