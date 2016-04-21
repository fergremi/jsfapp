package com.ruprocon.jsfapp.ejb.jpa;

import java.util.List;

import javax.ejb.Stateless;

import org.hibernate.exception.DataException;

import com.ruprocon.jsfapp.ejb.interfaz.ProductoDAO;
import com.ruprocon.jsfapp.modelo.Producto;

@Stateless
public class ProductoFacade extends BaseFacade implements ProductoDAO {
	@SuppressWarnings("unchecked")
	public List<Producto> getProductos() {
        return getEntityManager().createQuery("select p from Producto p where p.activo=1 order by p.idProducto").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> getProductosAlquiler() throws DataException {
        return getEntityManager().createQuery("select p from Producto p where p.funcion=0 and p.activo=1 order by p.idProducto").getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Producto> getProductosVenta() throws DataException {
        return getEntityManager().createQuery("select p from Producto p where p.funcion=1 and p.activo=1 order by p.idProducto").getResultList();
	}
	
	public Producto getProducto(int idProducto) {
        return getEntityManager().find(Producto.class, idProducto);
	}
	
	public void guardarProducto(Producto producto) {
        getEntityManager().merge(producto); // merge and assign to the detached entity 
	}
    
	public void eliminarProducto(Producto producto) {    	
        producto = getEntityManager().merge(producto); // merge and assign to the attached entity 
        getEntityManager().remove(producto); // remove the attached entity 
	}
}
