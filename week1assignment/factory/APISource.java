package week1assignment.factory;
import java.util.logging.Logger;
public class APISource implements TestDataProvider {
	
	public static final Logger logger = Logger.getLogger(APISource.class.getName());

	@Override
	public boolean Initializesource() {
		logger.info("Hit the API with appropriate request Body");
		return true;
	}

	@Override
	public boolean readdata() {
		logger.info("Obtain the required data from the response");
		return true;
	}

	@Override
	public boolean Closesource() {
		logger.info("Close the API Connection");
		return true;
	}
	
	

}
