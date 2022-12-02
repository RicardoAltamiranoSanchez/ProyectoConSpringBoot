package com.spring.App.persistence.entity;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity //las entitys son objetos que van  a interactuar con nuestra base de datos
@Table(name="compras")// el nombre de la tabla que esta en nuestra base de datos va siempre en plural
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//se genera automaticamente con nuesta base de datos
    @Column(name="id_compra")
    private Integer idCompra;

    @Column(name="id_cliente")
    private String idCliente;

    private LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    private String comentario;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_cliente",insertable = false,updatable = false)
    private  Cliente cliente;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "productos")
    private List<CompraProducto> productos;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
