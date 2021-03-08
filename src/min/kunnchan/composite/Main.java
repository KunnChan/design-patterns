package min.kunnchan.composite;
/*
 * Created by kunnchan on 08/03/2021
 * package :  min.kunnchan.composite
 */

// Composite is doing like a group into group, into group
public class Main {
    public static void main(String[] args) {

        Group group1 = new Group();
        group1.add(new Shape()); // Consider as a Square
        group1.add(new Shape()); // Consider as a Square

        // group1.render();

        Group group2 = new Group();
        group2.add(new Shape()); // Consider as a Circle
        group2.add(new Shape()); // Consider as a Circle

        // group2.render();

        Group group3 = new Group();
        group3.add(group1);
        group3.add(group2);

        group3.render();
    }
}
