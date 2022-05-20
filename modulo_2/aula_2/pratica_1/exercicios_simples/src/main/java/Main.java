public class Main {
    public static void main(String[] args) {
        Pessoa pessoa_1 = new Pessoa();
        Pessoa pessoa_2 = new Pessoa("Ana", 19, "id1");
        Pessoa pessoa_3 = new Pessoa("Pedro", 20, "id2", 90.8, 1.78);
        // Pessoa pessoa_4 = new Pessoa("Erraldino", 99);

        int imc_pessoa_3 = pessoa_3.calcularIMC(pessoa_3.peso, pessoa_3.altura);
        boolean pessoa_3_e_Maior_Idade = pessoa_3.ehMaiorIdade(pessoa_3.idade);

        if (imc_pessoa_3 == -1){
            System.out.println(pessoa_3.nome + " está abaixo do peso");
        } else if ( imc_pessoa_3 == 0){
            System.out.println(pessoa_3.nome + " está com peso saudável");
        } else {
            System.out.println(pessoa_3.nome + " está com sobrepeso");
        }

        if (pessoa_3_e_Maior_Idade) {
            System.out.println(pessoa_3.nome + " é maior de idade");
        } else {
            System.out.println(pessoa_3.nome + " é menor de idade");
        }

        // System.out.println(imc_pessoa_3);
        // System.out.println(pessoa_3_e_Maior_Idade);
    }
}
