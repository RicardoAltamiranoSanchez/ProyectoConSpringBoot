package com.spring.App.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indicamos que es nuestra llave primaria
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;//no ponemos el nombre de la columna por que es el mismo nombre

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras", length = 150)
    private String codigoBarras;

    @Column(name = "precio_venta", length = 16)
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    @ManyToOne//debemos tener cuidado de poner@MantToOne debemos definir bien lo que estamos haciendo ejemplo de uno a mucho s a muchos a muchos
    //indicamos que va ser una relacion a otra tabla con la de categoria y que es de muchos a uno
    //con el JoinColumn mandamos a llamar ala columna que tiene relacion y ponemos el nombre como
    //esta en nuestra base de datos y pones los parametreo en false para que no haga cambios solo es de lectura
    @JoinColumn(name="id_categoria" ,insertable = false,updatable = false)
    private Categoria categoriaRelacion;//Creamos un tipo de Categoira con nuesta relacion

    private Boolean estado;//no ponemos el nombre de la columna por que es el mismo nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }


    public String getNombre() {
        return nombre;
    }


    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public Categoria getCategoriaRelacion() {
        return categoriaRelacion;
    }

    public void setCategoriaRelacion(Categoria categoriaRelacion) {
        this.categoriaRelacion = categoriaRelacion;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}
