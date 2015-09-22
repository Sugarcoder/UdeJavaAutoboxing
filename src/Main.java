import java.util.ArrayList;

/**
 * Created by Sugarcoder on 9/21/2015.
 */


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



public class Main {

    public static void main(String[] args) {
        // recap of arrays & arraylists
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");


        // Can't do this:
        // ArrayList<int> intArrayList = new ArrayList<>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);  // Integer is a class, versus int

        Double doubleValue = new Double(12.25);  // Double is a class

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i=0; i<=10;i++) {
            intArrayList.add(Integer.valueOf(i));    // Converting int to Integer = autoboxing
        }


        for(int i=0; i<=10;i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());     // Converting Integer to int = unboxing
        }



        Integer myIntValue = 56;    // Java converts to Integer.valueOf(56); at Runtime

        int myInt = myIntValue;    // Java converts to myInt.intValue();


        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl <=10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));   // shortcut is (dbl)
        }


        for(int i=0; i<myDoubleValues.size();i++) {
            double value = myDoubleValues.get(i).doubleValue();    // shortcut is myDoubleValues.get(i)
            System.out.println(i + " --> " + value);
        }

    }


}
