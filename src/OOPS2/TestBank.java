package OOPS2;

public class TestBank {
    public static void main(String[] args) {
        HSBCBank hsbcBank=new HSBCBank();
        hsbcBank.credit();
        hsbcBank.debit();
        hsbcBank.educationloan();
        hsbcBank.homeloan();
        hsbcBank.tranfermoney();

        USBank u=new HSBCBank();
        u.credit();
        u.debit();
        u.tranfermoney();
        System.out.println(USBank.min_bal);
    }
}
