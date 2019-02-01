import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesProblem {

    public static Set<Integer> convertToSet(int duplicateArray[]){

        Set<Integer> withoutDuplicates = new HashSet<Integer>();

        for (int i : duplicateArray){
            withoutDuplicates.add(i);
        }

        return withoutDuplicates;

    }

    public static List<Integer> printList(int duplicateArray[]){
        //remove duplicates from array by converting array to Set
        //transform Set to List
        //print List

        Set<Integer> withoutDuplicates = convertToSet(duplicateArray);

        List<Integer> resultList = new ArrayList<Integer>();
        resultList.addAll(withoutDuplicates);


        System.out.println(resultList);

        return resultList;
    }
}
