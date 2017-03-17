package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Boleta {
	@JsonProperty(value="id")
	private Long id;
	@JsonProperty(value="localidad")
	private String localidad;
	@JsonProperty(value="valor")
	private double valor;
	@JsonProperty(value="beneficios")
	private String beneficios;
	
	public Boleta(
			@JsonProperty(value="id")
			Long id,
			@JsonProperty(value="localidad")
			String localidad,
			@JsonProperty(value="valor")
			double valor,
			@JsonProperty(value="beneficios")
			String beneficios){
		super();
		this.id = id;
		this.localidad = localidad;
		this.valor = valor;
		this.beneficios = beneficios;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getLocalidad(){
		return localidad;
	}
	
	public void setLocalidad(String localidad){
		this.localidad = localidad;
	}
	
	public double getValor(){
		return valor;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public String getBeneficios(){
		return beneficios;
	}
	
	public void setBeneficios(String beneficios){
		this.beneficios = beneficios;
	}

}
