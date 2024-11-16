package week1assignment.factory;

import java.util.logging.Logger;

public class TestDataFactory {
	public static final Logger logger = Logger.getLogger(TestDataFactory.class.getName());
	
	public static void CommonImplementation() {
		DataUtilities DU = new DataUtilities();
		DU.ApplicationLogin();
		DU.PageNavigation();
		DU.SpecifySouce();
		
	}
	public static TestDataProvider createdatafactory(Datasources types)
	{
	
		
		switch (types) {
		case Excel:
			return new Excelsource();
		case Faker:
			return new FakerSource();
		case Database:
			return new DatabaseSource();
		case API:
			return new APISource();
				default:
			throw new IllegalArgumentException("Datasouce not matching the defined types");
		}
	}

	

	

}
