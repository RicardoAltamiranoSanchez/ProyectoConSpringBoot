package com.spring.App.persistence;

import com.spring.App.domain.Product;
import com.spring.App.domain.repository.ProductRepository;
import com.spring.App.persistence.crud.ProductoCrudRepository;
import com.spring.App.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository //indicamos que es unrepository y va interatuar con nuestra base de datos
//se puede poner componet que generaliza para ser mas especificos ponemos repository
//importamos el ProductoRepository para hacer solo para el dominio
//y no manejar nuestra base de datos directamente
public class ProductoRepository implements ProductRepository {

    //importamos nuestra interfaz de producto para realizar las operaciones crud
    private ProductoCrudRepository productoCrudRepository;

//hacemos una lista de producto
    public List<Producto> ObtenerProductos(){

//lo casteamos por que es un iterable
        return (List<Producto>) productoCrudRepository.findAll();

    }

    public List<Producto> ObtenerCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc( idCategoria);
    }
    // nos devuelve los productos que casi no hay
    public Optional<List<Producto>> ObtenerAgotados(int cantidadStock ){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidadStock,true);

    }

   public Optional<Producto> ObtenerProducto(int idProducto){

        return productoCrudRepository.findById(idProducto);
   }
   public Producto nuevoProducto(Producto producto){

        return productoCrudRepository.save(producto);
   }

   public String eliminarProducto(int idProducto){
         productoCrudRepository.deleteById(idProducto);
        return "Producto Elimando con Exito";
   }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public List<Product> getCategory(int categoryId) {
        return null;
    }

    @Override
    public Optional<List<Producto>> getScarseProducts(int quantity) {
        return Optional.empty();
    }

    @Override
    public Optional<Producto> getProduct(int productId) {
        return Optional.empty();
    }

    @Override
    public Product newProduct(Product product) {
        return null;
    }

    @Override
    public String deleteProducto(int productId0) {
        return null;
    }
}
