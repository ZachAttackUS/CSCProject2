import java.util.ArrayList;

public class Operations {



    public int add_Operation(String value1, String value2){

        LinkedList Value1LL = new LinkedList();
        LinkedList Value2LL = new LinkedList();
        String[] splitv1 = value1.split("");
        String[] splitv2 = value2.split("");

        for (int i = splitv1.length - 1; i >= 0; i--){
            Value1LL.add(Integer.parseInt(splitv1[i]));
        }
        for (int i = splitv2.length - 1; i >= 0; i--){
            Value1LL.add(Integer.parseInt(splitv2[i]));
        }

        int length_of_number_V1 = Value1LL.size();
        int length_of_number_V2 = Value2LL.size();
        int addvalue = 0;
        if (length_of_number_V1 == length_of_number_V2){
            for (int i = 0; i <= length_of_number_V1; i++){
                addvalue = addvalue + Value1LL.getHead().getKey() + Value2LL.getHead().getKey();
                Value1LL = Value1LL.getHead().setNext();

            }


        }



    }
}
