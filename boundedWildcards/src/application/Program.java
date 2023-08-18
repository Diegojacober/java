package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

    public static void main(String[] args) {

//        List<Shape> myShapes = new ArrayList<>();
//        myShapes.add(new Rectangle(3.0, 2.0));
//        myShapes.add(new Circle(2.0));
//
//        List<Circle> myCircles = new ArrayList<>();
//        myCircles.add(new Circle(2.0));
//        myCircles.add(new Circle(3.0));
//
//        System.out.println("Total area: " + totalArea(myCircles));

        //Covariança -> o get é permitido e o put não;
        /*List<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(8);

        List <? extends Number> list = intList;

        Number x = list.get(0);

        list.add(20); // covarianca
         */

        //Contravarianca -> o put é permitido e o get não;
        /*List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Diego");
        myObjs.add("Angelo");

        List<? super Number> myNums = myObjs;
        myNums.add(45);
        myNums.add(3.56);

        Number x = myNums.get(0); //Contravariança
         */

        // Copiar de uma lista genérica para uma lista mais genérica ainda
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();
        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}