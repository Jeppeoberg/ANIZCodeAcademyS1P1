package Lesson04.Costructor.Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.showInfo();
        double a1 = t1.getArea();

        System.out.println();

        Triangle t2 = new Triangle(7, 6, 6);
        t2.showInfo();
        double a2 = t2.getArea();

        System.out.println();

        Triangle t3 = new Triangle(15, 20, 12);
        t3.showInfo();
        double a3 = t3.getArea();

        System.out.println();

        if (a3 > a1 && a3 > a2) {
            System.out.println("Trekant A har det største areal. Arealet er " + a3);
        } else if (a2 > a1 && a2 > a3) {
            System.out.println("Trekant B har det største areal. Arealet er " + a2);
        } else if (a1 > a2 && a1 > a3) {
            System.out.println("Trekant C har det største areal. Arealet er " + a1);
        }


        ;




    }
}