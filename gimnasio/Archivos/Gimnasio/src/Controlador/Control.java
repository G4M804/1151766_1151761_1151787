/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author jhons
 */
import java.text.SimpleDateFormat;


import Servicios.ClienteServicios;
import Servicios.Conexion;
import Servicios.InstructorServicios;
import Servicios.ClasesServicios;
import Servicios.AsignacionServicios;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

import vista.Clases;
import vista.Clientes;
import vista.Formulario;
import vista.Inicio;
import vista.Instructores;
import vista.Asignaciones;
import modeloVO.ClasesVO;
import modeloVO.ClienteVO;
import modeloVO.InstructorVO;
import modeloVO.AsignacionVO;
        
public class Control implements ActionListener{
        //modelo
        private ClasesVO clase=null;
        private ClienteVO cliente=null;
        private InstructorVO instructor=null;
        private AsignacionVO asignacion=null;
        //vista
        private Clases clases=null;
        private Clientes clientes=null;
        private Formulario registro=null;
        private Inicio inicio=null;
        private Instructores instructores=null;
        private Asignaciones asignaciones=null;
        //sql
        private InstructorServicios insS;
        private ClienteServicios clS;
        private ClasesServicios claS;
        private AsignacionServicios AsigS;
        
        
    public Control(ClasesVO clase,ClienteVO cliente,InstructorVO instructor,AsignacionVO asignacion,Clases clases, Clientes clientes,Formulario registro,Inicio inicio,Instructores instructores,Asignaciones asignaciones,
            InstructorServicios insS,ClienteServicios clS, ClasesServicios claS,AsignacionServicios AsigS) {
        this.clase=clase;
        this.cliente=cliente;
        this.instructor=instructor;
        this.asignacion=asignacion;
        
        this.clases=clases;
        this.clientes=clientes;
        this.registro=registro;
        this.inicio=inicio;
        this.instructores=instructores;
        this.asignaciones=asignaciones;
        this.clS=clS;
        this.insS=insS;
        this.claS=claS;
        this.AsigS=AsigS;
        actionListener(this);
        
    }
      
    
    
    private void actionListener (ActionListener control){
        
        clases.btnActualizarClases.addActionListener(control);
        clases.btnCancelarClases.addActionListener(control);
        clases.btnRegistrarClases.addActionListener(control);
        
        clientes.btnActualizarClientes.addActionListener(control);
        clientes.btnEliminarClientes.addActionListener(control);
        clientes.btnRegistrarClientes.addActionListener(control);
        
        instructores.btnRegistrar.addActionListener(control);
        instructores.btnActualizar.addActionListener(control);
        instructores.btnEliminar.addActionListener(control);
        instructores.btnConsultar.addActionListener(control);
        
        asignaciones.btnRegistrarAsignacion.addActionListener(control);
        asignaciones.btnActualizarAsignacion.addActionListener(control);
        asignaciones.btnEliminarAsignacion.addActionListener(control);
        
    }
    
