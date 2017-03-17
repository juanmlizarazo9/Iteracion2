package rest;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tm.FestivAndesMaster;
import vos.ListaUsuarios;



@Path("festivales")
public class FestivAndesFestivServices {

	
	@Context
	private ServletContext context;
	
	private String getPath(){
		return context.getRealPath("WEB-INF/ConnectionData");
	}
	
	private String doErrorMessage(Exception e){
		return context.getRealPath("WEB-INF/ConnectionData");
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getUsuarios(){
		FestivAndesMaster fam = new FestivAndesMaster(getPath());
		ListaUsuarios usuarios = null;
		try{
			usuarios = fam.darUsuarios();
		} catch(Exception e){
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuarios).build();
	}
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Response getClientes(){
		FestivAndesMaster fam = new FestivAndesMaster(getPath());
		ListaUsuarios usuarios = null;
		try{
			usuarios = fam.darUsuarios();
		} catch(Exception e){
			return Response.status(500).entity(doErrorMessage(e)).build();
		}
		return Response.status(200).entity(usuarios).build();
	}
	
	
}
