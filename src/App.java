import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // L'UTENTE INSERISCE 10 NUMERI IN UN ARRAY

        // Variabili
        int scelta, num = 0, somma = 0, prodotto = 0, minimo = 11, massimo = 0;
        boolean again = true;
        // Creo l'array
        int[] numeri = new int[10];

        do {
            // Input numeri nell'array
            for (int i = 0; i < 10; i++) {
                do {
                    System.out.println("Inserisci il numero #" + (i + 1));
                    num = sc.nextInt();
                    if (num < 1 || num > 10) {
                        System.out.println("Inserimento non valido");
                    } else {
                        numeri[i] = num;
                    }
                } while (num < 1 || num > 10);
            }

            // Scelta operazione

            do {
                System.out.println(
                        "Quale operazione vuoi eseguire? \n 1) Somma \n 2) Prodotto \n 3) Numero massimo \n 4) Numero minimo");
                scelta = sc.nextInt();
                if (scelta < 0 || scelta > 4) {
                    System.out.println("Inserimento non valido");
                } else {
                    switch (scelta) {
                        case 1:
                            for (int i = 0; i < 10; i++) {
                                somma = somma + numeri[i];
                            }
                            System.out.println("La somma dei tuoi numeri è: " + somma);
                            break;
                        case 2:
                            prodotto = numeri[0];
                            for (int i = 0; i < 10; i++) {

                                prodotto = prodotto * numeri[i];

                            }
                            System.out.println("Il prodotto dei tuoi numeri è: " + prodotto);
                            break;
                        case 3:
                            for (int i = 0; i < 10; i++) {

                                if (massimo < numeri[i]) {
                                    massimo = numeri[i];

                                }
                            }
                            System.out.println("Il numero massimo è " + massimo);
                            break;
                        case 4:
                            for (int i = 0; i < 10; i++) {

                                if (minimo > numeri[i]) {
                                    minimo = numeri[i];

                                }
                            }
                            System.out.println("Il numero minimo è " + minimo);
                            break;

                        default:
                            System.out.println("Inserimento non valido");
                            break;
                    }
                }
            } while (scelta < 0 || scelta > 4);
            System.out.println("Vuoi ricominciare?");
            again = sc.nextBoolean();

        } while (again);
         System.out.println("Grazie per avere utilizzato il nostro servizio. Alla prossima!");
        sc.close();
    }
}
