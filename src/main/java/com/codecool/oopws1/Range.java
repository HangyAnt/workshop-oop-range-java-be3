package com.codecool.oopws1;

public class Range {

    private int start;

    private int end;

    Range() {
    }

    Range(int start, int end) {
        if (end > start) {
            this.start = start;
            this.end = end;
        } else {
            System.out.println("Invalid values.");
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
}
