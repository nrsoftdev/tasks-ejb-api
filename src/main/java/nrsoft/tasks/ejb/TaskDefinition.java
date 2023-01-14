package nrsoft.tasks.ejb;


import java.util.List;

import jakarta.ejb.Local;

import nrsoft.tasks.dto.ProcessDefinitionDTO;
import nrsoft.tasks.dto.TaskDefinitionDTO;

@Local
public interface TaskDefinition {
	
	List<TaskDefinitionDTO> getTaskDefinitionList();
	
	List<TaskDefinitionDTO> getTaskDefinitionList(int pageNum, int pageSize);
	
	List<TaskDefinitionDTO> searchTaskDefinitionList( String name, String description, String className, int pageNum, int pageSize);
	
	TaskDefinitionDTO createTaskDefinition(TaskDefinitionDTO taskDefinitionDTO);
	
	TaskDefinitionDTO updateTaskDefinition(TaskDefinitionDTO taskDefinitionDTO);
	
	TaskDefinitionDTO updateTaskDefinitionProperties(TaskDefinitionDTO taskDefinitionDTO);

	TaskDefinitionDTO getTaskDefinition(long taskId);

	/**
	 * Delete a connector by its id.
	 * @param connId the text connector id.
	 * @return <code>true</code> if the connector exists prior to be deleted
	 */
	boolean removeTaskDefinitionById(long taskId);

	List<TaskDefinitionDTO> getTaskChildren(long taskId,int pageNum, int pageSize);

	TaskDefinitionDTO addChildrenTaskDefinition(long parentTaskId, TaskDefinitionDTO taskDefinition);

	boolean detachChildrenTaskDefinition(long parentTaskId, long childTaskId);
	
	boolean attachChildrenTaskDefinition(long parentTaskId, long childTaskId);

}
