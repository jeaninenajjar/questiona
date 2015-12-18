package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date adeleBirthDate = null;
		try {
			adeleBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1982-04-23");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Adele", "Hello", "ItsMe", adeleBirthDate, "her house", "123-453-9856", "hello@udel.edu","HI");
		Student stu3 = new Student("Susie", "Sue", "Susan", dBirthDate, "112 house", "302-800-6889", "bhouseons@udel.edu","MIJ");
		Student stu4 = new Student("Bertie", "Bert", "Bertins", adeleBirthDate, "214 Bert Bert", "302-893-6889", "bert@bert.edu","BERT");
		Student stu5 = new Student("Hello", "Its", "Me", dBirthDate, "222 Hello", "999-666-8888", "bgibbjfkk@udel.edu","CNS");
        
		HashMap<Person, Student> hashMap= new HashMap<Person, (stu1,stu2,stu3,stu4,stu5)>();
		assertTrue(hashMap==5);
	}

}
