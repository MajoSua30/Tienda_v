/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.repository;

/**
 *
 * @author María José
 */
import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author María José
 */
@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>{
  Persona findByNombre (String nombre);
  
}
