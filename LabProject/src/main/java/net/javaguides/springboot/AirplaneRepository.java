/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.javaguides.springboot;


import net.javaguides.springboot.Airplane;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jgabrantes
 */
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    
}
