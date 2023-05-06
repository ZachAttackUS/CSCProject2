import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

    public class FileProcessor {

        /**
         * Processes arithmetic expressions line-by-line in the given file.
         *
         * @param filePath Path to a file containing arithmetic expressions.
         */
        public static void processFile(String filePath) {
            ArrayList<String> operationsLines = new ArrayList<>();
            File infile = new File(filePath);
            try (Scanner scan = new Scanner(infile)) {
                while (scan.hasNext()) {
                    // TODO: Process each line of the input file here.
                    String line = scan.nextLine();
                    operationsLines.add(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + infile.getPath());
            }

            ArrayList<String> operationsLinesRefined = new ArrayList<>();


            //remove extra space from the line
            for (String line : operationsLines) {
                StringBuilder tempString = new StringBuilder("");
                for (int i = 0; i < line.length(); i++) {
                    char tempChar = line.charAt(i);
                    if (tempChar != ' ') {
                        tempString.append(tempChar);
                    }
                }

                operationsLinesRefined.add(tempString.toString());
                for (int i = 0; i < operationsLinesRefined.size(); i++){
                    if (operationsLinesRefined.get(i).length() == 0){
                        operationsLinesRefined.remove(i);
                    }
                }

            }


            for (String line2 : operationsLinesRefined) {
                StringBuilder num1 = new StringBuilder();
                StringBuilder num2 = new StringBuilder();
                int opLocation;
                char operation;
                //finds location in string of operation and operation char
                for (int i = 0; i < line2.length(); i++){
                    if(line2.charAt(i) == '+'| line2.charAt(i) == '*' | line2.charAt(i) == '^'){
                        opLocation = i;
                        operation = line2.charAt(i);
                    }

                }
                //creates first num string
                for(int i = 0; i < opLocation; i++){
                    num1.append(line2.charAt(i));
                }

                //creates second num string
                for(int i = opLocation + 1; i < line2.length(); i++){
                    num2.append(line2.charAt(i));
                }
                String num1String;
                String num2String;

                num1String = num1.toString();
                num2String = num2.toString();

                String result;
                int temp;
                if (operation == '+'){
                    result = Operations.add_Operation(num1String, num2String);
                    System.out.println(num1String + operation + num2String + '=' + result);
                } else if (operation == '*') {
                    result = Operations.multi(num1String, num2String);
                    System.out.println(num1String + operation + num2String + '=' + result);
                } else if (operation == '^') {
                    result = Operations.exponent_operation(num1String, num2String);
                    System.out.println(num1String + operation + num2String + '=' + result);
                }


            }




        }




    }
