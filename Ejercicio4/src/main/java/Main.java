import items.ArrayResolver;

/**
 * Created by Simon.Gomez on 5/9/2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayResolver arrayResolver = new ArrayResolver();

        int[] array = new int[10];

        array[0] = 8;
        array[1] = 2;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 1;
        array[9] = 1;

        System.out.println("POSICION PIVOT: " + arrayResolver.getPositionEqualSideValues(array));

        array[0] = 6;
        array[1] = 1;
        array[2] = 3;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 1;
        array[9] = 1;

        System.out.println("POSICION PIVOT: " + arrayResolver.getPositionEqualSideValues(array));

        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        array[7] = 1;
        array[8] = 2;
        array[9] = 8;

        System.out.println("POSICION PIVOT: " + arrayResolver.getPositionEqualSideValues(array));
    }

}
