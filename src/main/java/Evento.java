public class Evento extends Subject {

    private String eventName;

    public void addEvent(String confirmacion){

        switch (confirmacion){
            case "1":
                this.eventName = "Consulta de Productos";
                break;
            case "2":
                this.eventName = "Detalle de Movimientos";
                break;
            case "3":
                this.eventName = "Pagos";
                break;
            case "4":
                this.eventName = "Transferencias";
                break;
            default:
                this.eventName = "Evento no encontrado";
                break;
        }

        System.out.println("Evento agregado");
        this.notifiy();
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public void notifiy() {
        observers.forEach(observer -> observer.update(this.eventName));
    }

    public void removeByName(String repositoryName){
        this.removeObserver(observers.stream()
                .filter(observer -> observer instanceof Repositorio && ((Repositorio) observer).getRepositoryName().equals(repositoryName))
                .findFirst()
                .get());
    }

}

