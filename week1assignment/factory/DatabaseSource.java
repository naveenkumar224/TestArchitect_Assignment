package week1assignment.factory;
import java.util.logging.Logger;
public class DatabaseSource implements TestDataProvider {
	
	public static final Logger logger = Logger.getLogger(DatabaseSource.class.getName());

	@Override
	public boolean Initializesource() {
		logger.info("Open the Database with appropriate credentials");
		return true;
	}

	@Override
	public boolean readdata() {
		logger.info("Read the data from the specific schema and table");
		return true;
	}

	@Override
	public boolean Closesource() {
		logger.info("Close the database connection");
		return true;
	}
	
	

}
