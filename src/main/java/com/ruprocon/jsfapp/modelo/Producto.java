package com.ruprocon.jsfapp.modelo;
// Generated 02-sep-2015 2:09:05 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name="producto") 
public class Producto implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "idProducto")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProducto;
	
	private String nombre;
	private String descripcion;
	private float precio;
	private int stock;
	private String img;
	private String tipo;
	private boolean estado;
	private boolean funcion;

	private Set<Pedido> pedidos = new HashSet<Pedido>(0);

	public Producto() {
	}

	public Producto(String nombre, float precio, int stock, String tipo, boolean estado) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.tipo = tipo;
		this.estado = estado;
	}

	public Producto(String nombre, String descripcion, float precio, int stock, String img, String tipo, boolean estado,
			Set<Pedido> pedidos) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.img = img;
		this.tipo = tipo;
		this.estado = estado;
		this.pedidos = pedidos;
	}

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public boolean isFuncion() {
		return funcion;
	}

	public void setFuncion(boolean funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", stock=" + stock + ", img=" + img + ", tipo=" + tipo + ", estado=" + estado
				+ ", pedidos=" + pedidos + "]";
	}

}
