/**
 * 
 */
package ar.edu.service.fwk.contextAware.model;

import java.io.Serializable;

/**
 * @author mariano
 *
 */
public class TipoContexto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7911389486825415943L;
	private String tipo;

	public TipoContexto(){}
	
	public TipoContexto( String tipo){
		this.tipo = tipo;
	}
	
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TipoContexto [tipo=" + tipo + "]";
	}
	
	
}
