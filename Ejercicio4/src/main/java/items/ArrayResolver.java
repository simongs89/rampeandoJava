package items;

import java.util.HashMap;

/**
 * Created by Simon.Gomez on 5/9/2016.
 */
public class ArrayResolver {

    private HashMap<String, Integer> cache = null;

    public int getPositionEqualSideValues(final int[] array) {
        cache = new HashMap<String, Integer>();
        int midPosition = array.length / 2;
        int leftValue = 0, rightValue = 0;
        do {
            if (leftValue > rightValue) {
                midPosition /= 2;
            } else if (leftValue < rightValue) {
                midPosition /= 0.75;
            }
            leftValue = getLeftValue(array, midPosition);
            rightValue = getRightValue(array, midPosition);
        } while (leftValue != rightValue);

        return ++midPosition;
    }

    public int getLeftValue(final int[] array, final int position) {
        Integer cacheValue = cache.get(position + "L");
        if (cacheValue != null) {
            return cacheValue;
        }
        if (position < 0 || position >= array.length) {
            return 0;
        }
        if (position == 0) {
            return array[position];
        } else {
            cacheValue = array[position] + getLeftValue(array, position - 1);
            cache.put(position + "L", cacheValue);
            return cacheValue;
        }
    }

    public int getRightValue(final int[] array, final int position) {
        Integer cacheValue = cache.get(position + "R");
        if (cacheValue != null) {
            return cacheValue;
        }

        if (position < 0 || position >= array.length) {
            return 0;
        }
        if (position == array.length - 1) {
            return array[position];
        } else {
            cacheValue = array[position] + getRightValue(array, position + 1);
            cache.put(position + "R", cacheValue);
            return cacheValue;
        }
    }

}
