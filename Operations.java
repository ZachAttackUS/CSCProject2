import static java.lang.Math.abs;
import java.util.logging.*;
public class Operations {


    //takes in two strings which are representative of numbers
    public static String add_Operation(String value1, String value2){

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
        else if (value2.length() > value1.length()) {
            StringBuilder value1Builder = new StringBuilder(value1);
            for (int i = lenDiff; i > 0; i--){
                value1Builder.insert(0, "0");
            }
            value1 = value1Builder.toString();
        }

        //adds nodes for each digit in values from right to left
        for (int i = value1.length()-1; i >= 0; i--){
            addList1.add(Character.getNumericValue(value1.charAt(i)));
            addList2.add(Character.getNumericValue(value2.charAt(i)));
        }

        Node current1 = addList1.getHead().getNext(); //node for traversing through first list
        Node current2 = addList2.getHead().getNext(); //node for traversing through second list
        LinkedList finalList = new LinkedList(); //list for computed value

        int carry = 0;
        while (current1 != null && current2 != null){

            int added = current1.getKey() + current2.getKey();

            if (carry > 0){
                added += 1;
                carry = 0;
            }
            if (added > 9){
                carry = 1;
                added = added - 10;
            }

            finalList.add(added);


            current1 = current1.getNext();
            current2 = current2.getNext();
        }

        if (carry > 0){
            finalList.add(1);
        }
        //turns linkedlist into string
        String final_string = finalList.turn_into_string();
        return final_string;
        }


    public static int exponent_operation(String value, String power){

        String multipliedvalue = multi(value, value);
        int int_value = Integer.parseInt(value);
        int int_power = Integer.parseInt(power);
        String less_than_zero_value = Integer.toString(1/int_value);
        String neg_power = Integer.toString(-1*int_power);
        String power_div_two = Integer.toString(int_power / 2);
        String power_minus_one_div_two = Integer.toString((int_power - 1)/ 2);
        if (int_power < 0){
            return exponent_operation(less_than_zero_value, neg_power);
        } else if (int_power == 0){
            return 1;
        } else if (int_power % 2 == 0){
            return exponent_operation(multipliedvalue, power_div_two);
        } else {
            return int_value * exponent_operation(multipliedvalue, power_minus_one_div_two);
        }


    }


    public static String multi(String value1, String value2){
        System.out.println("test");

        LinkedList addList1 = new LinkedList(); //first value inputted. list form
        LinkedList addList2= new LinkedList(); //second value inputted, list form


        //adds nodes for each digit in values from right to left
        for (int i = value1.length()-1; i >= 0; i--){
            addList1.add(Character.getNumericValue(value1.charAt(i)));
        }
        for (int i = value2.length()-1; i >= 0; i--){
            addList2.add(Character.getNumericValue(value2.charAt(i)));
        }


        Node current1 = addList1.getHead().getNext(); //node for traversing through first list
        Node current2 = addList2.getHead().getNext(); //node for traversing through second list
        LinkedList multipleList = new LinkedList(); //list for computed value


        //does the multiplication
        int iterations = 0;
        int carry = 0;
        String add_value1 = "";
        String add_value2;
        while (current1 != null){

            while (current2 != null){
                int multi_value = current1.getKey() * current2.getKey();
                if (carry > 0){
                    multi_value += carry;
                    carry = 0;
                }
                if (multi_value > 9){
                    carry = ((multi_value/10)%10);
                    multi_value = multi_value%10;

                }


                multipleList.add(multi_value);
                current2 = current2.getNext();
            }
            if (carry > 0){
                multipleList.add(carry);
                carry = 0;
            }

            iterations++;
            //Stores firstnum (Only once)
            if (iterations == 1) {
                add_value1 = multipleList.turn_into_string();

            //Stores second num
            }  else if (iterations >= 2) {
                add_value2 = multipleList.turn_into_string();
                add_value1 = add_Operation(add_value1, add_value2);
            }
            multipleList.make_Empty();

            for (int i = 0; i < iterations; i++){
                multipleList.add(0);
            }


            current2 = addList2.getHead().getNext();
            current1 = current1.getNext();

        }
    return add_value1;
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
