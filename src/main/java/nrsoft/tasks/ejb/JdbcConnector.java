package nrsoft.tasks.ejb;


import java.util.List;

import jakarta.ejb.Local;
import nrsoft.tasks.dto.JdbcConnectorDTO;


@Local
public interface JdbcConnector {
	
	List<JdbcConnectorDTO> getJdbcConnectorList();
	


	JdbcConnectorDTO getJdbcConnector(long connId);
	
	JdbcConnectorDTO saveJdbcConnector(JdbcConnectorDTO textConnector);
	
	/**
	 * Delete a connector by its id.
	 * @param connId the text connector id.
	 * @return <code>true</code> if the connector exists prior to be deleted
	 */
	boolean removeJdbcConnectorById(long connId);

}
