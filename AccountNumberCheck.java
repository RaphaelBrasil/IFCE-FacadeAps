public class AccountNumberCheck{
    //Base de dados com todas as contas cadastradas. Neste exemplo, só temos uma.
    private int accountNumber = 12345678;

    public int getAccountNumber() { return accountNumber; }

    public boolean accountActive(int acctNumToCheck){
        //Verifica se o número da conta está correto.
        if(acctNumToCheck == getAccountNumber()) {

            return true;

        } else {

            return false;

        }

    }

}