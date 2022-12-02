package com.spring.App.persistence.crud;

import com.spring.App.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//hacemos una interfaz de Crud para producto indiamos primero el nombre del entity o clase y el tipo del id que tiene este mismo
public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
  //hacemos un query indicamos primero el metodo que es findAllBy depues ponemos por que columna lo va buscar
    //el nombre de la variable en mayusculas y ponemos como lo va ordenar por nombre debe inciar con mayusculas
    // y dentro de losparentesis es normal
    public List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

//indicamos que va ser de tipo opcion en un lista de productos
    //y los buscamos por la cantidad y el LessThan es para que nos devuel de menor a mayor
    // y El and es que tambien solo nos traiga solo los activos
    public Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);


}
