public class FundsCheck {
    //Saldo inicial da conta.
    private double cashInAccount = 1000.00;
    //Retorna o valor atual da conta.
    public double getCashInAccount() { return cashInAccount; }
    //Subtrai dinheiro da conta. Utilizada durante um saque.
    public void decreaseCashInAccount(double cashWithdrawn) { cashInAccount -= cashWithdrawn; }
    //Acrescenta dinheiro a conta. Utilizada durante um depósito.
    public void increaseCashInAccount(double cashDeposited) { cashInAccount += cashDeposited; }
    //Verifica se o saldo atual é suficiente para realizar um saque.
    public boolean haveEnoughMoney(double cashToWithdrawal) {
        //Saldo insuficiente
        if(cashToWithdrawal > getCashInAccount()) {

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;
            //Saldo com valor suficiente
        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());

            return true;

        }

    }
    //Adiciona dinheiro a conta.
    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());

    }

}