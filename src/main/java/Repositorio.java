public class Repositorio implements IObserver {

    private String repositoryName;

    public Repositorio(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public void update(String param) {

        System.out.println(repositoryName + ": Hemos generado un evento transaccional: " + param);

    }

    public String getRepositoryName() {
        return repositoryName;
    }

}
