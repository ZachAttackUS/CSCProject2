import java.util.ArrayList;
import java.lang.Math;

import static java.lang.Math.abs;

public class Operations {


    //takes in two strings which are representative of numbers
    public static int add_Operation(String value1, String value2){
        int lenDiff = value1.length() - value2.length();
        lenDiff = abs(lenDiff); //used for adding leading zeros in lists


        LinkedList addList1 = new LinkedList(); //first value inputted. list form
        LinkedList addList2= new LinkedList(); //second value inputted, list form

        //adds leading 0s to front of value1 if shorter
        if (value1.length() > value2.length()){
            StringBuilder value2Builder = new StringBuilder(value2);
            for (int i = lenDiff; i > 0; i--){
                value2Builder.insert(0, "0");
            }
            value2 = value2Builder.toString();
        }
        //adds leading 0s to front of value2 if shorter
        else {
            StringBuilder value1Builder = new StringBuilder(value1);
            for (int i = lenDiff; i > 0; i--){
                value1Builder.insert(0, "0");
            }
            value2 = value1Builder.toString();
        }

        //adds nodes for each digit in values from right to left
        for (int i = value1.length()-1; i >= 0; i--){
            addList1.add(Character.getNumericValue(value1.charAt(i)));
            addList2.add(Character.getNumericValue(value2.charAt(i)));
        }

        Node current1 = addList1.getHead().getNext(); //node for traversing through first list
        Node current2 = addList2.getHead().getNext(); //node for traversing through second list
        LinkedList finalList = new LinkedList(); //list for computed value

        int hold = 0;
        while (current1 != null && current2 != null){

            int added = current1.getKey() + current2.getKey();
            if (added > 9){
                hold = 1;
                added = added - 10;
            }

            if (hold > 0){
                finalList.add(added + 1);
                hold = 0;
            } else {
                finalList.add(added);
            }

            current1 = current1.getNext();
            current2 = current2.getNext();
        }







        }



    }


















    /*
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
     */
