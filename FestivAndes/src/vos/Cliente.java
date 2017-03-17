package vos;

import org.codehaus.jackson.annotate.JsonProperty;

public class Cliente {
	
	@JsonProperty(value="boletas")
	private ListaBoletas boletas;
	@JsonProperty(value="idCliente")
	private Long idCliente;
	
	public Cliente(@JsonProperty(value="boletas")ListaBoletas boletas, 
			@JsonProperty(value="idCliente")Long idCliente){
		super();
		this.boletas = boletas;
		this.idCliente = idCliente;
	}
	
	public ListaBoletas darBoletas(){
		return boletas;
	}
	
	public void setBoletas(ListaBoletas boletas){
		this.boletas = boletas;
	}
	
	public Long getIdCliente(){
		return idCliente;
	}
	
	public void setIdCliente(Long idCliente){
		this.idCliente = idCliente;
	}

}
