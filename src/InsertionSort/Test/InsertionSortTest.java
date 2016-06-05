package InsertionSort.Test;

import InsertionSort.InsertionSort;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by abelo on 6/4/2016.
 */
public class InsertionSortTest {
    @org.junit.Test
    public void insertionSort() throws Exception {

        InsertionSort sort = new InsertionSort();

        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(Arrays.asList(0))); //[0]
        input.add(new ArrayList<>(Arrays.asList(0))); //[0]
        input.add(new ArrayList<>(Arrays.asList(0,0,0))); //[0,0,0]
        input.add(new ArrayList<>(Arrays.asList(0,0,0))); //[0,0,0]
        input.add(new ArrayList<>(Arrays.asList(1,0))); //[1,0]
        input.add(new ArrayList<>(Arrays.asList(0,1))); //[0,1]
        input.add(new ArrayList<>(Arrays.asList(0,2,1))); //[0,2,1]
        input.add(new ArrayList<>(Arrays.asList(0,1,2))); //[0,1,2]
        input.add(new ArrayList<>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)));
        input.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        input.add(new ArrayList<>(Arrays.asList(-11, -3, 9, 17, 42, 54, 54, 602, 999)));
        input.add(new ArrayList<>(Arrays.asList(42, 9, 17, 54, 602, -3, 54, 999, -11)));

       for (int i=1; i<input.size(); i++){
            Assert.assertEquals(input.get(i),sort.insertionSort(input.get(i-1)));
       }
    }

}