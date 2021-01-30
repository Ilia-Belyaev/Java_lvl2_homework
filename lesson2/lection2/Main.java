package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson2.lection2;

public class Main {

    public static void main(String ...args) throws PositifCreditException, NegatifDebitException {
        Banc banc = new Banc();
        Account compte=banc.getAccount("Maria", "pass");
        compte.debit(150);
        banc.saveData();
        Banc banc2 = new Banc();
        Account compte2=banc.getAccount("Maria", "pass");
        compte2.checkBalance();
    }
}
