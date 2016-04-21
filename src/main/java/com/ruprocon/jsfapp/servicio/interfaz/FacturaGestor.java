package com.ruprocon.jsfapp.servicio.interfaz;

import java.io.Serializable;
import java.util.List;

import com.ruprocon.jsfapp.modelo.Factura;

public interface FacturaGestor extends Serializable {
	public List<Factura> getFacturas();
	public void actualizarFactura(Factura factura);
	public void eliminarFactura(Factura factura);
}