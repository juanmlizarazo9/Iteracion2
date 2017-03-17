package vos;

import org.codehaus.jackson.annotate.*;

public class Usuario {
	
	@JsonProperty(value="nombre")
	private String nombre;
	
	@JsonProperty(value="id")
	private Long id;
	
	@JsonProperty(value="correo")
	private String correo;
	
	@JsonProperty(value="rol")
	private String rol;
	
	
	public Usuario(@JsonProperty(value="nombre") String nombre,	
			@JsonProperty(value="id")Long id,
			@JsonProperty(value="correo")String correo,
			@JsonProperty(value="rol")String rol){
		super();
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.rol = rol;
	}
	
	
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getCorreo(){
		return correo;
	}
	
	public void setCorreo(String correo){
		this.correo = correo;
	}
	
	public String getRol(){
		return rol;
	}
	
	public void setRol(String rol){
		this.rol = rol;
	}
	

}
