package machine;

import static machine.lang.*;
import static machine.Main.*;
import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static void remaining() {
        print(machineHas);
        print(water + ofWater);
        print(milk + ofMilk);
        print(beans + ofBeans);
        print(cups + ofCups);
        print(money + ofMoney);
        print("");
    }

    public static void print(String print) {
        System.out.println(print);
    }

    public static void buy() {
        Scanner scanner = new Scanner(System.in);
        print(wantBuy);
        String coffee = scanner.next().toLowerCase();
        switch (coffee) {
            case "1": //espresso
                if (water >= 250) {
                    if (beans >= 16) {
                        if (cups >= 1) {
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money += 4;
                            print(making);
                        } else {
                            print(notCups);
                        }
                    } else {
                        print(notBeans);
                    }
                } else {
                    print(notWater);
                }
                print("");
                break;

            case "2": //latte
                if (water >= 350) {
                    if (milk >= 75) {
                        if (beans >= 20) {
                            if (cups >= 1) {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                money += 7;
                                print(making);
                            } else {
                                print(notCups);
                            }
                        } else {
                            print(notBeans);
                        }
                    } else {
                        print(notMilk);
                    }
                } else {
                    print(notWater);
                }
                print("");
                break;

            case "3": // cappuccino
                if (water >= 200) {
                    if (milk >= 100) {
                        if (beans >= 12) {
                            if (cups >= 1) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                money += 6;
                                print(making);
                            } else {
                                print(notCups);
                            }
                        } else {
                            print(notBeans);
                        }
                    } else {
                        print(notMilk);
                    }
                } else {
                    print(notWater);
                }
                print("");
                break;

            case "back":
                print("");
                break;

            default:
                print(invalid);
                print("");
                break;
        }

    }

    public static void fill() {
        Scanner scan = new Scanner(System.in);
        print(manyWater);
        int addWater = scan.nextInt();
        water += addWater;

        print(manyMilk);
        int addMilk = scan.nextInt();
        milk += addMilk;

        print(manyBeans);
        int addBeans = scan.nextInt();
        beans += addBeans;

        print(manyCups);
        int addCups = scan.nextInt();
        cups += addCups;

        print("");
    }

    public static void take() {
        print(take + money);
        money = 0;

        print("");
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        print(action);
        String menu = sc.next().toLowerCase();

        if ("en".equals(lang)) {
            switch (menu) {
                case "buy":
                    buy();

                    menu();
                    break;

                case "fill":
                    fill();

                    menu();
                    break;

                case "take":
                    take();

                    menu();
                    break;

                case "remaining":
                    remaining();

                    menu();
                    break;

                case "exit":
                    break;

                default:
                    print(invalid);

                    print("");
                    menu();
                    break;
            }
        } else if ("es".equals(lang)) {
            switch (menu) {
                case "comprar":
                    buy();

                    menu();
                    break;

                case "llenar":
                    fill();

                    menu();
                    break;

                case "retirar":
                    take();

                    menu();
                    break;

                case "restante":
                    remaining();

                    menu();
                    break;

                case "salir":
                    break;

                default:
                    print(invalid);

                    print("");
                    menu();
                    break;
            }
        }
    }
}