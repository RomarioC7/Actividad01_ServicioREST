package com.empresa.entity;

import javax.persistence.*;


@Entity
@Table(name = "medicamento")
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idMedicamento;
	public String nombre; 
	public double precio; 
	public int stock; 
	public String laboratorio;
	public Medicamento(int idMedicamento, String nombre, double precio, int stock, String laboratorio) {
		super();
		this.idMedicamento = idMedicamento;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.laboratorio = laboratorio;
	}
	public Medicamento() {}
	public int getIdMedicamento() {
		return idMedicamento;
	}
	public void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	

}