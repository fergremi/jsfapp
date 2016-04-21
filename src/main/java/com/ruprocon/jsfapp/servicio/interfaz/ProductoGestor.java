package com.ruprocon.jsfapp.servicio.interfaz;

import java.io.Serializable;
import java.util.List;

import com.ruprocon.jsfapp.modelo.Producto;

public interface ProductoGestor extends Serializable {
	public List<Producto> getProductos();
	public List<Producto> getProductosAlquiler();
	public List<Producto> getProductosVenta();
	public void actualizarProducto(Producto producto);
	public void eliminarProducto(Producto producto);
}
