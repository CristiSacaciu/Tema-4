package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        Integer corect = 0, wrong = 0;
        System.out.println("1. Cati ani am?");
        System.out.println("A: 14\n" +
                "B: 18\n" +
                "C: 20\n" +
                "D: 30");
        System.out.println("\nAlegeti varianta:");
        answer = scanner.next();

        if(answer.equalsIgnoreCase("C")){
            System.out.println("\nAti raspuns corect!\n");
            corect = corect +1;
        }else{
            wrong = wrong + 1;
            System.out.println("\nRaspuns gresit, varianta C era cea corecta!\n");
        }

        System.out.println("2. Din ce oras sunt?");
        System.out.println("A: Oradea\n" +
                "B: Bucuresti\n" +
                "C: Craiova\n" +
                "D: Budapesta");
        System.out.println("\nAlegeti varianta:");
        answer = scanner.next();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("A")){
            System.out.println("\nAti raspuns corect!\n");
            corect = corect +1;
        }else{
            wrong = wrong + 1;
            System.out.println("\nRaspuns gresit, varianta C era cea corecta!\n");
        }

        System.out.println("3. Care este facultatea la care sunt?");
        System.out.println("""
                A: Ieti
                B: Ieti
                C: Ieti
                D: Ieti""");
        System.out.println("\nAlegeti varianta:");
        answer = scanner.next();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C") || answer.equalsIgnoreCase("D")){
            System.out.println("\nAti raspuns corect!\n");
            corect = corect +1;
        }else{
            wrong = wrong + 1;
            System.out.println("\nRaspuns gresit, era cam simplu!\n");
        }

        System.out.println("4. Care este capitala Romaniei?");
        System.out.println("""
                A: Romania
                B: Budapesta
                C: Deva
                D: Bucuresti""");
        System.out.println("\nAlegeti varianta:");
        answer = scanner.next();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("D")){
            System.out.println("\nAti raspuns corect!\n");
            corect = corect +1;
        }else{
            wrong = wrong + 1;
            System.out.println("\nRaspuns gresit, varianta D era cea corecta!\n");
        }

        System.out.println("5. Ce se intampla?");
        System.out.println("""
                A: Nimic
                B: Multe
                C: Nu stiu
                D: Nu stim""");
        System.out.println("\nAlegeti varianta:");
        answer = scanner.next();
        System.out.println(answer);
        if(answer.equalsIgnoreCase("D")){
            System.out.println("\nAti raspuns corect!\n");
            corect = corect +1;
        }else{
            wrong = wrong + 1;
            System.out.println("\nRaspuns gresit, varianta D era cea corecta!\n");
        }
        System.out.println("\nRaspunsuri corecte: " + corect);
        System.out.println("\nRaspunsuri gresite: " + wrong);
        System.out.println("\nProcentaj: " + corect*100/5 + " %");


    }


}