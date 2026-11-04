package app.abstractClass;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public abstract class BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //IDENTITY significa AutoIncremental
	private Long id;
	
	@Column(updatable = false)  //Evita que la columna createAt sea modificada, este valor en la base de datos no cambia
	private LocalDateTime createdAt;  // created_at
	
	private LocalDateTime updatedAt;

	private Long version;
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@PrePersist   // -> Le dice al framework que ejecute este metodo antes de persistir el objeto en la base de datos
    protected void onCreate() {
        createdAt = LocalDateTime.now(); // Settea la fecha de creacion
        version = (long) 1;  // Settea el numero de modificaciones
    }

    @PreUpdate // -> Le dice al framework que ejecute este metodo antes de actualizar el objeto en la base de datos
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();  // Settea la fecha de actualizacion
        version = version + 1; // actualiza el numero de modificaciones
    }
	
}