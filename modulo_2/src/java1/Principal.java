package java1;

public class Principal {

    public static void main(String[] args) {
        String[] vetor_cidades = new String[10];
        vetor_cidades[0] = "Londres";
        vetor_cidades[1] = "Madrid";
        vetor_cidades[2] = "Nueva York";
        vetor_cidades[3] = "Buenos Aires";
        vetor_cidades[4] = "Asunción";
        vetor_cidades[5] = "São Paulo";
        vetor_cidades[6] = "Lima";
        vetor_cidades[7] = "Santiago de Chile";
        vetor_cidades[8] = "Lisboa";
        vetor_cidades[9] = "Tokio";

        int i;
        for (i=0; i<10; i++) {
            System.out.println(vetor_cidades[i]);
        }
    }
}
