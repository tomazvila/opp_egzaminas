class Composite {
    // Component
    // Leaf
    // Composite
    // Compose objects into tree structures. Why???
    // Something can contain something
    // Calculate price
    // if Leaf return price
    // if not Leaf Let Composite do something
    // pass request down the tree
    // Both Leaf and composite need to have something both can do
    // Leaf do most of the work
    // SIMPLE LEAVES complex CONTAINERS

    interface Component {
        execute();
    }

    class Leaf implements Component {

    }

    class Composite implements Component {
        Component[] children;
        void add (Component c);
        void remove (Component c);
        Component[] getChildren(Component c);
        execute();
    }

    // DRAWING on the screen
    interface Graphic {
        void move(int x, int y);
        void draw();
    }

    class Dot extends Graphic {
        int x, int y;
        Dot(int x, int y);
        void move(int x, int y);
        void draw();
    }

    class Circle extends Dot {
        int radius;
        Circle(int radius);
        draw();
    }

    class CompoundGraphic extends Graphic {
        CompoundGraphic[] children;
        void add(Graphic child);
        void remove(Graphic child);
        void move(int x, int y) {
            for (Graphic child : children) {
                child.move(x, y);
            }
        }
        void draw();
    }

    public static void main(String[] args) {
        all = new CompoundGraphic()
        all.add(new Dot(1, 2))
        all.add(new Circle(5, 3, 10))
        all.move(5, 4);
        System.out.println("Hello, World!"); 
    }
}