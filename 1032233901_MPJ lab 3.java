//Method Overloading

class Shape {

    void area(int a) {
        System.out.println("Square = " + (a * a));
    }

    void area(int a, int b) {
        System.out.println("Rectangle = " + (a * b));
    }

    void area(double r) {
        System.out.println("Circle = " + (3.14 * r * r));
    }
}

class Test1 {
    public static void main(String[] args) {
        Shape s = new Shape();

        s.area(4);
        s.area(4, 5);
        s.area(2.5);
    }
}

//Method Overriding

class Hill {
    void place() {
        System.out.println("Hill station");
    }

    void food() {
        System.out.println("Food");
    }
}

class Mahabaleshwar extends Hill {
    void place() {
        System.out.println("Mahabaleshwar");
    }

    void food() {
        System.out.println("Strawberries");
    }
}

class Lonavala extends Hill {
    void place() {
        System.out.println("Lonavala");
    }

    void food() {
        System.out.println("Chikki");
    }
}

class Matheran extends Hill {
    void place() {
        System.out.println("Matheran");
    }

    void food() {
        System.out.println("Fudge");
    }
}

class Test2 {
    public static void main(String[] args) {
        Hill h;

        h = new Mahabaleshwar();
        h.place();
        h.food();

        h = new Lonavala();
        h.place();
        h.food();

        h = new Matheran();
        h.place();
        h.food();
    }
}