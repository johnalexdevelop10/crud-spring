package com.agencia.crud.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {



private final ProductService productService;

@Autowired
    public ProductController(ProductService productService){
    this.productService = productService;
}

@GetMapping
    public List<Product> getProducts(){
    return this.productService.getProducts();
}

@PostMapping
    public ResponseEntity<Object> registrarProduct(@RequestBody Product product){
       return this.productService.newProduct(product);
}
}
//aqui hacemos inyeccion de dependencias, que es inyectar esta clase al constuctor
//esta conectado service con este controlador y tenemos a this = que es el objeto inyectado