/**
 * 
 */
package ar.fwkService.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ar.edu.service.fwk.contextAware.model.Contexto;
import ar.edu.service.fwk.contextAware.model.Dominio;
import ar.edu.service.fwk.contextAware.model.TipoContexto;
import ar.edu.service.fwk.contextAware.response.InformacionContextual;

/**
 * @author mariano
 *
 */
public class FwkServiceTest {

	private Logger logger = LoggerFactory.getLogger( getClass().getName() );
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		Dominio d = new Dominio();
		d.setNombre("UM");
		 
		//WIFI ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		TipoContexto tipo = new TipoContexto( "Wifi" );
		
		Map<String, Map<String , Object> > datosContexto = new HashMap<String, Map<String,Object>>();
		//Wifi UM1
		Map<String,Object> valoresContexto = new HashMap<String, Object>(); 
		valoresContexto.put("SSID", "UM1");
		valoresContexto.put("capabilities", "WEP");
		valoresContexto.put("frequency", "2412");
		valoresContexto.put("level", "-98");
		valoresContexto.put("BSSID", "04:c1:b9:90:21:fa");
		
		//Wifi UM2
		Map<String,Object> valoresContexto2 = new HashMap<String, Object>(); 
		valoresContexto2.put("SSID", "UM2");
		valoresContexto2.put("capabilities", "WPA");
		valoresContexto2.put("frequency", "2462");
		valoresContexto2.put("level", "-57");
		valoresContexto2.put("BSSID", "58:6d:8f:eb:1b:4b");
		
		datosContexto.put("UM1", valoresContexto);
		datosContexto.put("UM2", valoresContexto2);
		
		Contexto ctxWifi = new Contexto(tipo , datosContexto );
		
		//Bluetooth ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		TipoContexto tipoBlu = new TipoContexto( "Bluetooth" );
		
		Map<String, Map<String , Object> > datosContexto2 = new HashMap<String, Map<String,Object>>();
		//Bluetooth Blu1
		Map<String,Object> valoresContextoBlu = new HashMap<String, Object>(); 
		valoresContextoBlu.put("name", "GT-I8190L");
		valoresContextoBlu.put("Address", "B0:C4:E7:DB:B4:0D");
		valoresContextoBlu.put("RSSI", "-62");
		
		
		//Bluetooth Blu2
		Map<String,Object> valoresContextoBlu2 = new HashMap<String, Object>(); 
		valoresContextoBlu2.put("name", "GT-I8191L");
		valoresContextoBlu2.put("Address", "00:1A:DC:42:79:9C");
		valoresContextoBlu2.put("RSSI", "-33");
		
		
		datosContexto2.put("UM1-Blu", valoresContextoBlu);
		datosContexto2.put("UM2-Blu", valoresContextoBlu2);
		
		Contexto ctxBlu = new Contexto(tipoBlu , datosContexto2 );
		
		d.getContextos().add( ctxWifi );
		d.getContextos().add( ctxBlu);
		
		logger.info( "Datos del Dominio");
		logger.info( d.toString()  );
		
		//OutPut
		Map<String, Map<String , Object> > respuesta = new HashMap<String, Map<String,Object>>();
		
		Map<String , Object> valores = new HashMap<String, Object>();
		valores.put("tipo", "java.lang.Boolean");
		valores.put("valor", "True" );
		
		
		Map<String , Object> valores2 = new HashMap<String, Object>(); 
		valores2.put("tipo", "java.lang.String");
		valores2.put("valor", "4to Piso - Central" );
		
	
		Map<String , Object> valores3 = new HashMap<String, Object>();
		valores3.put("tipo", "java.lang.String");
		valores3.put("valor", "La Universidad de Moron la informa que el dia 8 de Diciembre permacera cerrada" );
		
		respuesta.put("ubicadoEnLaUM", valores);
		respuesta.put("ubicacion", valores2);
		respuesta.put("aviso", valores3);
		
		InformacionContextual infoCtx = new InformacionContextual( respuesta );
		
		logger.info( "Datos Respuesta");
		logger.info( infoCtx.toString()  );
	}

}
