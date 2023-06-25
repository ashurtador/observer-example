import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Evento event = new Evento();
        transacciones(event);
    }

    public static void transacciones(Evento event){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("" +
                "1- Suscribir repositorio \n" +
                "2- Desuscribir repositorio \n" +
                "3- Generar transacción \n" +
                "4- Salir");
        int menuOption = sc.nextInt();

        switch (menuOption){
            case 1:
                System.out.println("Suscribir repositorio");
                String repositoryToBeAdded = sc2.nextLine();

                Repositorio repositorio = new Repositorio(repositoryToBeAdded);
                event.addObserver(repositorio);

                System.out.println("Ahora se enviaran eventos al repositorio: " + repositoryToBeAdded);
                transacciones(event);
                break;

            case 2:
                event.getObservers().forEach(System.out::println);

                System.out.println("Desuscribir repositorio");
                String repositoryToBeRemoved = sc2.nextLine();

                event.removeByName(repositoryToBeRemoved);
                System.out.println("Ya no se enviaran eventos al repositorio: " + repositoryToBeRemoved);
                transacciones(event);
                break;

            case 3:
                System.out.println("Seleccione el tipo de transacción a generar \n" +
                        "1- Consulta de Productos \n" +
                        "2- Detalle de Movimientos \n" +
                        "3- Pagos \n" +
                        "4- Transferencias");

                String confirmacion = sc2.nextLine();
                event.addEvent(confirmacion);
                transacciones(event);
                break;
            case 4:
                System.out.println("Gracias por utilizar nuestro sistema!");
                break;
        }
    }

    }