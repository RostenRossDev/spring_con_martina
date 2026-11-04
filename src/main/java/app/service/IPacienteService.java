package app.service;

import java.util.List;

import app.entities.Paciente;

public interface IPacienteService { //en las interfaces van las definiciones de un metodo
	
	//	retorno del metodo		nombre del metodo			parametros del metodo
	    List<Paciente> 			findAll  					(/*lo que recibe el metodo*/);
	    
	    List<Paciente> findAllOrder();
	    List<Paciente> findByDni(String dni);
	    List<Paciente> findByDomainEmail(String domain);
	    Long countBy();
	    Paciente create(Paciente paciente) throws IllegalArgumentException;
	    Paciente update(Long id, Paciente paciente);
	    Paciente findById(Long id);
	    boolean existsById(Long id);
	    void deleteById(Long id);
	    List<Paciente> findActivos();
	    List<Paciente> findInactivos();
	    
	    
	    List<Paciente> buscarPorNombre(String nombre);
}
