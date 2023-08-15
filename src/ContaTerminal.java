public class ContaTerminal {

    private int number;
    private String ag;
    private String clientName;
    private float balance;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return ("Olá "+ clientName +
                " obrigado por criar uma conta em nosso banco, sua agência é "+ ag +", conta " + number +" e seu saldo "+ balance+ " já está disponível para saque");
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getAg() {
        return ag;
    }

    public String getClientName() {
        return clientName;
    }

    public float getBalance() {
        return balance;
    }

    public ContaTerminal(int number, String ag, String clientName, float balance) {
        this.number = number;
        this.ag = ag;
        this.clientName = clientName;
        this.balance = balance;
    }
}