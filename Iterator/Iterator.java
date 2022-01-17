class Iterator {
    // Use this for traversing different data structures
    // Must have Aggregate - iterrable collection
    // ConcreteAggregate   - concrete iterrable collection
    // Iterator            - 
    // Concrete Iterator
    // Maybe together with Factory
    // Maybe together with Memento
    // Maybe together with Visitor
    // Skirtingas vaikščiojimas po miestą skirtingom transporto priemonėm?
    // Keliavimas po pasaulį?


    class AbstractIterator {
        AbstractCollectionItem first();
        AbstractCollectionItem next();
        Bool isDone();
        AbstractCollectionItem currentItem();
    }

    abstract class AbstractAggregate { // abstract collection
        AbstractIterator createIterator();
    }

    class IteratorA() extends AbstractIterator {
        ConcreteItem first();
        ConcreteItem next();
        Bool isDone();
        ConcreteItem currentItem();
    }
    
    class ConcreteAggregate extends AbstractAggregate { // ConcreteCollection
        ConcreteCollection collection;
        IteratorA createIterator();
    }


    public static void main(String[] args) {
        ConcreteAggregate aa = new AbstractAggregate();
        for (AbstractIterator i = aa.createIterator(); !i.isDone(); i.next()) {
            i.currentItem();
        }
        System.out.println("Hello, World!"); 
    }
}