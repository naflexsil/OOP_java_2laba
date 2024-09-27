package org.example;

import geometry2d.Circle;
import geometry2d.Figure;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import Exceptions.InvalidRadiusException;
import Exceptions.InvalidDimensionsException;

import java.util.Scanner;

class Geometry {

    public void execute(char subTask) {
        try {
            switch (subTask) {
                case 'a':
                    Circle circle = createCircle();
                    printCircleArea(circle);
                    break;
                case 'b':
                    Rectangle rectangle = createRectangle();
                    printRectangleArea(rectangle);
                    break;
                case 'c':
                    Figure base = createBase();
                    Cylinder cylinder = createCylinder(base);
                    printCylinderVolume(cylinder);
                    break;
                default:
                    System.out.println("invalid choice!!!!!!!");
            }
        } catch (InvalidRadiusException | InvalidDimensionsException e) {
            System.out.println(e.getMessage());
        }
    }

    private Circle createCircle() throws InvalidRadiusException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter radius for circle:");
        double radius = scanner.nextDouble();
        if (radius <= 0) {
            throw new InvalidRadiusException("radius must > 0!!!!!!!!!!");
        }
        return new Circle(radius);
    }

    private Rectangle createRectangle() throws InvalidDimensionsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width rectangle's:");
        double width = scanner.nextDouble();
        System.out.println("enter height rectangle's:");
        double height = scanner.nextDouble();
        if (width <= 0 || height <= 0) {
            throw new InvalidDimensionsException("width and height must > 0!!!!!!!");
        }
        return new Rectangle(width, height);
    }

    private Figure createBase() throws InvalidRadiusException, InvalidDimensionsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 'c' for circle base or 'r' for rectangle base:");
        char baseType = scanner.next().charAt(0);
        if (baseType == 'c') {
            return createCircle();
        } else if (baseType == 'r') {
            return createRectangle();
        } else {
            throw new InvalidDimensionsException("invalid base type!!!!!!!!");
        }
    }

    private Cylinder createCylinder(Figure base) throws InvalidDimensionsException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height for cylinder:");
        double height = scanner.nextDouble();
        if (height <= 0) {
            throw new InvalidDimensionsException("height must > 0!!!!!!");
        }
        return new Cylinder(base, height);
    }

    private void printCircleArea(Circle circle) {
        System.out.println("area of circle: " + circle.area());
    }

    private void printRectangleArea(Rectangle rectangle) {
        System.out.println("area of rectangle: " + rectangle.area());
    }

    private void printCylinderVolume(Cylinder cylinder) {
        System.out.println("volume of cylinder: " + cylinder.volume());
    }
}