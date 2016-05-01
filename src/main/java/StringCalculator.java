import org.omg.CORBA.SystemException;

import java.util.ArrayList;

public class StringCalculator {
    public int add(String values) throws Exception { //"1,1"
        if(values.length() > 0) {
            int temp;
            String delimiter = null;
            try {
                temp = Integer.parseInt("" + values.charAt(0));
            } catch(Exception e) {
                if(("" + values.charAt(0)) == "-") {
                    delimiter = null;
                } else {
                    delimiter = "" + values.charAt(0);
                }
            }

            String[] splittedList = null;
            if(delimiter != null) {
                splittedList = values.substring(1, values.length()).split(delimiter);
            } else {
                splittedList = values.split("[,|\n]");
            }

            ArrayList<Integer> numberList = new ArrayList<Integer>();
            int accumulator = 0;
            for(String element: splittedList) {
                int tempValue = Integer.parseInt(element);
                if(tempValue < 0) {
                    throw new Exception("NegativeNumberException");
                }
                if(tempValue > 1000) {
                    continue;
                }
                numberList.add(tempValue);
            }
            for(Integer number: numberList) {
                accumulator += number;
            }
            return accumulator;
        }
        return 0;
    }
}