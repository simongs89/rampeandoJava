import items.ArrayResolver;

/**
 * Created by Simon.Gomez on 5/9/2016.
 */
public class Main {

    public static void main(String[] args) {

        ArrayResolver arrayResolver = new ArrayResolver();
        int arraySize = 100000000;

        int[] array1 = new int[arraySize];
        array1[0] = arraySize - 2;
        array1[1] = 2;
        for (int i = 2; i<arraySize; i++){
            array1[i] = 1;
        }

        int[] array2 = new int[arraySize];
        array2[arraySize-1] = arraySize - 2;
        array2[arraySize-2] = 2;
        for (int i = 0; i<arraySize-2; i++){
            array2[i] = 1;
        }

        System.out.println("POSICION PIVOT 1: " + arrayResolver.getPositionEqualSideValuesBySume(array1));
        System.out.println("POSICION PIVOT 2: " + arrayResolver.getPositionEqualSideValuesBySume(array2));
    }

}
