/**
 * Clase Aplicacion.java
 * Clase que mapea la tabla aplicaciones que controla la configuracion de estas en Facebook
 * @since 27/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 
package com.datax.modelos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="aplicaciones", 
       schema="graphmeta"
       )

public class Aplicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identificador;
	@Column (nullable = false)
	private String descripcion;
	@Column (length = 60)
	private String url;
	private String accessToken;
	private String appSecret;
	private String cronogramaEjecucion;
	private boolean activada = true;
	private LocalDateTime fechaCreacion = LocalDateTime.now();
	private String expiracion;
	
	public Aplicacion(String descripcion, String url, String accessToken, String appSecret,
			String cronogramaEjecucion,String expiracion) {
		this.descripcion = descripcion;
		this.url = url;
		this.accessToken = accessToken;
		this.appSecret = appSecret;
		this.cronogramaEjecucion = cronogramaEjecucion;
		this.expiracion = expiracion;
	}
	
	
	
}
