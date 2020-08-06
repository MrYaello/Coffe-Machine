package machine;

import static machine.CoffeeMachine.menu;
import static machine.CoffeeMachine.print;
import static machine.lang.defLang;
import java.util.Scanner;

public class Main {

    public static String lang;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        print("Setup your language - (es, en) - ");
        lang = sc.next();

        defLang(lang);
        menu();

    }
}
