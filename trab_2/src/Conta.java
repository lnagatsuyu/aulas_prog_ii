public class Conta {
    public int numero;
    public float saldo;

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

    public boolean setSaldo(float saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
            return true;
        }else{
            return false;
        }
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

