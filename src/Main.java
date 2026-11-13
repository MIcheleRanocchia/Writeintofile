import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WriteIntoFile writeintofile = new WriteIntoFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("scrivi qualcosa");
        String testo = scanner.nextLine();
        writeintofile.ScriviDentroUnFile(testo);

        }
    }