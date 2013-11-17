import java.util.List;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//System.out.println(NetInterfacer.getPath());
		API newAPI =new API();
		List<String> myList = newAPI.getSpecificDepartment("ECE");
		System.out.println(myList.get(0).toString());
		
	}

}
