package br.usjt.PrevisaoTempo.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tempo implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String dia;		//Dia da Semana
	private double temp_maxima; //Temperatura Máxima
	private double temp_minima; //Temperatura Mínima
	private double umidade;		//Umidade relativa do ar
	private String descricao;	//Descricao da Temperatura
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public double getTemp_maxima() {
		return temp_maxima;
	}
	public void setTemp_maxima(double temp_maxima) {
		this.temp_maxima = temp_maxima;
	}
	public double getTemp_minima() {
		return temp_minima;
	}
	public void setTemp_minima(double temp_minima) {
		this.temp_minima = temp_minima;
	}
	public double getUmidade() {
		return umidade;
	}
	public void setUmidade(double umidade) {
		this.umidade = umidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
