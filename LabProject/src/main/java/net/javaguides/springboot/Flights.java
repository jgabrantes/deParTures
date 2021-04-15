/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

/**
 *
 * @author jgabrantes
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Flights {
    private int time;
    private String[][] states;
    
    public Flights() {}
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public String[][] getStates(){
        return states;
    }
    
    public void setStates(String[][] states){
        this.states = states;
    }
    
    public Airplane getVector(int pos){
        if(states.length <= pos) return null;
        Airplane vector;
        vector = new Airplane(states[pos][0], states[pos][1], Double.parseDouble(states[pos][6]),
                Double.parseDouble(states[pos][5]), states[pos][2], Float.parseFloat(states[pos][9]));
        return vector;
    }
    
    public ArrayList<Airplane> getFlights() {
        ArrayList<Airplane> vectors = new ArrayList<>();

        for(int i=0; i<states.length; i++){
            vectors.add(new Airplane(states[i][0], states[i][1], Double.parseDouble(states[i][6]),
                    Double.parseDouble(states[i][5]),states[i][2], Float.parseFloat(states[i][9])));
        }
        return vectors;
    }
}
