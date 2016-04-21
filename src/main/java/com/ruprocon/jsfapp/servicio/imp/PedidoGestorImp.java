package com.ruprocon.jsfapp.servicio.imp;

import java.util.List;

import com.ruprocon.jsfapp.servicio.interfaz.PedidoGestor;
import com.ruprocon.jsfapp.modelo.Pedido;
import com.ruprocon.jsfapp.facade.interfaz.PedidoDAO;

@Component
public class PedidoGestorImp implements PedidoGestor {
	private static final long serialVersionUID = 1L;

	@Autowired
    private PedidoDAO pedidoDAO;
    
	public void setPedidoDAO(PedidoDAO pedidoDAO) {
		this.pedidoDAO = pedidoDAO;
	}

	public List<Pedido> getPedidos() {
		return pedidoDAO.getPedidos();
	}

	public void actualizarPedido(Pedido pedido) {
		pedidoDAO.guardarPedido(pedido);
	}

	public void eliminarPedido(Pedido pedido) {
		pedidoDAO.eliminarPedido(pedido);
	}
}
