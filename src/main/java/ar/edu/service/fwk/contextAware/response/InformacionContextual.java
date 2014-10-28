/**
 * 
 */
package ar.edu.service.fwk.contextAware.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author mariano
 *
 */
public class InformacionContextual implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2162937193822561943L;
	private Map<String, Map<String, Object>> infoCtx = new HashMap<String, Map<String,Object>>();

	
	public InformacionContextual(){}
	
	public InformacionContextual(Map<String, Map<String, Object>> info){
		this.infoCtx = info;
	}

	/**
	 * @return the infoCtx
	 */
	public Map<String, Map<String, Object>> getInfoCtx() {
		return infoCtx;
	}

	/**
	 * @param infoCtx the infoCtx to set
	 */
	public void setInfoCtx(Map<String, Map<String, Object>> infoCtx) {
		this.infoCtx = infoCtx;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InformacionContextual [infoCtx=" + infoCtx + "]";
	}
	
	
}
