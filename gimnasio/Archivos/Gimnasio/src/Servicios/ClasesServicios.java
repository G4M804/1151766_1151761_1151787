package Servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modeloVO.ClasesVO;
import modeloVO.InstructorVO;

public class ClasesServicios extends Conexion {
    
    public boolean guardar(ClasesVO clases){
      
         
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="INSERT INTO clase (codigo, clase, horario, cod_instructor) "
                 + "VALUES(?, ?, ?, ?)";   
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, clases.getCodigo());
         ps.setString(2, clases.getNombre());
         ps.setString(3, clases.getHorario());
          ps.setInt(4, Integer.valueOf(clases.getCodInst()));

         
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
        public boolean actualizar(ClasesVO clases){
             PreparedStatement ps=null;
             Connection  con= getConnection();

             String sql = "UPDATE `clase` SET `clase`=?,`horario`=?,`cod_instructor`=? WHERE `codigo`=?";
             
             try{

             ps= con.prepareStatement(sql);
             
             ps.setString(1, clases.getNombre());
             ps.setString(2, clases.getHorario());
             ps.setInt(3, Integer.valueOf(clases.getCodInst()));
             ps.setInt(4, clases.getCodigo());


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
      public boolean eliminar(ClasesVO clases){
         PreparedStatement ps=null;
         Connection  con= getConnection();
         
         String sql ="DELETE FROM clase WHERE codigo =?";
                    
         try{
             
         ps= con.prepareStatement(sql);
         ps.setInt(1, clases.getCodigo());
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


