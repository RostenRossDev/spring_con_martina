package app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entities.Paciente;
import app.exception.ResourceNotFoundException;
import app.repository.PacienteRepository;
import app.service.IPacienteService;
import dto.DtoPaciente;
import mapper.PacienteMapper;

@Service
public class PacienteService  implements IPacienteService {

	@Autowired
	private PacienteRepository repository;
	
	@Override
	public List<Paciente> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Paciente> findAllOrder() {
		return repository.findByOrderByApellidoAscNombreAsc();
	}

	@Override
	public List<Paciente> findByDni(String dni) {
		return repository.findByDni(dni);
	}

	@Override
	public List<Paciente> findByDomainEmail(String domain) {
		return repository.findByEmailEndingWith(domain);
	}  


	@Override
	public Long countBy() {
		return repository.countBy();
	}

	@Override
	public Paciente create(Paciente paciente) {
		// TODO Auto-generated method stub
		return repository.save(paciente);
	}

	@Override
	public Paciente update(Long id, Paciente paciente) {
		 
		//Busca el paciente si existe
		Paciente existente = repository.findById(id)
	                .orElseThrow(() -> new ResourceNotFoundException("Paciente no encontrado con id " + id));
		
		 // actualizar campos
        existente.setNombre(paciente.getNombre());
        existente.setApellido(paciente.getApellido());
        existente.setDni(paciente.getDni());
        existente.setEmail(paciente.getEmail());
        existente.setFechaNacimiento(paciente.getFechaNacimiento());
        existente.setTelefono(paciente.getTelefono());
   
		return repository.save(existente);
	}

	@Override
	public Paciente findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Paciente> findActivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Paciente> findInactivos() {
		// TODO Auto-generated method stub
		return null;
	}

	





	
	
}