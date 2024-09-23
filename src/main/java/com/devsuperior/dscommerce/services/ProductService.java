package com.devsuperior.dscommerce.services;

import com.devsuperior.dscommerce.dto.ProductDTO;
import com.devsuperior.dscommerce.entities.Product;
import com.devsuperior.dscommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO findById(Long id) {
        /* Forma didática para aprendizado

        Optional<Product> result = repository.findById(id);

        Product product = result.get();
        ProductDTO dto = new ProductDTO(product);
        return dto;
         */

        /* Forma resumida para o dia a dia*/

        Product product = repository.findById(id).get();
        return new ProductDTO(product);
    }
}
