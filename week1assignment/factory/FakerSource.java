package week1assignment.factory;
import java.util.logging.Logger;
public class FakerSource implements TestDataProvider {
	
	public static final Logger logger = Logger.getLogger(FakerSource.class.getName());

	@Override
	public boolean Initializesource() {
		logger.info("Open the Faker tool");
		return true;
	}

	@Override
	public boolean readdata() {
		logger.info("Obtain the data from the specific format");
		return true;
	}

	@Override
	public boolean Closesource() {
		logger.info("Close the faker tool");
		return true;
	}
	
	

}
