package laboratorio.fase1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n----- SISTEMA HOSPITAL -----");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Atender paciente");
            System.out.println("3. Buscar paciente");
            System.out.println("4. Salir");
            System.out.println("5. Prueba de rendimiento");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Documento: ");
                    String documento = sc.nextLine();

                    System.out.print("Prioridad (1 = urgente, 2 = normal): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    hospital.registrarPaciente(nombre, documento, prioridad);
                    break;

                case 2:

                    Paciente p = hospital.atenderPaciente();

                    if (p != null) {
                        System.out.println("Atendiendo: " + p);
                    } else {
                        System.out.println("No hay pacientes en espera");
                    }

                    break;

                case 3:

                    System.out.print("Documento: ");
                    String doc = sc.nextLine();

                    Paciente encontrado = hospital.buscarPaciente(doc);

                    if (encontrado != null) {
                        System.out.println("Paciente encontrado: " + encontrado);
                    } else {
                        System.out.println("Paciente no encontrado");
                    }

                    break;

                case 5:

                    System.out.print("Cantidad de pacientes para la prueba: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    long inicio = System.nanoTime();

                    for (int i = 0; i < cantidad; i++) {
                        hospital.registrarPaciente("Paciente" + i, "DOC" + i, 2);
                    }

                    long fin = System.nanoTime();
                    long tiempo = fin - inicio;

                    Runtime runtime = Runtime.getRuntime();
                    long memoria = runtime.totalMemory() - runtime.freeMemory();

                    System.out.println("Tiempo de ejecucion: " + tiempo + " nanosegundos");
                    System.out.println("Memoria usada: " + memoria + " bytes");

                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");

            }

        } while (opcion != 4);

        sc.close();
    }
}