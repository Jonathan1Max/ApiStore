/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umg.edu.gt.progra.ApiStore.Model.Product;

/**
 *
 * @author J MAX
 */
@Repository
public interface IProductRepository extends JpaRepository<Product, Long>{
    
}
