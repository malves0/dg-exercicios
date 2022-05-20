/**
 * @author Micaela Alves
 */

public class Main {
    public static void main(String[] args) {

        Executivos executivo1 = new Executivos();
        executivo1.fazer_deposito();
        executivo1.transacaoOk();
        executivo1.realizar_transferencia();
        executivo1.transacaoNaoOk();

        Basico basic1 = new Basico();
        basic1.realizar_consulta_saldo();
        basic1.realizar_pagamento_servicos();
        basic1.realizar_consulta_saldo();
        basic1.transacaoNaoOk();
        basic1.transacaoNaoOk();

        Cobradores cobrador1 = new Cobradores();
        cobrador1.realizar_saque_dinheiro();
        cobrador1.transacaoOk();
        cobrador1.realizar_consulta_saldo();
        cobrador1.transacaoNaoOk();
    }
}
