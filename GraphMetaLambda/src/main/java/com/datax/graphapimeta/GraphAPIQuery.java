/**
 * Clase Test.java
 * Agregar descripcion
 * @since 28/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 
package com.datax.graphapimeta;

import com.google.gson.Gson;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;

import com.restfb.types.User;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GraphAPIQuery {
	
	private static Logger LOGGER = LoggerFactory.getLogger(GraphAPIQuery.class);
	
	public String getDataGraphAPI(String payload) {
		
		
		JSONObject jsonObject = new JSONObject(payload);
		String accessToken = jsonObject.getString("access_token");
		String appID = jsonObject.getString("app_id");
		JSONArray jsonArrayItems = jsonObject.getJSONArray("items");
		
		LOGGER.info("Payload recibido: %s" + payload);
		
		//Se realiza el proceso de autenticacion contra la plataforma Metro
		FacebookClient client = new DefaultFacebookClient(accessToken, Version.VERSION_16_0);
		
		LOGGER.info("Autenticación Exitosa");
		
		User user = client.fetchObject("me", User.class);
		
		return new Gson().toJson(user);
		
	}
	

}
