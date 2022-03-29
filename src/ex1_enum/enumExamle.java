package ex1_enum;

public class enumExamle {
    public static void main(String[] args) {
        Priority lowPrio = Priority.LOW;
        Priority highPrio = Priority.HIGH;
//        Priority myPrion = "LOW";
//        Ponieważ enum jest nowym, zadeklarowanym przez nas typem danych, zmienna tego typu może przetrzymywać
//        jedynie tego typu. Dlatego nie możemy do niego przypisać np. "LOW", który jest strigniem
        printPrio(Priority.LOW);


        System.out.println(lowPrio);
        //Wyświetlenie zdefiniowanej nazwy - 'LOW'
        System.out.println(lowPrio.ordinal());
        //Wyświetlenie numeru porządkowego dla 'LOW' - 0
        System.out.println(highPrio.ordinal());
        //Wyświetlenie numeru porządkowego dla 'HIGH' - 2


        Country country = Country.PL;

        System.out.println(country);
        //Wyświetlenie zdefiniowanej nazwy - 'PL'
        System.out.println(country.getFullName());
        //Wyświetlenie wartości zdefiniowanej w polu 'fullName' - 'Poland'
    }

    public static void printPrio(Priority prio){
        System.out.println("Twój wybrany priorytet to " + prio);
    }
//    Nowy typ danych (w tym wypadku enum) może być typem argumentu przekazywanego do metody. Zapewnia to przy
//    jej wywołaniu, że dane będą odpowiedniego typu.
}
