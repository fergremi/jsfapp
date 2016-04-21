package com.ruprocon.jsfapp.servicio.interfaz;

import java.io.Serializable;
import java.util.List;

import com.ruprocon.jsfapp.modelo.Pedido;

public interface PedidoGestor extends Serializable {
	public List<Pedido> getPedidos();
	public void actualizarPedido(Pedido pedido);
	public void eliminarPedido(Pedido pedido);
}
