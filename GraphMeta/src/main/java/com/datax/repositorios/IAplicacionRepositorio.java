/**
 * Interfaz IAplicacion.java
 * Interfaz JPA para transaccionabilidad
 * @since 27/02/2023
 * @version 0.1
 * @author Ing. Jhon Jaime Mendez
 * @copyrigth Datax
**/ 

package com.datax.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.datax.modelos.Aplicacion;

public interface IAplicacionRepositorio extends JpaRepository<Aplicacion, Integer> {
}
