package POO_JAVA_I.pratica_integradora_I;

public class Principal {

    public static void main(String[] args) {
        String[] vetor_cidades = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] matrix_temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int i;
        int higher_temp = matrix_temperatures[0][0];
        String hot_city = null;
        int lower_temp = matrix_temperatures[0][0];
        String cold_city = null;
        for (i = 0; i < vetor_cidades.length; i++) {
            if (matrix_temperatures[i][1] >= higher_temp) {
                higher_temp = matrix_temperatures[i][1];
                hot_city = vetor_cidades[i];
            }
            if (matrix_temperatures[i][0] <= lower_temp) {
                lower_temp = matrix_temperatures[i][0];
                cold_city = vetor_cidades[i];
            }
        }
        System.out.println("A temperatura mais baixa foi em "+cold_city + ", com " + lower_temp + " C");
        System.out.println("A temperatura mais alta foi em "+hot_city + ", com " + higher_temp + " C");
    }
}
