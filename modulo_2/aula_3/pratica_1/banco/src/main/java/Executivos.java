import interfaces.Deposito;
import interfaces.Transferencia;

public class Executivos implements Deposito, Transferencia {
    @Override
    public void fazer_deposito() {
        System.out.println("Executivos fazendo deposito");
    }

    @Override
    public void transacaoOk() {
        System.out.println("Tudo certo por aqui");
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("Algo deu errado");
    }

    @Override
    public void realizar_transferencia() {
        System.out.println("Executivos realizando transferencia");
    }
}
