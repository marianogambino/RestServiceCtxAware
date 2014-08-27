/**
 * 
 */
package ar.fwkService.contextAware.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ar.fwkService.contextAware.response.ContextAwareResponse;
import ar.fwkService.contextAware.response.JSONResponse;

/**
 * @author MG10
 *
 */
@Controller
@RequestMapping("/service")
public class ContextAwareController {
	
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hola %s";
	
	
	
	@RequestMapping(value="/contexto" , method = RequestMethod.GET)
	public @ResponseBody ContextAwareResponse consultarContexto( 
			@RequestParam ( value="name", required=false, defaultValue="World" ) String name  ){
	
		ContextAwareResponse resp = new ContextAwareResponse(counter.incrementAndGet(), 
				String.format(template, name ) );
		return resp;
	}
	


}
