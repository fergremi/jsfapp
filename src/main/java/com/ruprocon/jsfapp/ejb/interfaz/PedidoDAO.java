package com.ruprocon.jsfapp.ejb.interfaz;

import java.util.List;

import javax.ejb.Remote;

import org.apache.log4j.Logger;
import org.hibernate.exception.DataException;

import com.ruprocon.jsfapp.modelo.Pedido;

@Remote
public interface PedidoDAO {
	public static Logger log = Logger.getLogger(PedidoDAO.class);
	
    public List<Pedido> getPedidos() throws DataException;
    public Pedido getPedido(int numFactura) throws DataException;
    public void guardarPedido(Pedido pedido) throws DataException;
    public void eliminarPedido(Pedido pedido) throws DataException;
}
