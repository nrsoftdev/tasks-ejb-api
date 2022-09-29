package nrsoft.tasks.ejb;


import java.util.List;

import jakarta.ejb.Asynchronous;
import jakarta.ejb.Local;

import nrsoft.tasks.TaskResult;
import nrsoft.tasks.dto.ProcessDTO;
import nrsoft.tasks.dto.ProcessDefinitionDTO;
import nrsoft.tasks.dto.ProcessDefinitionVariableDTO;
import nrsoft.tasks.metadata.ProcessVariableType;

@Local
public interface ProcessDefinition {
	
	List<ProcessDefinitionDTO> getProcessDefinitionList();
	
	ProcessDefinitionDTO saveProcessDefinition(ProcessDefinitionDTO processDefinition);

	ProcessDefinitionDTO getProcessDefinition(long processId, long version);

	/**
	 * Delete a connector by its id.
	 * @param connId the text connector id.
	 * @return <code>true</code> if the connector exists prior to be deleted
	 */
	boolean removeProcessDefinitionById(long processId, long version);
	
	boolean generate(long processId, long version, String user);
	
	boolean removeVariable(long processId, long version, String name);
	
	boolean addVariable(long processId, long version, String name, ProcessVariableType type, String value);

	boolean changeVariables(long processId, long version, List<ProcessDefinitionVariableDTO> variables);
	

}
