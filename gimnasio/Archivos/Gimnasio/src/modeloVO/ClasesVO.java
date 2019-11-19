package modeloVO;

public class ClasesVO {
    private int codigo;
    private String nombre;
    private String horario;
    private String codInst;

    public ClasesVO() {
    }

    public ClasesVO(int codigo, String nombre, String horario, String codInst) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horario = horario;
        this.codInst = codInst;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCodInst() {
        return codInst;
    }

    public void setCodInst(String codInst) {
        this.codInst = codInst;
    }
    
    
    
    
}
