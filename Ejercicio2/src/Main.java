public class Main {
    public static void main(String[] args) {
        CuentaDeAhorros c1 = new CuentaDeAhorros(11000,0.1F,true);
        c1.consignMoney(5000);
        c1.withdrawals(1000);
        c1.withdrawals(1000);
        c1.withdrawals(1000);
        c1.withdrawals(1000);
        c1.withdrawals(1000);
        c1.monthlyStatement();
        c1.Print();
        /*CuentaCorriente c2 = new CuentaCorriente(20000,0.05F,0);
        c2.withdrawals(11000);
        c2.consignMoney(1000);
        c2.monthlyStatement();
        c2.Print();*/


    }
}
