public class Pessoa {
    String nome;
    int idade;
    String ID;
    double peso;
    double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(String nome, int idade, String ID, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura) {
        double imc = peso / Math.sqrt(altura);

        if (imc < 20) {
            return -1;
        } else if (imc < 25){
            return 0;
        }
        return 1;
    }

    public boolean ehMaiorIdade(int idade) {
        return idade > 18;
    }
}
