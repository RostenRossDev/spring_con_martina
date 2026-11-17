package dto;

import java.time.Instant;

public class ApiResponseSuccessDto<T> {

	private boolean success;
	
	private String message;
	
	//En data guardamos la informacion que realmente nos solicitaron
	private T data;  //T, P, I,  representa CUALQUIER TIPO DE CLASE, se les llama GENERICOS
	
	private Instant timestamp; //Es una fecha que indica cuando se obtuvo la respuesta
	
	public ApiResponseSuccessDto() {
		this.timestamp = Instant.now();
	}
	
    public ApiResponseSuccessDto(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.timestamp = Instant.now();
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
    
    
	
}
