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
public class Vector {
    private String callSign, origininCountry;
    private double latitude, longitude, originCountry;

    public Vector() {
    }

    public Vector(String callSign, String origininCountry, double latitude, double longitude, double originCountry) {
        this.callSign = callSign;
        this.origininCountry = origininCountry;
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

    public String getOrigininCountry() {
        return origininCountry;
    }

    public void setOrigininCountry(String origininCountry) {
        this.origininCountry = origininCountry;
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

    public double getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(double originCountry) {
        this.originCountry = originCountry;
    }
    
        
    
}
