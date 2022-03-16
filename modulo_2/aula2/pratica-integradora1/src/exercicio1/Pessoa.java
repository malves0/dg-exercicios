package exercicio1;

public class Pessoa {
    public String nome;
    public int idade;
    public String ID;
    public int peso;
    public double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, int peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

}
