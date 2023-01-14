package nrsoft.tasks.ejb;


import java.util.List;

import jakarta.ejb.Asynchronous;
import jakarta.ejb.Local;

import nrsoft.tasks.TaskResult;
import nrsoft.tasks.dto.ProcessDTO;
import nrsoft.tasks.dto.ProcessDefinitionDTO;

@Local
public interface Process {
	
	/**
	 * 
	 * @param processId
	 * @param version
	 * @param user
	 * @return the process id run
	 */
	@Asynchronous
	String run(long processDefinitionId, long version, String user);

	ProcessDTO getProcessResult(String processId);

	List<ProcessDTO> getList(String owner, int pageNum, int pageSize);

}
