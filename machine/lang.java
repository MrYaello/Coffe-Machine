package machine;

public class lang {

    public static String action;
    public static String wantBuy;
    public static String making;
    public static String notCups;
    public static String notBeans;
    public static String notMilk;
    public static String notWater;
    public static String invalid;
    public static String machineHas;
    public static String ofWater;
    public static String ofMilk;
    public static String ofBeans;
    public static String ofCups;
    public static String ofMoney;
    public static String manyWater;
    public static String manyMilk;
    public static String manyCups;
    public static String manyBeans;
    public static String take;

    public static void defLang(String language) {
        if ("es".equals(language)) {
            action = "Escribe una acción (comprar, llenar, retirar, restante, salir):";
            wantBuy = "¿Qué es lo que quieres comprar? 1 - espresso, 2 - latte, 3 - cappuccino, regresar - al menu principal:";
            making = "Tengo recursos suficientes, ¡preparando tu café!";
            notCups = "Lo siento, ¡no tengo tazas suficientes!";
            notBeans = "Lo siento, ¡no tengo café soluble suficiente!";
            notMilk = "Lo siento, ¡no tengo leche suficiente!";
            notWater = "Lo siento, ¡no tengo agua suficiente!";
            invalid = "¡Acción Invalida!";
            machineHas = "La máquina de café tiene:";
            ofWater = "ml de agua.";
            ofMilk = "ml de leche.";
            ofBeans = "gr de café soluble.";
            ofCups = " tazas.";
            ofMoney = " de dinero.";
            manyWater = "Escribe cuántos ml de agua deseas agregar:";
            manyMilk = "Escribe cuántos ml de leche deseas agregar:";
            manyCups = "Escribe cuántas tazas deseas agregar:";
            manyBeans = "Escribe cuántos gr de café soluble deseas agregar:";
            take = "Te entrego $";
        } else if ("en".equals(language)) {
            action = "Write action (buy, fill, take, remaining, exit):";
            wantBuy = "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:";
            making = "I have enough resources, making you a coffee!";
            notCups = "Sorry, not enough disposable cups!";
            notBeans = "Sorry, not enough coffee beans!";
            notMilk = "Sorry, not enough milk!";
            notWater = "Sorry, not enough water!";
            invalid = "Invalid action!";
            machineHas = "The coffee machine has:";
            ofWater = "ml of water.";
            ofMilk = "ml of milk.";
            ofBeans = "gr of coffee beans.";
            ofCups = " of disposable cups.";
            ofMoney = " of money.";
            manyWater = "Write how many ml of water do you want to add:";
            manyMilk = "Write how many ml of milk do you want to add:";
            manyCups = "Write how many grams of coffee beans do you want to add:";
            manyBeans = "Write how many disposable cups of coffee do you want to add:";
            take = "I gave you $";
        }
    }

}
