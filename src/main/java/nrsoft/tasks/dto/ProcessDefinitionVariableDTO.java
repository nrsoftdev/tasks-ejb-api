package nrsoft.tasks.dto;


public class ProcessDefinitionVariableDTO {
	
	private String name="";
	
	private String value="";
	
	private String type="";
	
	
	public ProcessDefinitionVariableDTO() {}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public ProcessDefinitionVariableDTO(String name, String value, String type) {
		super();
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	
	

}
