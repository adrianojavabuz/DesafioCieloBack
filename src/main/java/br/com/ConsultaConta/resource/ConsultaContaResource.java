package br.com.ConsultaConta.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ConsultaConta.util.JSONRead;
import br.com.ConsultaConta.util.ServicePath;

@RestController
@RequestMapping(path = ServicePath.CONSULTA_PATH)
public class ConsultaContaResource {

 	@Autowired
   	private JSONRead jsonread;
   	
   	  @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
   	   public ResponseEntity consulta()
   	   {
   		
   		  if(jsonread.lerarquivo() == null){
   			  
   			  return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
   		  }
   		  
   	      return new ResponseEntity<>(jsonread.lerarquivo(), HttpStatus.OK);
   	   }

   
}
