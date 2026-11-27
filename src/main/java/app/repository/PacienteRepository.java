package app.repository;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import app.entities.Paciente;


//JPA es el encargado de crear las consultas que van a la base de datos, las de busqueda, creacion, actualizacion y eliminacion
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
	

}
