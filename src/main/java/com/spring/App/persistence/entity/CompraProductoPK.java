package com.spring.App.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable//Con esta anotación, indicamos que la clase puede ser «integrable» dentro de una entidad. que la puede usar una Entityt sin importala
//La serialización es el proceso de serialización del estado de un objeto representado y almacenado en forma de una secuencia de bytes. Esto se puede almacenar
//eun archivo. El proceso para leer el estado del objeto desde el archivo y restaurarlo se llama deserialización.


public class CompraProductoPK implements Serializable {


    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_producto")
    private Integer producto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }
}
