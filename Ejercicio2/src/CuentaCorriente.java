public class CuentaCorriente extends Cuenta{
    private float sobregiro = 0;

    public CuentaCorriente(float balance, float annualRate, int sobregiro) {
        super(balance, annualRate);
        this.sobregiro = sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    @Override
    public void withdrawals(float takeout){
        if (takeout > balance){
            this.sobregiro = takeout - balance;
            this.balance = 0; // Se establece el saldo en cero ya que se retirará más de lo que hay en la cuenta
            System.out.println("El saldo es: 0");
            System.out.println("El sobregiro es: " + this.sobregiro);
            numberWithdrawals += 1;
        } else {
            this.balance -= takeout;
            System.out.println("Se han retirado " + takeout + " pesos. Saldo actual: " + this.balance + " pesos.");
            numberWithdrawals += 1;
        }
    }
    @Override
    public void consignMoney(float amount){
        if(this.sobregiro > 0){
            // Si hay sobregiro, la cantidad consignada reduce el sobregiro
            if (amount >= this.sobregiro) {
                // Si la cantidad consignada es suficiente para cubrir completamente el sobregiro
                amount -= this.sobregiro; // Reducimos la cantidad consignada por el monto del sobregiro
                this.sobregiro = 0; // El sobregiro se establece en cero
                this.balance += amount; // El saldo se incrementa con el resto de la cantidad consignada
            } else {
                // Si la cantidad consignada no es suficiente para cubrir completamente el sobregiro
                this.sobregiro -= amount; // Reducimos el sobregiro por el monto de la cantidad consignada
            }
        } else {
            // Si no hay sobregiro, la cantidad consignada aumenta el saldo
            this.balance += amount;
        }
        numberConsignments += 1;
        System.out.println("Se han depositado $" + amount);
        System.out.println("El saldo actual es: " + this.balance);
        System.out.println("El sobregiro actual es: " + this.sobregiro);
    }
    @Override
    public void monthlyStatement(){
        super.monthlyStatement();
    }
    @Override
    public void Print() {
        System.out.println("Saldo de la cuenta: $" + this.balance);
        System.out.println("Comisión mensual: $" + super.monthlyCommission);
        System.out.println("Número total de transacciones realizadas: " + (this.numberWithdrawals + this.numberConsignments));
        System.out.println("Sobregiro: $" + sobregiro);
    }

}
