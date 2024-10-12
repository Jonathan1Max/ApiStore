/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra.ApiStore.Service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.edu.gt.progra.ApiStore.Model.Product;
import umg.edu.gt.progra.ApiStore.Repository.IProductRepository;

/**
 *
 * @author J MAX
 */
@Service
public class ProductService {
    
    private static final Logger logger = Logger.getLogger(ProductService.class);
    
    @Autowired
    private IProductRepository iproductRepository;
    
    public List<Product> findAll() {
        logger.info("prepare find All");
        return iproductRepository.findAll();
    }
    
    public Optional<Product> findById(Long productId) {
        return iproductRepository.findById(productId);
    }
        
    public Product save(Product product) {
        return iproductRepository.save(product);
    }
        
        public boolean deleteById(Long productId) {
            if(iproductRepository.existsById(productId)){
                iproductRepository.deleteById(productId);
                return true;
        }
            return false;
    }
        
        public Optional<Product> update(Long productId, Product product) {
            Optional<Product> existingProduct = findById(productId);
            if(existingProduct.isPresent()) {
                Product p = existingProduct.get();
                p.setName(product.getName());
                p.setDescription(product.getDescription());
                p.setPrice(product.getPrice());
                return Optional.of(iproductRepository.save(p));
            }
            return Optional.empty();
        }
    }