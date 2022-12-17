package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        while (true){
            String str = scan.nextLine();

            if (str.equals("Stop")) {
                break;
            }
            switch (str) {
                case "Москва":
                    System.out.println("Россия");
                    break;
                    case "Владивосток":
                        System.out.println("Россия");
                        break;
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Ливерпуль":
                        System.out.println("Англия");
                        break;
                    case "Манчестер":
                        System.out.println("Англия");
                        break;
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                        System.out.println("Германия");
                        break;
                    case "Мюнхен":
                        System.out.println("Германия");
                        break;
                    case "Кёльн":
                        System.out.println("Германия");
                        break;
                case "Милан":
                    System.out.println("Италия");
                    break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }
        }
    }







