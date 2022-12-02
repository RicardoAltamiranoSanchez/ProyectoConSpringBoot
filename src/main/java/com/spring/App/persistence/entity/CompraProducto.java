package com.spring.App.persistence.entity;

import javax.persistence.*;
@Entity//debemos poner los Entity luego no funciona los @ManyToOne
public class CompraProducto {
    //Utilizamos para las llaves compuesta que realizamos
    @EmbeddedId//se utiliza para la clave principal compuesta. es decir, más de una columna se comporta conjuntamente como clave principal. Necesitamos crear una entidad como Embeddable y la entidad Embeddable se puede incrustar en otra entidad para lograr una clave primaria compuesta.
    private CompraProductoPK Id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra",insertable = false,updatable = false)
    private Compra compra;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Producto.class)
    @JoinColumn(name = "id_producto",insertable = false,updatable = false)
    private Producto productos;

    public CompraProductoPK getId() {
        return Id;
    }

    public void setId(CompraProductoPK id) {
        Id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
