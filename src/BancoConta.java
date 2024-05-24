public class BancoConta {
    
    private int numero;
    private String agencia;
    private String nome;
    private float saldo;

    public BancoConta() {
    }

    public BancoConta(int numero, String agencia, String nome, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    

}
