class State {
    // Alter objects behaviour when internal state changes
    // State machines
    // A finite number of states
    // With unique state program behaves differently
    // Client works with states!!!

    interface State() {
        doThis();
        doThat();
    }

    class Context() {
        // Store reference to one of the concrete state objects
        // Context communicates with state object
        State state;
        Context(State s) {
            state = s;
        }
        void setState(State s) { //state goes from one state to other state
            state = s;
        }
        void doThis();
        void doThat();
    }

    class concreteState() extends State() {
        Context context;
        void setContext(Context s);
    }

    //------------------------------
    class Arbatinukas {

    }

    interface šviesti ir t.t. 

    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}