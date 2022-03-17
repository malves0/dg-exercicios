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

    public static int calcularIMC(int peso, double altura) {
        // peso/ (altura elevado 2)
        // imc < 20 => -1
        // 20 < imc > 25 => 0
        // 25 < imc => 1
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return -1;
        }
        else {
            if (imc < 25) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static boolean ehMaiorIdade(int idade) {
        if(idade > 18) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static void main(String[] args) {
       System.out.println(calcularIMC(60, 1.60));

    }

}
