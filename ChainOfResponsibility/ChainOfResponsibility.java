class ChainOfResponsibility {
    // Process different kind of requests in different ways
    // exact types of requests and their sequence are unknown before hand
    // Chain 
    // Reorder handlers???

    interface Handler {
        setNext(Handler h);
        handle(request);
    }
    class BaseHandler implements Handler {
        Handler next;
        setNext(Handler h);
        handle(request);
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}