package com.spring.App.persistence.mapper;


import com.spring.App.domain.Product;
import com.spring.App.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

//Indicamos ene el uses que usea la categoryMapper por que en categoriaRelacion es de un entity
//Solo busca y nos los mappea
@Mapper(componentModel = "spring" ,uses = CategoryMapper.class)
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "idProducto" ,target="productId"),
            @Mapping(source = "nombre" ,target="name"),
            @Mapping(source = "idCategoria" ,target="categoryId"),
            @Mapping(source = "precioVenta" ,target="price"),
            @Mapping(source = "cantidadStock" ,target="stock"),
            @Mapping(source = "categoriaRelacion", target="category"),
            @Mapping(source = "estado" ,target="active"),

    })


    Product toProduct(Producto producto);
    List<Product> toProduct(List<Producto> productos);


    @InheritInverseConfiguration
    @Mapping(target ="codigoBarras",ignore = true )
    Producto toProducto(Product product);




}
