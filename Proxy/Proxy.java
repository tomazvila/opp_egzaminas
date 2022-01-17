class Proxy {
    // RIBOTI RESURSAI
    // LOGINIMAS
    // Lazy init delay the object’s initialization to a time when it’s really needed.
    // Caching
    // Remote proxy handling all of the nasty details of working with the network.
    // / Smart reference. This is when you need to be able to dismiss a heavyweight object once there are no clients that use it.
    // After this pass request to Service
    // Proxies manage full lifetime of Services


    interface ServiceInterface {
        void operation();
    }

    class Service extends ServiceInterface {

    }

    class Proxy extends ServiceInterface {
        Service realService
        Proxy(Service s);
        operation();
        checkAccess();
        log();
        if (checkAccess()) {
            realService.operation();
        }
    }

    public static void main(String[] args) {
        Service service;
        service.operation();
        System.out.println("Hello, World!"); 
    }
}