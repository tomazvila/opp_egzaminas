class Memento {
    // SAVE AND RESTORE PREVIOUS STATE

    class Originator {
        State state;
        Memento save();
        restore(Memento m);
    }

    class Memento {
        // Keep originator state
        // Memento should be immutable
        //
        State state;
        Memento(State s);
        State getState();
    }

    class CareTaker {
        Originator originator;
        Memento[] history;
        void doSomething();
        void undo();
    }

    public static void main(String[] args) {
        CareTaker ct;
        ct.doSomething(); // might do stuff bellow
        // Originator o;
        // Memento snapshot1 = o.save();

        System.out.println("Hello, World!"); 
    }
}