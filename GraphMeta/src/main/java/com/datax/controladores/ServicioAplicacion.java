/**
 * Clase ServicioAplicacion.java
 * Controlador de la clase aplicacion
 * @since 27/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 
package com.datax.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.datax.modelos.Aplicacion;
import com.datax.repositorios.IAplicacionRepositorio;

@Controller
@RequestMapping("/aplicaciones")
public class ServicioAplicacion {
	
	@Autowired
	private IAplicacionRepositorio aplicacionRepositorio;
	
	@GetMapping("/listar")
	public List<Aplicacion> listar() {
		
		return aplicacionRepositorio.findAll();
		
	}
	
	@GetMapping("/{identificador}")
	public Aplicacion getAplicacion(@PathVariable int identificador) {
		
		return aplicacionRepositorio.findById(identificador).
				orElseThrow(() -> new RuntimeException("Aplicacion " + identificador + " no encontrada"));
	}
	
	@PostMapping("/registrar")
	@ResponseStatus(HttpStatus.CREATED)
	public void registrar(@RequestBody Aplicacion aplicacion) {
		
		aplicacionRepositorio.save(aplicacion);
		
	}
	
}
