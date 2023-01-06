public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        // Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.getBonificacion();
        gerente.setClave("roro");
        gerente.setTipo(1);

        System.out.println(gerente.getBonificacion());
        System.out.println(gerente.iniciarSesion("roro"));
    }

}
