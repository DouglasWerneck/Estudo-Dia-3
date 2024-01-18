public class Main {

    public static void main(String[] args) {
        boolean temEmprego = true;
        boolean temEmpresa = true;
        boolean tem50k = false;
        boolean podeFinanciar = (temEmprego || temEmpresa) && tem50k  ;
        System.out.println(podeFinanciar);
    }
}