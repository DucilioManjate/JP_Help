import model.ContaBci;
import model.ContaBim;

public class MainClass {
    public static void main(String[] args) {

        final int TotalDeContas = 50;
        ContaBci ct[] = new ContaBci[TotalDeContas];

        ContaBci contaBci = new ContaBci();
        contaBci.setNomeTitular("souza");
        contaBci.setNumero(0000000);
        contaBci.setAgencia("BCI");
        contaBci.setDataAbertura("14/07/2022");
        contaBci.setSaldo(20.000);
        System.out.println("Extrato bancario do souja");
        System.out.println(contaBci);

    }
    

}
