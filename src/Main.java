import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie rozmiaru tablicy
        System.out.print("Podaj rozmiar tablicy (n): ");
        int n = scanner.nextInt();

        // Utworzenie tablicy
        int[] tablica = new int[n];

        // Wczytanie elementów do tablicy
        System.out.println("Wprowadź " + n + " liczb:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }

        // Obliczanie sumy za pomocą zagnieżdżonych pętli
        int suma = 0;
        int liczbaOperacji = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma += tablica[i];
                liczbaOperacji++;
            }
        }

        // Wyświetlenie wyniku
        System.out.println("Suma: " + suma);
        System.out.println("Wykonano " + liczbaOperacji + " operacji.");

        scanner.close();
    }
}