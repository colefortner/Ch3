package ArrayListMethods;

import com.sun.jdi.ObjectCollectedException;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethodsEx {

    public static void main(String[] args) {

        ArrayList<String> planets = new ArrayList<>();

        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        System.out.println(planets.size());
        System.out.println(planets.contains("Earth"));
        System.out.println(planets.contains("Giuliani"));
        System.out.println(planets.indexOf("Jupiter"));
//        System.out.println(Collections.sort(planets));
        System.out.println(planets);
        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
        System.out.println(planetsArray);
    }


}
