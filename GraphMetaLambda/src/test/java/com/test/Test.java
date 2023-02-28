/**
 * Clase Test.java
 * Test 
 * @since 28/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 
package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.datax.graphapimeta.GraphAPIQuery;

public class Test {
	
	private static Logger LOGGER = LoggerFactory.getLogger(GraphAPIQuery.class);
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		GraphAPIQuery graphAPIQuery = new GraphAPIQuery();
		
		String payload = IOUtils.toString(new FileInputStream("recursos/test.json"), "UTF-8");
		
		String respuesta = graphAPIQuery.getDataGraphAPI(payload);
		
		LOGGER.info(respuesta);
		
		
	}

}
