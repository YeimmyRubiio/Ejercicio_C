import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Lista de nombres de los candidatos para mejorar la organización
        String[] candidatos = {"Federico", "Alberto", "Charles"};
        
        // Arreglo para almacenar la cantidad de votos por candidato
        int[] votos = new int[3]; // Se inicializan en 0 automáticamente
        
        // Arreglo para almacenar los costos de campaña por candidato
        int[] costosCampana = new int[3]; // Se inicializan en 0 automáticamente
        
        // Arreglo con los costos fijos por tipo de publicidad (Internet, Radio, Televisión)
        int[] costosPublicidad = {700000, 200000, 600000};
        
        // Variable para almacenar el total de votos
        int totalVotos = 0;
        int opcion;

        do {
            // Se presenta el menú de opciones al usuario
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
                    // Opción para votar por un candidato
                    System.out.println("\nSeleccione un candidato:");
                    for (int i = 0; i < candidatos.length; i++) {
                        System.out.println((i + 1) + ") " + candidatos[i]);
                    }
                    int candidato = teclado.nextInt();

                    // Validación de la opción ingresada
                    if (candidato >= 1 && candidato <= 3) {
                        votos[candidato - 1]++; // Incrementa el contador de votos del candidato
                        totalVotos++; // Incrementa el contador total de votos

                        // Se pregunta el medio de publicidad que influyó en el voto
                        System.out.println("\nSeleccione el medio que influyó en el voto:");
                        System.out.println("1) Internet");
                        System.out.println("2) Radio");
                        System.out.println("3) Televisión");
                        int medio = teclado.nextInt();

                        // Se valida el medio de publicidad y se suma el costo correspondiente
                        if (medio >= 1 && medio <= 3) {
                            costosCampana[candidato - 1] += costosPublicidad[medio - 1];
                        }
                    } else {
                        System.out.println("Candidato inválido.");
                    }
                    break;

                case 2:
                    // Opción para ver el costo de campaña de un candidato
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
                    // Vaciar las urnas (restablecer votos y costos)
                    for (int i = 0; i < 3; i++) {
                        votos[i] = 0;
                        costosCampana[i] = 0;
                    }
                    totalVotos = 0;
                    System.out.println("Las urnas han sido vaciadas.");
                    break;

                case 4:
                    // Mostrar el número total de votos registrados
                    System.out.println("El número total de votos es: " + totalVotos);
                    break;

                case 5:
                    // Mostrar el porcentaje de votos obtenidos por cada candidato
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
                    // Calcular y mostrar el costo promedio de la campaña
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
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        teclado.close(); // Se cierra el scanner para liberar recursos
    }
}
