package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vos.Usuario;

public class DAOTablaUsuarios {
	
	/**
	 * Arraylits de recursos que se usan para la ejecución de sentencias SQL
	 */
	private ArrayList<Object> recursos;

	/**
	 * Atributo que genera la conexión a la base de datos
	 */
	private Connection conn;

	/**
	 * Método constructor que crea DAOVideo
	 * <b>post: </b> Crea la instancia del DAO e inicializa el Arraylist de recursos
	 */
	public DAOTablaUsuarios() {
		recursos = new ArrayList<Object>();
	}

	/**
	 * Método que cierra todos los recursos que estan enel arreglo de recursos
	 * <b>post: </b> Todos los recurso del arreglo de recursos han sido cerrados
	 */
	public void cerrarRecursos() {
		for(Object ob : recursos){
			if(ob instanceof PreparedStatement)
				try {
					((PreparedStatement) ob).close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
		}
	}
	
	/**
	 * Método que inicializa la connection del DAO a la base de datos con la conexión que entra como parámetro.
	 * @param con  - connection a la base de datos
	 */
	public void setConn(Connection con){
		this.conn = con;
	}
	
	public ArrayList<Usuario> darUsuarios() throws SQLException, Exception{
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		String sql = "SELECT * FROM ISIS2304A181720.USUARIOS";
		
		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		ResultSet rs = prepStmt.executeQuery();
		while(rs.next()){
			Long id = rs.getLong("ID");
			String nombre = rs.getString("NOMBRE");
			String correo = rs.getString("CORREO");
			String rol = rs.getString("ROL");
			usuarios.add(new Usuario(nombre, id, correo, rol));
		}
		return usuarios;				
	}
	
	public void addUsuario(Usuario usuario) throws SQLException, Exception{
		String sql = "INSERT INTO ISIS2304A181720.USUARIOS VALUES (";
		sql += usuario.getNombre() + ",'";
		sql += usuario.getId() + ",'";
		sql += usuario.getCorreo() + ",'";
		sql += usuario.getRol() + ",'";
		
		System.out.println("SQL stmt: " + sql);
		
		PreparedStatement prepStmt = conn.prepareStatement(sql);
		recursos.add(prepStmt);
		prepStmt.executeQuery();
	}
	
}
