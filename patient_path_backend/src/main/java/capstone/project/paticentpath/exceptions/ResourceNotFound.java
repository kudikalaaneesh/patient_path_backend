package capstone.project.paticentpath.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ResponseStatus(value = HttpStatus.NOT_FOUND 	)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ResourceNotFound extends RuntimeException {

	
	public ResourceNotFound(String string, String string2, Object id) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String resourceName;
	private String fieldName;
	private Object fildValue;

}
