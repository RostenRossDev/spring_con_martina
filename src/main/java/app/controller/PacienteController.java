package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.entities.Paciente;
import app.service.IPacienteService;
import jakarta.websocket.server.PathParam;

// API REST Representational State Transfer,
@RestController // Combierte la clase en un controlador REST -> Response TEXTO PLANO con formato
				// JSON
//@Controller // -> Convierte la clase en un controlador del tipo MVC (modelo vista controlador) -> Responde una pagina HTML

// lasTresMarias

// www.las-tres-marias.com
// www.las-tres-marias.com/doctor/ -> Mi controlador la ignora


//paciente/byNombre?nombre=Martina

@RequestMapping("/pacientes") // www.las-tres-marias.com/pacientes/ ->Esta es escuchada por el controlador
public class PacienteController {

	@Autowired
	IPacienteService pacienteService;
	
	
	//ENDPOINT
	@GetMapping("/byNombre")
	public ResponseEntity<?> pacientesPorNombre(@RequestParam(value = "nombre", required = false) String name) { // GET
		// www.las-tres-marias.com/paciente/byNombre?nombre=Martina
		//	       12858.5878.455:8080    /paciente/byNombre?nombre=Martina
		
		return new ResponseEntity<>(pacienteService.buscarPorNombre(name), HttpStatus.OK);
	}

	
	
}
