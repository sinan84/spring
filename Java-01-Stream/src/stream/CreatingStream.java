package stream;

import util.ArrayList;
import util.Role;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //Creating stream from an Array
        String[] courses = {"Java","JS","TS","API","SELENIUM"};
        Stream<String> courseStream = Arrays.stream(courses);

        //Creating a Stream from a Collection
        Stream<Role> roleStream = ArrayList.createRoleList().stream();

        //Creating a Stream from Specified Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);



    }
}
