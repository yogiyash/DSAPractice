package concepts.oops;

/**
 * The parent typed should be substituable with derived type completely without effecting the code
 * The code should work for subtypes wihtout knowing it
 * this means that new subtypes can be made freely and code will still work for new subtypes without knowing the new functionality that they might have
 * <p>
 * when the creation of derived class causes us to change the base class the design is faulty as it violates the open close principle
 */


public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Rectangle rect = new Square();
        int width = 3;
        int height = 2;
        rect.setWidth(width);
        rect.setHeight(height);
        verifyArea(rect, height, width);
    }

    static void verifyArea(Rectangle rect, int height, int width) {

        int area = height * width;
        if (area != rect.area())
            System.out.println("LSP Failed!");
        else {
            System.out.println("All Good!");
        }


    }


}

class Rectangle {
    private int width;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return height + width;
    }

}

class Square extends Rectangle {
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        this.setHeight(width);
    }

    @Override
    public int area() {
        return getHeight() * getHeight();
    }
}

