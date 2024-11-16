package week1assignment.factory;

public class TestSoucesfactory {
	
	public static void main(String[] args) {
		TestDataFactory obj = new TestDataFactory();
		obj.CommonImplementation();
		obj.createdatafactory(Datasources.Excel).Initializesource();
		obj.createdatafactory(Datasources.Excel).readdata();
		obj.createdatafactory(Datasources.Excel).Closesource();

		
	}

}
