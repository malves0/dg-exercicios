import interfaces.ConsultaSaldo;
import interfaces.PagamentoServicos;
import interfaces.SaqueDinheiro;

public class Basico implements ConsultaSaldo, PagamentoServicos, SaqueDinheiro {

    @Override
    public void realizar_consulta_saldo() {
        System.out.println("Basico consultando saldo");
    }

    @Override
    public void realizar_pagamento_servicos() {
        System.out.println("Basico realizando pagamento de servicos");
    }

    @Override
    public void realizar_saque_dinheiro() {
        System.out.println("Basico realizando saque em dinheiro");
    }


    @Override
    public void transacaoOk() {
        System.out.println("A transacao esta ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("A transacao nao esta ok!!");
    }
}
