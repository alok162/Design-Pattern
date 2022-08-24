public interface Observer {
    update (float interest);
}

public class RbiBank {
    List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyAll() {
        for (Observer observer : observers) {
            observer.update(7.5);
        }
    }
}

public class Sbi implements Observer {
    
    @Override
    public void update(float interest) {
        System.out.println("updated interest rate from RBu guidelines " + interest);
    }
}

public class BankOfBaroda implements Observer {

    @Oberride
    public void update(float interest) {
        System.out.println("updated interest rate from RBu guidelines " + interest);
    }
}