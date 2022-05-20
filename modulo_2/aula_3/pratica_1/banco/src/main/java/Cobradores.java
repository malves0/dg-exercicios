import interfaces.ConsultaSaldo;
import interfaces.SaqueDinheiro;

public class Cobradores implements SaqueDinheiro, ConsultaSaldo {

    @Override
    public void realizar_consulta_saldo() {
        System.out.println("Cobradores consultando saldo");
    }

    @Override
    public void realizar_saque_dinheiro() {
        System.out.println("Cobradores realizando saque em dinheiroo");
    }

    @Override
    public void transacaoOk() {
        System.out.println("A transacao esta ok");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("A transacao esta nao deu certo");
    }
}
