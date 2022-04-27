package atividadedeoo;

public class ContaCorrente {

    private int numero, agencia;
    private double saldo;

    public void inicializarContaCorrente(int n, int ag) {
        numero = n;
        agencia = ag;
        saldo = 0;
    }

    public void sacar(double valor) {
        if(valor < this.saldo)        
            saldo = saldo - valor;
        else
            System.out.println("Saldo insuficiente!");
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public double consultarSaldo() {
        return (saldo);
    }

    /**Metodo utilizado para exibir informações da conta corrente
     * @return String de informações da conta
     */      
    public String exibe() {
        String retorno = "Agência: " + this.agencia + "\n";
        retorno += "Conta: " + this.numero + "\n";
        retorno += "Saldo: R$" + this.saldo + "\n";
        return retorno;
    }

}
