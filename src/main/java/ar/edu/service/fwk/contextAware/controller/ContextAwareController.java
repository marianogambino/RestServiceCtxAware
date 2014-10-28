/**
 * 
 */
package ar.edu.service.fwk.contextAware.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.edu.service.fwk.contextAware.model.Dominio;
import ar.edu.service.fwk.contextAware.response.InformacionContextual;

/**
 * @author MG10
 *
 */
@Controller
@RequestMapping("/service")
public class ContextAwareController {
	
	private Logger logger = LoggerFactory.getLogger( getClass().getName() );
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hola %s";
	
	
	
	@RequestMapping(value="/contexto" , method = RequestMethod.POST , headers = {"Content-type=application/json"})
	public @ResponseBody InformacionContextual consultarContexto( 
			@RequestBody Dominio dominio  ){
	
		
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
		
		logger.info( String.format("Dominio: %s", dominio ) );
		
		return infoCtx;
	}
	
	@RequestMapping(value="/contextoA" , method = RequestMethod.POST)
	public @ResponseBody InformacionContextual consultarContexto2( @RequestParam ( value="dominio" ) String dominio  )
					throws JsonParseException, JsonMappingException, IOException{
	
		
		Dominio dom = new ObjectMapper().readValue(dominio, Dominio.class);
		
		logger.info( String.format("JSON - Dominio: %s", dominio ) );
		logger.info( String.format("contextoB - Dominio: %s", dom ) );
		
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
		return infoCtx;
	}
	
	@RequestMapping(value="/contextoB" , method = RequestMethod.GET)
	public @ResponseBody InformacionContextual consultarContexto3( @RequestParam ( value="dominio" ) String dominio  )
					throws JsonParseException, JsonMappingException, IOException{
	
		
		Dominio dom = new ObjectMapper().readValue(dominio, Dominio.class);
		
		logger.info( String.format("JSON - Dominio: %s", dominio ) );
		logger.info( String.format("contextoB - Dominio: %s", dom ) );
		
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
		return infoCtx;
	}

}
