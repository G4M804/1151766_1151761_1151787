package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.InstructorVO;


public class InstructorServicios extends Conexion{
    
    public boolean guardar(InstructorVO instructores){
      
         
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="INSERT INTO instructor (codigo, nombre, apellido, telefono, especialidad, jornada, hora) "
                 + "VALUES(?, ?, ?, ?, ?, ?, ?)";   
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, instructores.getCedula());
         ps.setString(2, instructores.getNombre());
         ps.setString(3, instructores.getApellido());
         ps.setInt(4, instructores.getTelefono());
         ps.setString(5,instructores.getEspecialidad());
         ps.setString(6, instructores.getJornadaTrabajo());
         ps.setString(7, instructores.getHorarioTrabajo());
         
         ps.execute();
         return true;
         
         }
         catch(SQLException e){
             System.err.println(e);
             return false;
    }
         finally{
             try{
                 con.close();
             }
             catch(SQLException e){
             System.err.println(e);    
             }
         }
      }
    public boolean actualizar(InstructorVO instructores){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql="UPDATE `instructor` SET `nombre`=?,`apellido`=?,`telefono`=?,`especialidad`=?,`jornada`=?,`hora`=? WHERE `codigo`=?";
         try{
             
         ps=con.prepareStatement(sql);
         ps.setString(1, instructores.getNombre());
         ps.setString(2, instructores.getApellido());
         ps.setInt(3, instructores.getTelefono());
         ps.setString(4,instructores.getEspecialidad());
         ps.setString(5, instructores.getJornadaTrabajo());
         ps.setString(6, instructores.getHorarioTrabajo());
         ps.setInt(7, instructores.getCedula());
         ps.executeUpdate();
         return true;
         
         }
         catch(SQLException e){
             System.err.println(e);
             return false;
    }
         finally{
             try{
                 con.close();
             }
             catch(SQLException e){
             System.err.println(e);    
             }
         }
      }
      public boolean eliminar(InstructorVO instructores){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="DELETE FROM instructor WHERE codigo =?";
                    
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, instructores.getCedula());
         ps.executeUpdate();
         return true;
         
         }
         catch(SQLException e){
             System.err.println(e);
             return false;
    }
         finally{
             try{
                 con.close();
             }
             catch(SQLException e){
             System.err.println(e);    
             }
         }
      } 
      public boolean buscar(InstructorVO instructores){
         PreparedStatement ps=null;
         ResultSet rs =null; 
         Connection  con= getConnection();
         
         String sql ="SELECT * FROM instructor WHERE codigo =?";
                    
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, instructores.getCedula());
         rs = ps.executeQuery();
         
         if(rs.next()){
            
             instructores.setCedula(Integer.parseInt(rs.getString("codigo")));
             instructores.setNombre(rs.getString("nombre"));
             instructores.setApellido(rs.getString("apellido"));
             instructores.setTelefono(Integer.parseInt(rs.getString("telefono")));
             instructores.setEspecialidad(rs.getString("especialidad"));
             instructores.setJornadaTrabajo(rs.getString("jornada"));
             instructores.setHorarioTrabajo(rs.getString("hora"));
             return true;
         }
         return false;
         
         }
         catch(SQLException e){
             System.err.println(e);
             return false;
    }
         finally{
             try{
                 con.close();
             }
             catch(SQLException e){
             System.err.println(e);    
             }
         }
      } 
}
