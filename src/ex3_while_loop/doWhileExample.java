package ex3_while_loop;

public class doWhileExample {
    public static void main(String[] args) {
        int i=11, j=8;
        System.out.println("While example");
        while(i<10){
            System.out.println("Twoja liczba to " + i);
//            System.out.println(j++);
            i++;
        }
//      Pętla ze sprawdzeniem warunku przed każdą iteracją

//        while(true){
//            System.out.println("Wykonuje operacje w mojej aplikacji");
//        }
//        Pętla będzie wykonywania nieskończenie wiele razy, chyba że wewnątrz zastosujemy warunek logiczny, w wyniku
//        którego wywołany zostanie 'break'

        System.out.println("\nDo-While example");
        do{
            System.out.println("Twoja liczba to " + j);
            j++;
        } while (j<10);
//        Pętla niemal identyczna jak 'while', jednak pierwsza iteracja jest uruchamiana bez sprawdzenia warunku


        //Co się stanie jeśli zamienimy wartości początkowe 'i' oraz 'j' na 9 a co jeśli na 10?

        showEvenNumbersBelow(100);
    }

public static void showEvenNumbersBelow(int limit){
        //Wyświetl wszystkie liczby parzyste poniżej danej liczby 'limit'
    int i = 0;
    while(i < limit){
        if(i%2 == 0){
            System.out.println(i);
        }
        i++;
    }
}
 }
