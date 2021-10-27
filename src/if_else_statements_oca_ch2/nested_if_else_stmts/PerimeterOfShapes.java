package if_else_statements_oca_ch2.nested_if_else_stmts;

import java.util.Scanner;

public class PerimeterOfShapes {

    public static void main(String[] args) {

        /*
            1. input from the user for the "numberOfSides" of the shape [EX: triangle and quadrilateral shape]
            2. now ask user to input the length for the each of the sides of the shape[EX: a,b,c,d]
            3. according to the "numberOfSides" we need to identify the "typeOfShape"
            4. and print out the "nameOfTheShape" + "typeOfShape" and "perimeter" of the shape

            * perimeter of any shape is just adding all the sides;

            Expected output: Isosceles Triangle and it's perimeter is 24.3 inches;

            Limitations:
            3 types of each shape:
                - Triangle:
                    -> Equilateral [all sides equal]
                    -> Isosceles [2 sides equal]
                    -> Scalene [no equal sides]
                - Quadrilateral shape [shape that has 4 sides]
                    -> Square [all sides equal]
                    -> Rectangle [2 parallel sides equal]
                    -> Trapezoid [no equal sides or 2 sides can be equal]
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of sides for the shape?");
        // 1. input from the user for the "numberOfSides" of the shape [EX: triangle and quadrilateral shape]
        byte numberOfSides = scan.nextByte();

        double a = 0, b = 0, c = 0, d = 0;

        if (numberOfSides == 3 || numberOfSides == 4) {// 2. now ask user to input the length for the each of the sides of the shape[EX: a,b,c,d]
            System.out.println("Please enter the length for side 'a':");
            a = scan.nextDouble();
            System.out.println("Please enter the length for side 'b':");
            b = scan.nextDouble();
            System.out.println("Please enter the length for side 'c':");
            c = scan.nextDouble();
        } else {
            System.out.println("Please only enter 3 or 4 sides for the shape! Thanks for cooperation!");
        }

        // 3. according to the "numberOfSides" we need to identify the "typeOfShape"

        String typeOfShape = "";
        String nameOfTheShape = "";
        // perimeter of any shape is just adding all the sides;
        double perimeter = a + b + c;

        if (numberOfSides == 4) {
            typeOfShape = "Quadrilateral shape";

            System.out.println("Please enter the length for side 'd':");
            d = scan.nextDouble(); // now we just need to initialize it

            perimeter += d;
            /*
            - Quadrilateral shape [shape that has 4 sides]
                    -> Square [all sides equal]
                    -> Rectangle [2 parallel sides equal]
                    -> Trapezoid [no equal sides or 2 sides equal]
             */
            if (a == b && b == c && c == d) {
                // Expected output: Isosceles Triangle and it's perimeter is 24.3 inches;
                nameOfTheShape = "Square";
            } else if (a == b && c == d || b == c && a == d || b == d && c == a) {
                nameOfTheShape = "Rectangle";
            } else {
                nameOfTheShape = "Trapezoid";
            }
        } else {

            typeOfShape = "Triangle";
            /*
            - Triangle:
                    -> Equilateral [all sides equal]
                    -> Isosceles [2 sides equal]
                    -> Scalene [no equal sides]
             */
            if (a == b && b == c) {
                nameOfTheShape = "Equilateral";
            } else if (a == b || b == c || a == c) {
                nameOfTheShape = "Isosceles";
            } else {
                nameOfTheShape = "Scalene";
            }
        }

        // 4. and print out the "nameOfTheShape" + "typeOfShape" and "perimeter" of the shape
        if (numberOfSides == 3 || numberOfSides == 4) {
            System.out.println(nameOfTheShape + " " + typeOfShape + " and perimeter is: " + perimeter);
        }

    }
}
