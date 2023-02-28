/**
 * Clase HandlerGraphMeta
 * Handler del lambda
 * @since 28/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 

package com.datax;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class HandlerGraphMeta implements RequestStreamHandler, RequestHandler<Object, Object> {

	@Override
	public String handleRequest(Object input, Context context) {

		return null;

	}

	@Override
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {

		String payload = IOUtils.toString(input, "UTF_8");
		

	}


}


