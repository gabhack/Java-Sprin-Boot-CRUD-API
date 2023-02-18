package com.demo.ejercicio.Persistence.Entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoPK id;
    @ManyToOne
    @JoinColumn(name="id_producto", insertable = false, updatable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name="id_compra", insertable = false, updatable = false)
    private Compra compra;


    private int cantidad;
    private BigDecimal total;
    private Boolean estado;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
               return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}