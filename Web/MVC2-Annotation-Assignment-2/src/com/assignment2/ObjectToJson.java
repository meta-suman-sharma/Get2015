package com.assignment2;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectToJson {
	
    public static void main(String[] args) {

	/*Employee employee = new Employee();
	employee.setEmployeeName("anjita");
	employee.setEmployeeId(1);
	employee.setCtcPerAnnum(14000000);
	employee.setDateOfBirth("31/02/1947");
	employee.setEmailId("a@gmail.com");
	employee.setDateOfJoining("03/08/2015");
	*/
	Employee employee1 = new Employee();
	employee1.setEmployeeName("chetna");
	employee1.setEmployeeId(101);
	employee1.setCtcPerAnnum(100000000);
	employee1.setDateOfBirth("08/03/1995");
	employee1.setEmailId("cs@gmail.com");
	employee1.setDateOfJoining("03/08/2015");
	//System.out.println(employee1.toString());
	
	ObjectMapper mapper = new ObjectMapper();
	//mapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.UNWRAP_ROOT_VALUE,true);
	try {

		// convert user object to json string, and save to a file
		//mapper.writeValue(new File("d:\\chetnaJson\\empployee.json"), employee);
		mapper.writeValue(new File("d:\\chetnaJson\\Read\\employee.json"), employee1);
		// display to console
		//System.out.println(mapper.writeValueAsString(employee));
		System.out.println(mapper.writeValueAsString(employee1));
	} catch (JsonGenerationException e) {
		e.printStackTrace();

	} catch (JsonMappingException e) {
		e.printStackTrace();

	} catch (IOException e) {
		e.printStackTrace();

	}

  }

}