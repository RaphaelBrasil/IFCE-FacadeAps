// The Facade Design Pattern decouples or separates the client 
// from all of the sub components

// The Facades aim is to simplify interfaces so you don't have 
// to worry about what is going on under the hood

public class BankAccountFacade {
    //Informações privadas à classe.
    private int accountNumber;
    private int securityCode;

    //Instacia de todos os objetos criados anteriormente.
    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;
    WelcomeToBank bankWelcome;

    //Construtor para a classe que implementa o padrão de projeto.
    public BankAccountFacade(int newAcctNum, int newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();

        acctChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber() { return accountNumber; }
    public int getSecurityCode() { return securityCode; }

    //Verifica as informações da conta, e gerencia a função de saque.
    public void withdrawCash(double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transacao Completada\n");

        } else {

            System.out.println("Transacao falhou\n");

        }

    }

    //Checa as informações da conta e gerencia a função de depósito.
    public void depositCash(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                codeChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transacao Completada\n");

        } else {

            System.out.println("Transacao falhou\n");

        }

    }

}