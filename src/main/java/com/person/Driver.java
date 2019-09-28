package com.person;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			
			
			
		ObjectMapper mapper= new ObjectMapper();
			Person thePerson= mapper.readValue(new File("data/sample-full.json"), Person.class);
			System.out.println(thePerson.getFirstName());
			System.out.println(thePerson.getAddress().getCity());
			for(String lang:thePerson.getLanguages()) {
				System.out.print(lang+" ,");
			}
			
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
