

import java.util.List;

import junit.framework.TestCase;

public class APITest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public void testGetDepartments() {
		API newAPI =new API();
		List<Department> myList = newAPI.getDepartments();
		assertEquals("Computer Science",myList.get(0).getDepartmentName());
		assertEquals("CS", myList.get(0).getDepartmentCode());
		assertEquals("College of Computing", myList.get(0).getCollegeName());
		assertEquals("Computational Media", myList.get(1).getDepartmentName());
	}

	public void testGetSpecificDepartment() {
		API newAPI =new API();
		List<String> myList = newAPI.getSpecificDepartment("ECE");
		assertEquals("ECE2031",myList.get(0).toString());
		assertEquals("ECE2020",myList.get(1).toString());
	}
	
	public void testGetMyRecentForums(){
		API newAPI = new API();
		List<Course> myList = newAPI.getMyCourses("jruiz30");
		assertEquals("CS1332", myList.get(0).getCourseNumber());
	}

}
