package Servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.ClienteVO;

public class ClienteServicios extends Conexion {

    public boolean guardarlo (ClienteVO cliente){
      
         
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="INSERT INTO cliente (cedula, nombre, apellido , direccion , telefono , fecha) "
                 + "VALUES(?, ?, ?, ?, ?, ?)";   
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, cliente.getCedula());
         ps.setString(2, cliente.getNombre());
         ps.setString(3, cliente.getApellido());
         ps.setString(4, cliente.getDireccion());
         ps.setInt(5,cliente.getTelefono()); 
         ps.setDate(6, (Date) cliente.getFechaIngreso());
         
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
    public boolean actualizar(ClienteVO cliente){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="UPDATE `cliente` SET `nombre`=?,`apellido`=?,`direccion`=?,`telefono`=?,`fecha`=? WHERE `cedula`=?";
         try{
             
         ps= con.prepareStatement(sql);
         
         ps.setString(1, cliente.getNombre());
         ps.setString(2, cliente.getApellido());
         ps.setString(3, cliente.getDireccion());
         ps.setInt(4,cliente.getTelefono()); 
         ps.setDate(5, (Date) cliente.getFechaIngreso());
         ps.setInt(6, cliente.getCedula());
         
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
      public boolean eliminar(ClienteVO cliente){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="DELETE FROM cliente WHERE cedula =?";
                    
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, cliente.getCedula());
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
      
}


