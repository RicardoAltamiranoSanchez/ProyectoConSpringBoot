package com.spring.App.domain.repository;

import com.spring.App.domain.Product;
import com.spring.App.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    List<Product> getCategory(int categoryId);
   Optional<List<Producto>> getScarseProducts(int quantity );
   Optional<Producto> getProduct(int productId );
   Product newProduct(Product product);
   String deleteProducto(int productId0);
}
