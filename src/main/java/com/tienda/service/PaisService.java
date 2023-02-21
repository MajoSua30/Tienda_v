
package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author María José
 */
@Service
public class PaisService implements IPaisService{
   @Autowired
   private PaisRepository paisRepository;
   @Override
   public List<Pais>listCountry(){
       return (List<Pais>)paisRepository.findAll();}
}
