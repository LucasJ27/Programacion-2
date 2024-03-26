public class CuentaDeAhorros extends Cuenta {
    private boolean activeAccount;

    public CuentaDeAhorros(float balance, float annualRate, boolean activeAccount) {
        super(balance, annualRate);
        if (balance < 10000){
            this.activeAccount = false;
        }else{
            this.activeAccount = true;
        }
    }

    public boolean isActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    @Override
    public void consignMoney(float amount){
        if (activeAccount){
            super.consignMoney(amount);
        } else {
            System.out.println("No se puede depositar dinero porque la cuenta esta inactiva");
        }
    }
    @Override
    public void withdrawals(float takeout){
        if (activeAccount){
            super.withdrawals(takeout);
        } else {
            System.out.println("No se puede retirar dinero porque la cuenta esta inactiva");
        }
    }

    @Override
    public void monthlyStatement() {
        if (this.numberWithdrawals > 4) { // Si el número de retiros es mayor que 4
            super.monthlyCommission = 1000 * (this.numberWithdrawals - 4); // Calculamos la comisión adicional
        }
        this.balance -= super.monthlyCommission;
        System.out.println("La comision mensual es de: $" + super.monthlyCommission);
        System.out.println("Saldo después de restar comisión mensual: " + this.balance);
        if (!isActiveAccount()){
            System.out.println("Saldo: $" + this.balance);
            System.out.println("Estado de la cuenta: Cuenta inactiva");
        } else{
            System.out.println("Saldo: $" + this.balance);
            System.out.println("Estado de la cuenta: Cuenta Activa");
        }
    }
    @Override
    public void Print() {
        System.out.println("Saldo de la cuenta: $" + this.balance);
        System.out.println("Comisión mensual: $" + super.monthlyCommission);
        System.out.println("Número total de transacciones realizadas: " + (this.numberWithdrawals + this.numberConsignments));
    }
}
