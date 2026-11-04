package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entities.Paciente;
import app.repository.PacienteRepository;

@Service
public class PacienteService  implements IPacienteService {

	@Autowired
	private PacienteRepository repository;

	@Override
	public List<Paciente> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Paciente> findAllOrder() {
		// TODO Auto-generated method stub
		return null; //repository.findByApellidoAscNombreAsc("");
	}

	@Override
	public List<Paciente> findByDni(String dni) {
		// TODO Auto-generated method stub
		
		return repository.findByDni(dni);
	}

	@Override
	public List<Paciente> findByDomainEmail(String domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long countBy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente create(Paciente paciente) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente update(Long id, Paciente paciente) {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public List<Paciente> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		
		//Primer paso busco toda la lista
		List<Paciente> pacientes = repository.findAll();
		

		//Segundo paso filtro los pacientes que tienen el nombre que busco 
		List<Paciente> pacientesFiltrados = new ArrayList<>();
		
		for(Paciente paciente: pacientes) {
			if(paciente.getNombre().equalsIgnoreCase(nombre)) {
				pacientesFiltrados.add(paciente);
			}
		}
		
		
		System.out.println(pacientesFiltrados);
		return pacientesFiltrados;
	}





	
	
}
