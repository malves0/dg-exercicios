package exercicio1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Ana", 20, "1");
        Pessoa pessoa3 = new Pessoa("Bia", 22, "2", 50, 1.60);

        // Pessoa pessoa4 = new Pessoa("Bugado");
        // Cannot resolve constructor 'Pessoa(java.lang.String)'
    }
}
