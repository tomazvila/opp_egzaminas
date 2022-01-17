class Mediator {
    // Fix dependencies
    // Communication only trough mediator
    // Mediator redirects calls to appropriate objects
    // Oro uostas, lėktuvai nebendrauja tarpusavyje
    // Tightly coupled classes
    // Switch case ???

    interface Mediator {
        notify(Component sender, String event);
    }

    class ConcreteMediator implements Mediator {
        componentA a;
        componentB b;
        notify(Component sender, String event) {
            if sender is this do this
            if event is this do that
        }
        reactOnA();
        reactOnB();
    }

    class componentA {
        Mediator m;
    }

    class componentB {
        Mediator m;
    }

    public static void main(String[] args) {

        System.out.println("Hello, World!"); 
    }
}