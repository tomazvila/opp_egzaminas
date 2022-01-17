class Template {
    // Break down algorithm into series of steps and put them into single template method

    abstract class Shape {
        int S;
        int P;
        String color;

        abstract void calculatePerimeter();
        abstract void calculateArea();
        abstract Bool hookMethod();
        abstract void changeColor();
        final void draw() {
            calculatePerimeter();
            calculateArea();
            if (hookMethod()) {
                changeColor();
            }
        }
    }

    class Cube extends Shape {
        int a;
        public void calculateArea() {
            S = a*a; 
        }
        public void calculatePerimeter() {
            P = 4*a;
        }
        public Bool hookMethod() {
            return a > 5;
        }
        public void changeColor() {
            color = "Red";
        }
    }

    class Triangle extends Shape {
        ...
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}