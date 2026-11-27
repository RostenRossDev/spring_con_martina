package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entities.Paciente;

// JPA -> jakarta persistence api
//JPA es el encargado de crear las consultas que van a la base de datos, las de busqueda, creacion, actualizacion y eliminacion
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	List<Paciente> findByOrderByApellidoAscNombreAsc(); //Trae la lista completa de pacientes ordenados por apellido de forma ascendente y nombre ascendente
	List<Paciente> findByDni(String dni); //Busca pacientes por su DNI
	List<Paciente> findByEmailEndingWith(String domain); //Busca los pacientes donde sus EMAILs terminen con el string indicado
	List<Paciente> findByActivoTrue(); //Busca todos los pacientes donde el atributo ACTIVO sea VERDADERO
	List<Paciente> findByActivoFalse(); //Busca todos los pacientes donde el atributo ACTIVO sea FALSO
	
	Long countBy();//Devuelve la cantidad de pacientes en la base de datos.
}
