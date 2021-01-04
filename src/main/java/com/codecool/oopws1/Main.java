package com.codecool.oopws1;

public class Main {

    public static void main(String[] args) {
        Range range1 = new Range(5, 10);
        range1.setStart(15);
        range1.setEnd(1);
        System.out.println("range1 start: " + range1.getStart());
        System.out.println("range1 end: " + range1.getEnd());
        Range range2 = new Range();
        range2.setEnd(90);
        range2.setStart(10);
        System.out.println("range2 start: " + range2.getStart());
        System.out.println("range2 end: " + range2.getEnd());
    }

}
