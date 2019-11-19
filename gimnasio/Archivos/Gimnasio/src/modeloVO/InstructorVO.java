package modeloVO;

public class InstructorVO {
    private Integer cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private String especialidad;
    private String jornadaTrabajo;
    private String horarioTrabajo;

    public InstructorVO() {
    }

    public InstructorVO(Integer cedula, String nombre, String apellido, Integer telefono, String especialidad, String jornadaTrabajo, String horarioTrabajo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.jornadaTrabajo = jornadaTrabajo;
        this.horarioTrabajo = horarioTrabajo;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getJornadaTrabajo() {
        return jornadaTrabajo;
    }

    public void setJornadaTrabajo(String jornadaTrabajo) {
        this.jornadaTrabajo = jornadaTrabajo;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }
    
    
}
