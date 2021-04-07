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
public class AllVectors {
    private int time;
    private String[][] states;
    
    public AllVectors() {}
    
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
    
    public Vector getVector(int pos){
        if(states.length <= pos) return null;
        Vector vector;
        vector = new Vector(states[pos][1],states[pos][2], Double.parseDouble(states[pos][6]), Double.parseDouble(states[pos][5]), Double.parseDouble(states[pos][9]) );
        return vector;
    }
    
    public ArrayList<Vector> getVectors() {
        ArrayList<Vector> vectors = new ArrayList<>();

        for(int i=0; i<states.length; i++){
            vectors.add(new Vector(states[i][1],states[i][2], Double.parseDouble(states[i][6]), Double.parseDouble(states[i][5]), Double.parseDouble(states[i][9])));
        }
        
        return vectors;
    }
}
