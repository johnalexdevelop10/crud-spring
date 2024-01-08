package com.agencia.crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
       //return List.of(
               // new Product(
                        //23456L,
                        //"lapto Mac",
                        //4550,
                        //LocalDate.of(2025, Month.APRIL,8),
                        //3
                //));
        return this.productRepository.findAll();
    }

    public ResponseEntity<Object> newProduct(Product product) {
      Optional<Product> res = productRepository.findProductByName(product.getName());
        HashMap<String, Object> datos = new HashMap<>();


      if (res.isPresent()){
          datos.put("error",true);
          datos.put("message","ya existe product");
          return new ResponseEntity<>(
                  datos,
                  HttpStatus.CONFLICT
          );
      }
      productRepository.save(product);
        datos.put("data",datos);
        datos.put("message","ya existe product");
        return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
    }
}
//service: pone esta capa al servicio del controlador y el controladro no tener informacion
//autoride = inyectar las dependencias