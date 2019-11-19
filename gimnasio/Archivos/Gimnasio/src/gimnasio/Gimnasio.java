/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;
import modeloVO.ClasesVO;
import modeloVO.ClienteVO;
import modeloVO.InstructorVO;
import modeloVO.AsignacionVO;

import Controlador.Control;

import vista.Clases;
import vista.Clientes;
import vista.Formulario;
import vista.Inicio;
import vista.Instructores;
import vista.Asignaciones;

import Servicios.InstructorServicios;
import Servicios.ClienteServicios;
import Servicios.ClasesServicios;
import Servicios.AsignacionServicios;

/**
 *
 * @author Claudia
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instructores ins = new Instructores();
        Inicio i= new Inicio();
        Formulario f=new Formulario();
        Asignaciones asig= new Asignaciones();
        Clientes cli=new Clientes();
        Clases cls=new Clases();
        ClasesVO claVO=new ClasesVO();
        ClienteVO cliVO = new ClienteVO();
        InstructorVO insVO =new InstructorVO();
        AsignacionVO asigVO= new AsignacionVO();
        InstructorServicios insSer = new InstructorServicios();
        ClienteServicios cliSer = new ClienteServicios();
        ClasesServicios claSer = new ClasesServicios();
        AsignacionServicios AsigSer= new AsignacionServicios();
        
      new Control(claVO,cliVO,insVO,asigVO,cls,cli,f,i,ins,asig,insSer,cliSer,claSer,AsigSer);  
      
        i.setSize(640,480);
        i.setVisible(true);
        f.jLayeredPane1.add(i);
        
        ins.setSize(640,480);
        ins.setVisible(true);
        f.jLayeredPane3.add(ins);
        
        cls.setSize(640,480);
        cls.setVisible(true);
        f.jLayeredPane4.add(cls);
        
        cli.setSize(640,480);
        cli.setVisible(true);
        f.jLayeredPane2.add(cli);
        f.setVisible(true);
        
        asig.setSize(640,480);
        asig.setVisible(true);
        f.jLayeredPane5.add(asig);
        f.setVisible(true);
        
       
       
        
    }
    
}
