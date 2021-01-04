package com.codecool.oopws1;

public class Range {

    private int start;

    private int end;

    Range() {
    }

    Range(int range) {
        if (range > 0) {
            this.start = 0;
            this.end = range;
        } else {
            System.out.println("Invalid value. Range must be bigger than 0");
        }
    }

    Range(int start, int end) {
        if (end > start) {
            this.start = start;
            this.end = end;
        } else {
            System.out.println("Invalid values. Object created with default values (0, 0)");
        }
    }

    void setStart(int start) {
        if (this.end > start) {
            this.start = start;
        } else {
            System.out.println("\"Start\" must be smaller than \"end\". Try to set \"end\" first.");
        }
    }

    void setEnd(int end) {
        if (end > this.start) {
            this.end = end;
        } else {
            System.out.println("\"End\" must be bigger than \"start\".");
        }
    }

    int getStart() {
        return this.start;
    }

    int getEnd() {
        return this.end;
    }

    int getLength() {
        return this.end - this.start;
    }

}
