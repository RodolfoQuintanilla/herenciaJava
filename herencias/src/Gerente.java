public class Gerente extends Funcionario {

    private String clave;

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave) {
        return clave == "roro";
    }

    // Sobre escritura de metodos
    public double getBonificacion() {
        return super.getSalario() + (super.getSalario() + super.getBonificacion());
    }
}
