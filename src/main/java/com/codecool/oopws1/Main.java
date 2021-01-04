package com.codecool.oopws1;

public class Main {

    public static void main(String[] args) {
        Range range1 = new Range(5, 10);
        System.out.println("Range1 \"start\": " + range1.getStart());
        System.out.println("Range1 \"end\": " + range1.getEnd());
        range1.setStart(15); // Invalid value.
        range1.setEnd(1); // Invalid value.
        System.out.println("Range1 \"start\" after invalid modification: " + range1.getStart());
        System.out.println("Range1 \"end\" after invalid modification: " + range1.getEnd() + "\n");
        Range range2 = new Range();
        System.out.println("Range2 \"start\": " + range2.getStart());
        System.out.println("Range2 \"end\": " + range2.getEnd());
        range2.setEnd(90);
        range2.setStart(10);
        System.out.println("Range2 \"start\" after valid modification: " + range2.getStart());
        System.out.println("Range2 \"end\" after valid modification: " + range2.getEnd() + "\n");
        System.out.println("Range1 \"length\": " + range1.getLength());
        System.out.println("Range2 \"length\": " + range2.getLength() + "\n");
        Range range3 = new Range(-105);
        System.out.println("Range3 \"start\": " + range3.getStart());
        System.out.println("Range3 \"end\": " + range3.getEnd());
    }

}
