package com.ruprocon.jsfapp.facade.interfaz;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.exception.DataException;

import com.ruprocon.jsfapp.modelo.Factura;

public interface FacturaDAO {
	public static Logger log = Logger.getLogger(FacturaDAO.class);
	
    public List<Factura> getFacturas() throws DataException;
    public Factura getFactura(int numFactura) throws DataException;
    public void guardarFactura(Factura factura) throws DataException;
    public void eliminarFactura(Factura factura) throws DataException;
    public int obtenerNumUltimaFactura() throws DataException;
}
