package app.service;

import java.util.List;

import app.entities.Paciente;
import dto.DtoPaciente;

public interface IPacienteService { //en las interfaces van las definiciones de un metodo
	
    List<Paciente> findAll();
    List<Paciente> findAllOrder();
    List<Paciente> findByDni(String dni);
    List<Paciente> findByDomainEmail(String domain);
    Long countBy();
    Paciente create(Paciente paciente);
    Paciente update(Long id, Paciente paciente);
    Paciente findById(Long id);
    boolean existsById(Long id);
    void deleteById(Long id);
    List<Paciente> findActivos();
    List<Paciente> findInactivos();
}
