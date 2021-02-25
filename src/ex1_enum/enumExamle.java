package ex1_enum;

public class enumExamle {
    public static void main(String[] args) {
        Priority lowPrio = Priority.LOW;
        Priority highPrio = Priority.HIGH;

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
}
