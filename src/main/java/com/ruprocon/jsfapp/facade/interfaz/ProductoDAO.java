package com.ruprocon.jsfapp.facade.interfaz;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.exception.DataException;

import com.ruprocon.jsfapp.modelo.Producto;

public interface ProductoDAO {
	public static Logger log = Logger.getLogger(ProductoDAO.class);
	
    public List<Producto> getProductos() throws DataException;
    public List<Producto> getProductosAlquiler() throws DataException;
    public List<Producto> getProductosVenta() throws DataException;
    public Producto getProducto(int idProducto) throws DataException;
    public void guardarProducto(Producto producto) throws DataException;
    public void eliminarProducto(Producto producto) throws DataException;
}
