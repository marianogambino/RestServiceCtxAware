/**
 * 
 */
package ar.edu.service.fwk.contextAware.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author mariano
 *
 */
public class Dominio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5919399565686230337L;
	private String nombre;
	private Set<Contexto> contextos = new HashSet<Contexto>();
	
	public Dominio(){}
	
	public Dominio(String nombre , Set<Contexto> contextos){
		this.nombre = nombre;
		this.contextos = contextos;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the contextos
	 */
	public Set<Contexto> getContextos() {
		return contextos;
	}
	/**
	 * @param contextos the contextos to set
	 */
	public void setContextos(Set<Contexto> contextos) {
		this.contextos = contextos;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dominio [nombre=" + nombre + ", contextos=" + contextos + "]";
	}
	

	
	
}
