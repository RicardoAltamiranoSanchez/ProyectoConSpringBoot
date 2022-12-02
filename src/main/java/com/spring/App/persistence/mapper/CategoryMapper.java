package com.spring.App.persistence.mapper;


import com.spring.App.domain.Category;
import com.spring.App.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
//Mapper se usa para convertira de un objeto a un dTO
//Mandamos a llamar el componete @Mappper
@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //@Mappings es para hacer la conversion de los valores en source
    //indicamos el valor de la base de datos o el Entity y el target seria el dto
    @Mappings({
            @Mapping( source = "idCategoria",target = "categoryId"),
            @Mapping( source = "descripcion",target = "description"),
            @Mapping( source = "estado",target = "active"),
    })
    //Aqui añadimos el tipo y el nombre y los parametros de nuesta conversion
    // es de tipo Categori  y recibe una categoria para convertirla a category
    Category toCategory (Categoria categoria);

    //@InheritInverseConfiguration es para decir que haga el mappeo pero a inverso ya sin
    //necesidad de poner los Mappings
    @InheritInverseConfiguration
    //De decimos que al momento de hacer el mapping que nos ignore o que no va ir el valor de los productos
    @Mapping(target="productos",ignore=true)
    Categoria toCategoria(Category category);

}
