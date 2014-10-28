/**
 * 
 */
package ar.edu.service.fwk.contextAware.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mariano
 *
 */
public class Contexto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4685262144771171L;
	private TipoContexto tipo;
	private Map<String, Map<String, Object>> datosContexto = new HashMap<String, Map<String,Object>>();
	
	public Contexto(){}
	
	public Contexto( TipoContexto tipo, Map<String, Map<String, Object>> datosContexto ){
		this.tipo = tipo;
		this.datosContexto = datosContexto;
	}
	
	/**
	 * @return the tipo
	 */
	public TipoContexto getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoContexto tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the valoresContexto
	 */
	/**
	 * @return the datosContexto
	 */
	public Map<String, Map<String, Object>> getDatosContexto() {
		return datosContexto;
	}
	/**
	 * @param datosContexto the datosContexto to set
	 */
	public void setDatosContexto(Map<String, Map<String, Object>> datosContexto) {
		this.datosContexto = datosContexto;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contexto [tipo=" + tipo + ", datosContexto=" + datosContexto
				+ "]";
	}

	
}
