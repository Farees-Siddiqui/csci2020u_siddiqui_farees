import java.util.ArrayList;
import java.util.Arrays;

public class MementoImplementation {
    public static void main(String[] args){
        // Create new Originator Object
        Originator originator = new Originator();

        // Create new CareTaker Object
        CareTaker careTaker = new CareTaker();

        // Create arraylist to hold shopping cart
        ArrayList<String> cart = new ArrayList<String>();

        // Add eggs to shopping cart
        originator.setState(new ArrayList<>(Arrays.asList("Eggs")));

        // Add eggs milks and juice to the shopping cart and save the state to the originator
        originator.setState(new ArrayList<>(Arrays.asList("Eggs", "Milk", "Juice")));
        careTaker.add(originator.saveStateToMemento());

        // Add sugar and flour to the originator and save as another state in the originator
        originator.setState(new ArrayList<>(Arrays.asList("Eggs", "Sugar", "Milk", "Juice", "Flour")));
        careTaker.add(originator.saveStateToMemento());

        // Print current state
        System.out.println("Current State: " + originator.getState());

        // Revert to first saved state and print it
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        // Revert to second saved state and print it
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
