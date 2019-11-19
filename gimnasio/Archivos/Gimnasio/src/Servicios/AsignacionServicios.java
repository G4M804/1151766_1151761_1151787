package Servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.AsignacionVO;

public class AsignacionServicios extends Conexion {
    public boolean guardar(AsignacionVO asignaciones){
      
         
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="INSERT INTO asignacion (codigo, cliente,clase, fecha_ini, fecha_fin) "
                 + "VALUES(?, ?, ?, ?, ?)";   
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, asignaciones.getCodigoAsig());
         ps.setInt(2, asignaciones.getCodigoCli());
         ps.setInt(3, asignaciones.getCodigoClas());
         ps.setDate(4, (Date) asignaciones.getFechaIn());
         ps.setDate(5,(Date) asignaciones.getFechaFin());
         
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
    public boolean actualizar(AsignacionVO asignaciones){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql="UPDATE `asignacion` SET `cliente`=?,`clase`=?,`fecha_ini`=?,`fecha_fin`=? WHERE `codigo`=?";
         try{
             
         ps=con.prepareStatement(sql);
         
         ps.setInt(1, asignaciones.getCodigoCli());
         ps.setInt(2, asignaciones.getCodigoClas());
         ps.setDate(3, (Date) asignaciones.getFechaIn());
         ps.setDate(4,(Date) asignaciones.getFechaFin());
         ps.setInt(5, asignaciones.getCodigoAsig());
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
      public boolean eliminar(AsignacionVO asignaciones){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="DELETE FROM instructor WHERE codigo =?";
                    
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, asignaciones.getCodigoAsig());
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
