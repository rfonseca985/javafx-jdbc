package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationExcepition extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	private Map<String, String> errors = new HashMap<>();
	
	public ValidationExcepition(String msg) {
		super(msg);
		
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
}