    public void limpiarIns(){
                instructores.txtCodigo.setText("");
                instructores.txtNombre.setText("");
                instructores.txtApellido.setText("");
                instructores.cbxEspecialidad.setSelectedIndex(0);
                instructores.cbxJornada.setSelectedIndex(0);
                instructores.txtTelefono.setText("");
                instructores.cbxHora.setSelectedIndex(0);
    }
    public void limpiarClas(){
                
            clases.txtCodigo.setText("");
            clases.txtClase.setText("");
            clases.cbxHorario.setSelectedIndex(0);
            clases.txtInstructor.setText("");
    }
    public void limpiarCli(){
        clientes.txtCedula.setText("");
        clientes.txtNombre.setText("");
        clientes.txtApellido.setText("");
        clientes.txtDireccion.setText("");
        clientes.txtTelefono.setText("");
        clientes.txtFecha.setText("");
    }
    public void limpiarAsig(){
       asignaciones.txtClaseAsig.setText("");
       asignaciones.txtClienteAsig.setText("");
       asignaciones.txtCodigoAsig.setText("");
       asignaciones.txtFechaFin.setText("");
       asignaciones.txtFechaIn.setText("");
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {        
        try{
            if(e.getActionCommand().contentEquals("Eliminar Asignacion")){
                asignacion.setCodigoAsig(Integer.parseInt(asignaciones.txtCodigoAsig.getText()));
               
                 if(AsigS.eliminar(asignacion)){
                     JOptionPane.showMessageDialog(null, "Registro Eliminado");
                      limpiarAsig();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Eliminar");
                      limpiarAsig();
            }
            }else
            if(e.getActionCommand().contentEquals("Registrar Asignacion")){
                String[] p = asignaciones.txtFechaIn.getText().split("-");
                    String [] p1 = asignaciones.txtFechaFin.getText().split("-");
                    Date d= new Date(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
                    Date d1= new Date(Integer.parseInt(p1[0]),Integer.parseInt(p1[1]),Integer.parseInt(p1[2]));
                    asignacion.setCodigoAsig(Integer.parseInt(asignaciones.txtCodigoAsig.getText()));
                    asignacion.setCodigoClas(Integer.parseInt(asignaciones.txtClaseAsig.getText()));
                    asignacion.setCodigoCli(Integer.parseInt(asignaciones.txtClienteAsig.getText()));
                    asignacion.setFechaIn(d);
                    asignacion.setFechaFin(d1);
                
                 if(AsigS.guardar(asignacion)){
                      JOptionPane.showMessageDialog(null, "Registro Guardado");
                      limpiarAsig();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Guardar");
                      limpiarAsig();
                }
            }
            else
            if(e.getActionCommand().contentEquals("Actualizar Asignacion")){
                 SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
                    String[] p = asignaciones.txtFechaIn.getText().split("-");
                    String [] p1 = asignaciones.txtFechaFin.getText().split("-");
                    Date d= new Date(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
                    Date d1= new Date(Integer.parseInt(p1[0]),Integer.parseInt(p1[1]),Integer.parseInt(p1[2]));
                    asignacion.setCodigoAsig(Integer.parseInt(asignaciones.txtCodigoAsig.getText()));
                    asignacion.setCodigoClas(Integer.parseInt(asignaciones.txtClaseAsig.getText()));
                    asignacion.setCodigoCli(Integer.parseInt(asignaciones.txtClienteAsig.getText()));
                    asignacion.setFechaIn(d);
                    asignacion.setFechaFin(d1);
                 
                 if(AsigS.actualizar(asignacion)){
                     JOptionPane.showMessageDialog(null, "Registro Actualizado");
                      limpiarAsig();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Actualizar");
                      limpiarAsig();
                }
             }
            
            else
            if(e.getActionCommand().contentEquals("Actualizar Cliente")){
                 SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
                    String[] p = clientes.txtFecha.getText().split("-");
                    Date d= new Date(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
                    cliente.setCedula(Integer.parseInt(clientes.txtCedula.getText()));
                    cliente.setNombre(clientes.txtNombre.getText());
                    cliente.setApellido(clientes.txtApellido.getText());
                    cliente.setDireccion(clientes.txtDireccion.getText());
                    cliente.setTelefono(Integer.parseInt(clientes.txtTelefono.getText()));
                    cliente.setFechaIngreso(d);
                 
                 if(clS.actualizar(cliente)){
                     JOptionPane.showMessageDialog(null, "Registro Actualizado");
                      limpiarCli();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Actualizar");
                      limpiarCli();
                }
             }
            
            else
            if(e.getActionCommand().contentEquals("Actualizar Clase")){
                 clase.setCodigo(Integer.parseInt(clases.txtCodigo.getText()));
                clase.setNombre(clases.txtClase.getText());
                clase.setHorario(clases.cbxHorario.getSelectedItem().toString());
                clase.setCodInst(clases.txtInstructor.getText());
                 
                 if(claS.actualizar(clase)){
                     JOptionPane.showMessageDialog(null, "Registro Actualizado");
                      limpiarClas();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Actualizar");
                      limpiarClas();
                }
             }
            
            else
            if(e.getActionCommand().contentEquals("Cancelar Clase")){
                clase.setCodigo(Integer.parseInt(clases.txtCodigo.getText()));
               
                 if(claS.eliminar(clase)){
                     JOptionPane.showMessageDialog(null, "Registro Eliminado");
                      limpiarClas();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Eliminar");
                      limpiarClas();
            }
            }else{
            if(e.getActionCommand().contentEquals("Registrar Clase")){
                clase.setCodigo(Integer.parseInt(clases.txtCodigo.getText()));
                clase.setNombre(clases.txtClase.getText());
                clase.setHorario(clases.cbxHorario.getSelectedItem().toString());
                clase.setCodInst(clases.txtInstructor.getText());
                
                 if(claS.guardar(clase)){
                      JOptionPane.showMessageDialog(null, "Registro Guardado");
                      limpiarClas();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Guardar");
                      limpiarClas();
                }
            }
            else{
            if(e.getActionCommand().contentEquals("Eliminar Cliente")){
                cliente.setCedula(Integer.parseInt(clientes.txtCedula.getText()));
               
                 if(clS.eliminar(cliente)){
                     JOptionPane.showMessageDialog(null, "Registro Eliminado");
                      limpiarCli();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Eliminar");
                      limpiarCli();
            }
            }else{
            
            if(e.getActionCommand().contentEquals("Registrar Cliente")){
                    SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd");
                    String[] p = clientes.txtFecha.getText().split("-");
                    Date d= new Date(Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2]));
                    cliente.setCedula(Integer.parseInt(clientes.txtCedula.getText()));
                    cliente.setNombre(clientes.txtNombre.getText());
                    cliente.setApellido(clientes.txtApellido.getText());
                    cliente.setDireccion(clientes.txtDireccion.getText());
                    cliente.setTelefono(Integer.parseInt(clientes.txtTelefono.getText()));
                    cliente.setFechaIngreso(d);
                    
                if(clS.guardarlo(cliente)){
                      JOptionPane.showMessageDialog(null, "Registro Guardado");
                      limpiarCli();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Guardar");
                      limpiarCli();
                }
                
            }else
                if(e.getActionCommand().contentEquals("Registrar Instructor")){
                    instructor.setCedula(Integer.parseInt(instructores.txtCodigo.getText()));
                    instructor.setNombre(instructores.txtNombre.getText());
                    instructor.setApellido(instructores.txtApellido.getText());
                    instructor.setTelefono(Integer.parseInt(instructores.txtTelefono.getText()));
                    instructor.setEspecialidad(instructores.cbxEspecialidad.getSelectedItem().toString());
                    instructor.setJornadaTrabajo(instructores.cbxJornada.getSelectedItem().toString());
                    instructor.setHorarioTrabajo(instructores.cbxHora.getSelectedItem().toString());
                    
                if(insS.guardar(instructor)){                  
                      JOptionPane.showMessageDialog(null, "Registro Guardado");
                      limpiarIns();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Guardar");
                      limpiarIns();
                }
                    
            }
            else
            if(e.getActionCommand().contentEquals("Actualizar Instructor")){
                 instructor.setCedula(Integer.parseInt(instructores.txtCodigo.getText()));
                 instructor.setNombre(instructores.txtNombre.getText());
                 instructor.setApellido(instructores.txtApellido.getText());
                 instructor.setTelefono(Integer.parseInt(instructores.txtTelefono.getText()));
                 instructor.setEspecialidad(instructores.cbxEspecialidad.getSelectedItem().toString());
                 instructor.setJornadaTrabajo(instructores.cbxJornada.getSelectedItem().toString());
                 instructor.setHorarioTrabajo(instructores.cbxHora.getSelectedItem().toString());
                 
                 if(insS.actualizar(instructor)){
                     JOptionPane.showMessageDialog(null, "Registro Actualizado");
                      limpiarIns();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Actualizar");
                      limpiarIns();
                }
             }
            
            else if(e.getActionCommand().contentEquals("Consultar Instructor")){
                 instructor.setCedula(Integer.parseInt(instructores.txtCodigo.getText()));
                   if(insS.buscar(instructor)){
                       
                       instructores.txtCodigo.setText(instructor.getCedula().toString());
                       instructores.txtNombre.setText(instructor.getNombre());
                       instructores.txtApellido.setText(instructor.getApellido());
                       instructores.txtTelefono.setText(String.valueOf(instructor.getTelefono()));
                       instructores.cbxEspecialidad.setSelectedItem(instructor.getEspecialidad());
                       instructores.cbxJornada.setSelectedItem(instructor.getJornadaTrabajo());
                       instructores.cbxHora.setSelectedItem(instructor.getHorarioTrabajo());
                       
                }else{
                      JOptionPane.showMessageDialog(null, "No Encontro Ningun Registro");
                      limpiarIns();
                }
             
            }else if(e.getActionCommand().contentEquals("Eliminar Instructor")){
                 instructor.setCedula(Integer.parseInt(instructores.txtCodigo.getText()));
               
                 if(insS.eliminar(instructor)){
                     JOptionPane.showMessageDialog(null, "Registro Eliminado");
                      limpiarIns();
                }else{
                      JOptionPane.showMessageDialog(null, "Error al Eliminar");
                      limpiarIns();
                }
            }
        }
        }
        }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    }

