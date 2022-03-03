import java.util.ArrayList;
public class Originator {
    private ArrayList<String> state;

    public void setState(ArrayList<String> cart){
        this.state = cart;
    }

    public ArrayList<String> getState(){
        return this.state;
    }

    public Memento saveStateToMemento(){
        return new Memento(this.state);
    }

    public void getStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
