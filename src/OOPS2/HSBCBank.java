package OOPS2;

public class HSBCBank implements USBank {
    @Override
    public void credit() {
        System.out.println("Credit Metod");
    }

    @Override
    public void debit() {
        System.out.println("debit Metod");
    }

    @Override
    public void tranfermoney() {
        System.out.println("transfer Metod");
    }

    public void educationloan(){
        System.out.println("education loan");
    }
    public void homeloan(){
        System.out.println("home loan");
    }
}
