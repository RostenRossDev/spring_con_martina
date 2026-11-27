package mapper;

import app.entities.Paciente;
import dto.DtoPaciente;

public class PacienteMapper {

	//Este metodo convierte una entidad PACIENTE en un pacienteDto
	public static DtoPaciente toDto(Paciente paciente) {
		
		DtoPaciente dtoPaciente = new DtoPaciente();
		
		dtoPaciente.setApellido(paciente.getApellido());
		dtoPaciente.setNombre(paciente.getNombre());
		dtoPaciente.setTelefono(paciente.getTelefono());
		
		return dtoPaciente;
	}
	
	
	//Este metodo convierte un dto PACIENTE en una entidad PACIENTE
	public static Paciente toEntity(DtoPaciente pacienteDto) {
		Paciente paciente = new Paciente();
		paciente.setNombre(pacienteDto.getNombre());
		paciente.setApellido(pacienteDto.getApellido());
		paciente.setTelefono(pacienteDto.getTelefono());
		
		return paciente;
	}
	
}
