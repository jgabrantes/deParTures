    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;

/**
 *
 * @author jgabrantes
 */
public class Airplane {
    private String callSign, originCountry;
    private double latitude, longitude;
    private float velocidade;

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public Airplane() {
    }

    public Airplane(String callSign, double latitude, double longitude, String originCountry, float velocidade) {
        this.callSign = callSign;
        this.latitude = latitude;
        this.longitude = longitude;
        this.originCountry = originCountry;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
    
        
    
}
