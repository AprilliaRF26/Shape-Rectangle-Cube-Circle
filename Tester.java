package ShapeCircleRectangleCube;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Pilih salah satu\n 1. Rectangle\n 2. Circle\n 3. Cube");
        String pilihan = s.nextLine();

        if (pilihan.equalsIgnoreCase("1")) {
            System.out.println("===RECTANGLE===");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Length: ");
            int length = s.nextInt();
            System.out.println("Width: ");
            int width = s.nextInt();
            Rectangle a = new Rectangle(name, color, length, width);
            a.print();
        }else if (pilihan.equalsIgnoreCase("2")) {
            System.out.println("===CIRCLE===");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Color: ");
            String color = s.nextLine();
            System.out.println("Radius: ");
            int radius = s.nextInt();
            Circle b = new Circle(name, color, radius);
            b.print();
        }else if (pilihan.equalsIgnoreCase("3")) {
            System.out.println("===CUBE===");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Length: ");
            int length = s.nextInt();
            System.out.println("Width: ");
            int width = s.nextInt();
            System.out.println("height: ");
            int height = s.nextInt();
            Cube c = new Cube(name, color, length, width, height);
            c.print();
        }
    }
    
}
