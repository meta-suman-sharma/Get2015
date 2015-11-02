/**
 * 
 */
package com.assignment2;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToObject {
    public static void main(String[] args) {

	ObjectMapper mapper = new ObjectMapper();
	mapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.UNWRAP_ROOT_VALUE,true);

	try {

		// read from file, convert it to user class
		Employee employee = mapper.readValue(new File("d:\\chetnaJson\\Read\\employee.json"), Employee.class);

		// display to console
		System.out.println(employee);

	} catch (JsonGenerationException e) {

		e.printStackTrace();

	} catch (JsonMappingException e) {

		e.printStackTrace();

	} catch (IOException e) {

		e.printStackTrace();

	}

  }

}
