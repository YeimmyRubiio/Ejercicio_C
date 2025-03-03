import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String[] candidatos = {"Federico", "Alberto", "Charles"};
        int[] votos = new int[3]; // Contador de votos por candidato
        int[] costosCampana = new int[3]; // Costos de campaña por candidato
        int[] costosPublicidad = {700000, 200000, 600000}; // Costos por tipo de publicidad
        int totalVotos = 0;
        int opcion;

        do {
            System.out.println("\n********** MENÚ *********");
            System.out.println("1) Votar por un candidato");
            System.out.println("2) Calcular costo de la campaña");
            System.out.println("3) Vaciar las urnas");
            System.out.println("4) Conocer el número total de votos");
            System.out.println("5) Porcentaje de votos obtenidos por candidato");
            System.out.println("6) Costo promedio de campaña");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccione un candidato:");
                    for (int i = 0; i < candidatos.length; i++) {
                        System.out.println((i + 1) + ") " + candidatos[i]);
                    }
                    int candidato = teclado.nextInt();

                    if (candidato >= 1 && candidato <= 3) {
                        votos[candidato - 1]++;
                        totalVotos++;

                        System.out.println("\nSeleccione el medio que influyó en el voto:");
                        System.out.println("1) Internet");
                        System.out.println("2) Radio");
                        System.out.println("3) Televisión");
                        int medio = teclado.nextInt();

                        if (medio >= 1 && medio <= 3) {
                            costosCampana[candidato - 1] += costosPublicidad[medio - 1];
                        }
                    } else {
                        System.out.println("Candidato inválido.");
                    }
                    break;

                case 2:
                    System.out.println("\nSeleccione un candidato para ver su costo de campaña:");
                    for (int i = 0; i < candidatos.length; i++) {
                        System.out.println((i + 1) + ") " + candidatos[i]);
                    }
                    candidato = teclado.nextInt();
                    if (candidato >= 1 && candidato <= 3) {
                        System.out.println("El costo de campaña de " + candidatos[candidato - 1] + " fue: $" + costosCampana[candidato - 1]);
                    } else {
                        System.out.println("Candidato inválido.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < 3; i++) {
                        votos[i] = 0;
                        costosCampana[i] = 0;
                    }
                    totalVotos = 0;
                    System.out.println("Las urnas han sido vaciadas.");
                    break;

                case 4:
                    System.out.println("El número total de votos es: " + totalVotos);
                    break;

                case 5:
                    System.out.println("\nPorcentaje de votos por candidato:");
                    if (totalVotos > 0) {
                        for (int i = 0; i < 3; i++) {
                            double porcentaje = (votos[i] * 100.0) / totalVotos;
                            System.out.printf("%s: %.2f%% (%d votos)\n", candidatos[i], porcentaje, votos[i]);
                        }
                    } else {
                        System.out.println("No hay votos registrados.");
                    }
                    break;

                case 6:
                    if (totalVotos > 0) {
                        int costoTotal = 0;
                        for (int costo : costosCampana) {
                            costoTotal += costo;
                        }
                        int costoPromedio = costoTotal / totalVotos;
                        System.out.println("El costo promedio de campaña es: $" + costoPromedio);
                    } else {
                        System.out.println("No hay votos registrados.");
                    }
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        teclado.close();
    }
}
