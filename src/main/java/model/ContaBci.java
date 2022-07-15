package model;


public class ContaBci {
    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;

    //No requisto do enuciado pediam que...
    //o atributo tivesse o tipo String mas ele é do tipo date por referencia uma data
    private String dataAbertura;

    public ContaBci() {
    }

    public ContaBci(String nomeTitular, int numero, String agencia, double saldo, String dataAbertura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = String.valueOf(dataAbertura);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';
    }
}
