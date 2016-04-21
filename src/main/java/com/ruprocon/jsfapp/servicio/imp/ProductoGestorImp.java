package com.ruprocon.jsfapp.servicio.imp;

import java.util.List;

import com.ruprocon.jsfapp.servicio.interfaz.ProductoGestor;
import com.ruprocon.jsfapp.modelo.Producto;
import com.ruprocon.jsfapp.facade.interfaz.ProductoDAO;

@Component
public class ProductoGestorImp implements ProductoGestor {
	private static final long serialVersionUID = 1L;

	@Autowired
    private ProductoDAO productoDAO;
    
	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}
	
	public List<Producto> getProductos() {
		return productoDAO.getProductos();
	}

	public List<Producto> getProductosAlquiler() {
		return productoDAO.getProductosAlquiler();

	}

	public List<Producto> getProductosVenta() {
		return productoDAO.getProductosVenta();

	}
	
	public void actualizarProducto(Producto producto) {
		productoDAO.guardarProducto(producto);
    }

	public void eliminarProducto(Producto producto) {
		productoDAO.eliminarProducto(producto);
	}
}
