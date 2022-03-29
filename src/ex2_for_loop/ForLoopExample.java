package ex2_for_loop;

import java.util.Arrays;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
        }
//        System.out.println(i);
        int[] numbers = new int[50];
        for(int i=0; i<numbers.length; i+=5){
            numbers[i] = i+1;
        }
//        Wypełnienie tablic dużych rozmiarów "ręcznie" jest ciężkie, lub wręcz niemożliwe. Dlatego pętle pozwalają
//        na ich wypełnienie/odczyt czy inne operacje na danych z tej tablicy

        System.out.println(Arrays.toString(numbers));

        for(int i=10; i>0; i-=3){
            System.out.println(i);
        }
//        Wykorzystując 3. sekcję możemy w dowolny sposób poruszać się po kolejnych elementach tablicy. We wcześniejszych
//        przykłądach przesuwaliśmy się po kolenych elementach od początku do końca, tu poruszamy się od góry w dół

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
//        Można stosować również pętle zagnieżdżone - uruchomienie wewnętrznej pętli przy każdej iteracji pętli
//        zewnętrznej


        //Wyświetlenie liczb od 0 do 10

        printEachNthNumberBelow(3, 25);

        String[] names = {"Asia", "Tomek", "Ola"};
        //Jak wypisać po kolei każde imie z wykrozsytaniem for?
        for(String name: names){
            System.out.println(name);
        }
//        Wykorzystanie pętli foreach. Java nie deklaruje osobnej pętli o tej nazwie, a jedynie specyficzny sposób
//        zapisu zwykłej pętli for. Pętla polega na wykonanie iteracji dla każdego elementu danego zbioru
//        for (String name :
//                names) {
//            System.out.println(name);
//        }
//        To samo co wyżej, stworzone z wykorzystanem 'foreach' wyświetlanego w InteliJ

        for(int i=0; i<names.length; i++)
//        System.out.println("kolejny");
        System.out.println(names[i]);
//        Możemy zapisać for bez nawiasów {} wtedy wykonywana jest jedynie najbliższa instrukcja pod deklaracją pętli
//        jednak zapis taki jest niezalecany ze względu na mniejszą czytelność i łatwość popełnienia błędu

        String text = "ala ma kota o imieniu belzebub";
        for (String word :
                text.split(" ")) {
            if (word.equals("kota")) {
                continue;
            }
            System.out.println(word);
        }
//        Wykorzystanie for dla kolekcji powstałej w wyniku podziału ciągu znaków (split() )

        int[] bankAccounts = { 0, 120, 99, 100, 50, 1000};
        System.out.println(Arrays.toString(bankAccounts));
//        for (int account : bankAccounts){
//            if(account>100){
//                continue;
//            }
//            System.out.println("Ddostajesz premie, zwiekszam saldo o 1 z " + account);
//            account += 1;
//            System.out.println(account);
//        }
//        W tym wypadku wynik operacji nie wpływa na dane w bankAccounts, ponieważ 'int account' tworzy nową zmienną
//        która przetrzymuje aktualny element w trakcie iteracji pętli
        for (int i = 0; i<bankAccounts.length; i++){
            if(bankAccounts[i]>100){
                break;
            }
            System.out.println("Ddostajesz premie, zwiekszam saldo o 1 z " + bankAccounts[i]);
            bankAccounts[i] += 1;
        }
        System.out.println(Arrays.toString(bankAccounts));
//        W tym wypadku modyfikujemy bezpośrednio elementy tablicy
    }

    public static void printEachNthNumberBelow(int n, int limit){
        System.out.println("Wyswietlam co " + n + " liczbę mniejszą niż " + limit);
            //Jak zaimplementować taką metodę z wykorzystaniem for?
        for(int i=0; i<limit; i+=n){
            System.out.println(i);
        }
    }
}
