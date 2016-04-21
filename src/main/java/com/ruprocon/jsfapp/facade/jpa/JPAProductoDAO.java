package com.ruprocon.jsfapp.facade.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ruprocon.jsfapp.controlador.CestaControlador;
import com.ruprocon.jsfapp.facade.interfaz.ProductoDAO;
import com.ruprocon.jsfapp.modelo.Producto;

@Repository(value = "productoDAO")
public class JPAProductoDAO implements ProductoDAO {
	private EntityManager em = null;
	
    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }
       
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Producto> getProductos() {
        return em.createQuery("select p from Producto p where p.activo=1 order by p.idProducto").getResultList();
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Producto> getProductosAlquiler() throws DataAccessException {
        return em.createQuery("select p from Producto p where p.funcion=0 and p.activo=1 order by p.idProducto").getResultList();
	}
	
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	public List<Producto> getProductosVenta() throws DataAccessException {
        return em.createQuery("select p from Producto p where p.funcion=1 and p.activo=1 order by p.idProducto").getResultList();
	}
	
	@Transactional(readOnly = true)
	public Producto getProducto(int idProducto) {
        return em.find(Producto.class, idProducto);
	}
	
    @Transactional(readOnly = false)
	public void guardarProducto(Producto producto) {
        em.merge(producto); // merge and assign to the detached entity 
	}
    
    @Transactional(readOnly = false)
	public void eliminarProducto(Producto producto) {    	
        producto = em.merge(producto); // merge and assign to the attached entity 
        em.remove(producto); // remove the attached entity 
	}
}
