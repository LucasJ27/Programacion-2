public abstract class Cuenta {
    protected float balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyCommission =0;

    public Cuenta(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberConsignments() {
        System.out.println("Se han realizado " + numberConsignments + " depositos");
        return numberConsignments;
    }

    public void setNumberConsignments(int numberConsignments) {
        this.numberConsignments = numberConsignments;
    }

    public int getNumberWithdrawals() {
        System.out.println("Se han realizado " + numberWithdrawals + " retiros");
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public float getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(float annualRate) {
        this.annualRate = annualRate;
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }

    public void consignMoney(float amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Se han depositado " + amount + " pesos. Saldo actual: " + this.balance + " pesos.");
            numberConsignments +=1;
        } else if (amount < 0) {
            System.out.println("El monto ha depositar debe ser mayor a 0");
        }
    }

    public void withdrawals(float takeout){
        if (takeout < balance){
            this.balance -= takeout;
            System.out.println("Se han retirado " + takeout + " pesos. Saldo actual: " + this.balance + " pesos.");
            numberWithdrawals +=1;
        } else if (takeout > balance) {
            System.out.println("El monto a retirar supera el saldo disponible en tu cuenta");
        }
    }
    public void monthlyInterest(){
        float monthlyInt = (annualRate / 12);
        float monthlyIntAcc = monthlyInt * balance;
        System.out.println("El interés mensual de la cuenta es: " + monthlyIntAcc);
        balance += monthlyIntAcc;
        System.out.println("El nuevo saldo de la cuenta es: " + balance);
    }
    public void monthlyStatement(){
        monthlyInterest();
        balance -= monthlyCommission;
        System.out.println("El saldo después de aplicar la comisión mensual y el interés mensual es: " + balance);
    }
    public void Print(){
        System.out.println("El saldo actual de la cuenta es: " + this.balance);
        System.out.println("El interes anual es del: " + this.annualRate + "%");
        System.out.println("La comision anual que se le aplica a la cuenta es del: " +this.monthlyCommission + "%" );
    }
}
