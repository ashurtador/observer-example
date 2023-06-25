import java.util.ArrayList;

public abstract class Subject {

    protected ArrayList<IObserver> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(IObserver observer){
        observers.add(observer);
    }

    public void removeObserver(IObserver observer){
        observers.remove(observer);
    }

    public abstract void notifiy();

    public ArrayList<IObserver> getObservers() {
        return observers;
    }
}
