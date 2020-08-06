import java.util.Scanner;

public class CoffeeMachine {

    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cups = 9;
    public static int money = 550;

    public static void remaining() {
        print("The coffee machine has:");
        print(water + " of water");
        print(milk + " of milk");
        print(beans + " of coffee beans");
        print(cups + " of disposable cups");
        print(money + " of money");
        print("");
    }

    public static void print(String print) {
        System.out.println(print);
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);

        print("Write action (buy, fill, take, remaining, exit):");
        String menu = sc.next().toLowerCase();

        switch (menu) {
            case "buy":
                print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String coffee = sc.next().toLowerCase();
                switch (coffee) {
                    case "1": //espresso
                        if (water >= 250) {
                            if (beans >= 16) {
                                if (cups >= 1) {
                                    water -= 250;
                                    beans -= 16;
                                    cups -= 1;
                                    money += 4;
                                    print("I have enough resources, making you a coffee!");
                                } else {
                                    print("Sorry, not enough disposable cups!");
                                }
                            } else {
                                print("Sorry, not enough coffee beans!");
                            }
                        } else {
                            print("Sorry, not enough water!");
                        }
                        print("");
                        menu();
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
                                        print("I have enough resources, making you a coffee!");
                                    } else {
                                        print("Sorry, not enough disposable cups!");
                                    }
                                } else {
                                    print("Sorry, not enough coffee beans!");
                                }
                            } else {
                                print("Sorry, not enough milk!");
                            }
                        } else {
                            print("Sorry, not enough water!");
                        }
                        print("");
                        menu();
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
                                        print("I have enough resources, making you a coffee!");
                                    } else {
                                        print("Sorry, not enough disposable cups!");
                                    }
                                } else {
                                    print("Sorry, not enough coffee beans!");
                                }
                            } else {
                                print("Sorry, not enough milk!");
                            }
                        } else {
                            print("Sorry, not enough water!");
                        }
                        print("");
                        menu();
                        break;

                    case "back":
                        print("");
                        menu();
                        break;

                    default:
                        print("Invalid action!");
                        print("");
                        menu();
                        break;
                }
                break;

            case "fill":
                print("Write how many ml of water do you want to add:");
                int addWater = sc.nextInt();
                water += addWater;

                print("Write how many ml of milk do you want to add:");
                int addMilk = sc.nextInt();
                milk += addMilk;

                print("Write how many grams of coffee beans do you want to add:");
                int addBeans = sc.nextInt();
                beans += addBeans;

                print("Write how many disposable cups of coffee do you want to add:");
                int addCups = sc.nextInt();
                cups += addCups;

                print("");
                menu();
                break;

            case "take":
                print("I gave you $" + money);
                money = 0;

                print("");
                menu();
                break;

            case "remaining":
                remaining();

                menu();
                break;

            case "exit":
                break;

            default:
                System.out.println("Invalid action!");

                print("");
                menu();
                break;
        }
    }

    public static void main(String[] args) {
        menu();
    }
}