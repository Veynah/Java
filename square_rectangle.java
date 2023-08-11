class Main {
    public static void main(String[] args){
        double squareL, squareArea, squarePerim, rectangleL, rectangleW, rectangleArea, rectanglePerim;
        System.out.println("Enter the length of the square:");
        String squareLString = System.console().readLine();
        squareL = Math.abs(Double.parseDouble(squareLString));
        squareArea = squareL * squareL;
        squarePerim = squareL * 4;

        // System.out.println("Enter the length and width of the rectangle:");
        // Voici ma ligne initiale mais je ne sais pas comment séparer
        // les deux inputs sachant qu'ils sont lu comme des string
        System.out.println("Enter the length of the rectangle:");
        String rectangleLString = System.console().readLine();
        rectangleL = Math.abs(Double.parseDouble(rectangleLString));
        
        System.out.println("Enter the width of the rectangle:");
        String rectangleWString = System.console().readLine();
        rectangleW = Math.abs(Double.parseDouble(rectangleWString));
        rectangleArea = rectangleL * rectangleW;
        rectanglePerim = rectangleL * 2 + rectangleW * 2;

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerim);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerim);
    }
}