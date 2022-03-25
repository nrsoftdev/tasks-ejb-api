package nrsoft.tasks.ejb;


import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import nrsoft.tasks.dto.TextConnectorDTO;

@Local
public interface TextConnector {
	
	List<TextConnectorDTO> getTextConnectorList();
	


	TextConnectorDTO getTextConnector(long connId);
	
	TextConnectorDTO getTextConnectorByName(String name);
	
	TextConnectorDTO saveTextConnector(TextConnectorDTO textConnector);
	
	/**
	 * Delete a connector by its id.
	 * @param connId the text connector id.
	 * @return <code>true</code> if the connector exists prior to be deleted
	 */
	boolean removeTextConnectorById(long connId);

}
