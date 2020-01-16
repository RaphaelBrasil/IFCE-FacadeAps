public class TestBankAccount {

    public static void main(String[] args){
        //A classe que implementa o design Facade é instanciada aqui.
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        //Agora, podemos fazer as solicitações diretamente ao accessingBank
        accessingBank.withdrawCash(50.00);
        //O processo é feito em background, uma fachada é tudo que precisamos.
        accessingBank.withdrawCash(900.00);
        //Uma fachada pode ter várias métodos.
        accessingBank.depositCash(200.00);

    }

}