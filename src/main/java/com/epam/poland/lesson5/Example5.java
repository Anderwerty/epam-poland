package com.epam.poland.lesson5;

public class Example5 {
    public static void main(String[] args) {

    }
}

class Square {
    private int side;

    public Square(int side) {
        validateSide(side);
        this.side = side;
    }

    private int getSide() {
        return side;
    }

    public void setSide(int value) {
        validateSide(side);
        this.side = side;
    }

    public int calculateArea() {
        return getSide() * getSide();
    }

    public int calculatePerimeter( ) {
        return 4 * getSide();
    }

    private void validateSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("");
        }
    }
}

// rich domain model vs anemic domain model

//class SquareUtility {
//    public int calculateArea(Square square) {
//        validateSquareOnNull(square);
//        return square.getSide() * square.getSide();
//    }
//
//    public int calculatePerimeter(Square square) {
//        validateSquareOnNull(square);
//        return 4 * square.getSide();
//    }
//
//    private void validateSquareOnNull(Square square) {
//        if (square == null) {
//            throw new IllegalArgumentException("square is null");
//        }
//    }
//
//}
