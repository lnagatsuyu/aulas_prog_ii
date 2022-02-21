public class Conta {
    int numero;
    float saldo;

    public Conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void debitaSaldo(float debito){
        this.saldo = this.saldo - debito;
    }

    public void creditaSaldo(float saldo){
        this.saldo = this.saldo + saldo;
    }

    public String retornaConta(){
        return "Numero da conta: " + this.numero + "  Saldo: " + this.saldo;
    }

}

