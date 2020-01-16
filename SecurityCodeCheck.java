public class SecurityCodeCheck {
    //Base de dados com a senha cadastrada. Neste exemplo, só temos uma.
    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int secCodeToCheck){
        //Verifica se a senha está correta.
        if(secCodeToCheck == getSecurityCode()) {

            return true;

        } else {

            return false;

        }

    }

}