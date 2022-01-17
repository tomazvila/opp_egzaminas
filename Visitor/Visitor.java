class Visitor {
    // Separate objects from algorithms
    // Vaikšioja po visur ir daro dalykus
    // Objektų struktūra
    // Kalėdų senelis neša dovanas
    // Berniukam duoda mašinas
    // Mergaitėm duoda leles
    // Kalėdų senelis yra ConcreteVisitor??
    // dovana yra
    // Berniukas yra ElementA
    // Mergaitė yra  ElementB
    // Pardavimų agentas eina palei skirtingų tipų namus

    interface Visitor {
        visit(ElementA a);
        visit(ElementB b);
    }

    interface Element {
        accept(Visitor v) {
            v.visit(this);
        }
    }

    class ConcreteVisitor {
        // different algorithms 
    }

    class ElementA {
        featureA();
        accept(Visitor v);
    }

    class ElementB {
        featureB();
        accept(Visitor v);
    }


    public static void main(String[] args) {
        ConcreteVisitor kaleduSenelis = new ConcreteVisitor();
        for (element in berniukaiIrMergaites) {
            element.accept(kaleduSenelis);
        } 
        System.out.println("Hello, World!"); 
    }
}