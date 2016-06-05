package InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;

//insertion sort
public class InsertionSort{

    public InsertionSort(){}
	public ArrayList<Integer> insertionSort(ArrayList<Integer> list){
        int currentVacant = 0; //currentVacant index
        int currentValue = 0; // value at currentVacant index

        for (int i=1; i<list.size(); i++){

            currentVacant = i; //
            currentValue = list.get(currentVacant); // to be inserted

            //till the first element and the value before currentVacant is greater than currentValue
            //swap them
            while(currentVacant >0){
                if (list.get(currentVacant-1)<=currentValue)
                    break;
                list.set(currentVacant,list.get(currentVacant-1));
                currentVacant--;
            }
            list.set(currentVacant,currentValue);

        }
        return list;
	}

}
