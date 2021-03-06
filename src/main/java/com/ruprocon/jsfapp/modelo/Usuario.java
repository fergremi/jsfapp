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
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario") 
public class Usuario implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "idUsuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUsuario;
	
	private String usuario;
	private String clave;
	private String rol;
	private boolean estado;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String provincia;
	private String ciudad;
	private Integer cp;
	private Integer telefono;
	private Set<Factura> facturas = new HashSet<Factura>(0);

	public Usuario() {
	}

	public Usuario(String usuario, String clave, String rol, boolean estado) {
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
		this.estado = estado;
	}

	public Usuario(String usuario, String clave, String rol, boolean estado, String nombre, String apellidos,
			String direccion, String provincia, String ciudad, Integer cp, Integer telefono, Set<Factura> facturas) {
		this.usuario = usuario;
		this.clave = clave;
		this.rol = rol;
		this.estado = estado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.cp = cp;
		this.telefono = telefono;
		this.facturas = facturas;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public boolean isEstado() {
		return this.estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getCp() {
		return this.cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public Integer getTelefono() {
		return this.telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Set<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(Set<Factura> facturas) {
		this.facturas = facturas;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", usuario=" + usuario + ", clave=" + clave + ", rol=" + rol
				+ ", estado=" + estado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", provincia=" + provincia + ", ciudad=" + ciudad + ", cp=" + cp + ", telefono=" + telefono
				+ ", facturas=" + facturas + "]";
	}

}
