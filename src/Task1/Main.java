package Task1;

public class Main {
    public static void main(String[] args) {
        razdelitel();
        System.out.println("\n\t\t\t~Как я провёл лето~\n");
        System.out.println("\tХорошо. Первый месяц работал, затем немного отдохнул.\nПоработал ещё месяц пока было что делать.\n");
        System.out.println("\tСнова поехал отдыхать. Нашел новую работу\n");
        razdelitel();
    }

    public static void razdelitel() {
        for (int i = 0; i < 60; i++)
            System.out.print("=");
        System.out.println();
    }
}
