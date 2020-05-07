package com.uca.labo4.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@Size(max=15, message="El nombre no puede tener más de 15 caracteres")
	@NotEmpty(message="Este campo no puede estar vacío")
	private String nombre;
	
	@Size(max=30, message="El nombre no puede tener más de 30 caracteres")
	@NotEmpty(message="Este campo no puede estar vacío")
	private String descripcion;
	
	@NotNull(message="Este campo no puede estar vacío")
	@Min(message="El precio no puede ser negativo", value = 0)
	private Double precio;
	
	@NotEmpty(message="Este campo no puede estar vacío")
	@Pattern(regexp="^(((0[1-9]|[12]\\d|3[01])\\/(0[13578]|1[02])\\/((2[1-9]|[2-9]\\d)\\d{2}))|((0[1-9]|[12]\\d|30)\\/(0[13456789]|1[012])\\/((2[1-9]|[2-9]\\d)\\d{2}))|((0[1-9]|1\\d|2[0-8])\\/02\\/((2[1-9]|[2-9]\\d)\\d{2}))|(29\\/02\\/((2[1-9]|[2-9]\\d)(0[48]|[2468][048]|[13579][26])|((16|[2468][048]|[3579][26])00))))$", message="Formato debe ser dd/mm/yyyy")
	private String vencimiento;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

}
