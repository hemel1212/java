package Exam;
import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> xyz = new ArrayList<>();
        xyz.add(10);
        xyz.add(20);
        xyz.add(30);
        xyz.add(1, 15);
        System.out.println("Array list is "+ xyz);
//
//        for(int n : xyz){
//            System.out.println("Array list is "+ n);
//        }
//
//        Iterator<Integer> kk = xyz.iterator();
//        while (kk.hasNext()){
//            System.out.println("array list is "+ kk.next());   }

        int x = xyz.size();
        System.out.println("array list size is " + x);


        xyz.remove(1);
        System.out.println("after remove " + xyz);

//        xyz.clear();
//        System.out.println("after clear " + xyz);
//
//
//        boolean a = xyz.isEmpty();
//        System.out.println("after clear it now empty " + a);

        boolean v= xyz.contains(20);
        System.out.println(v );

        int in = xyz.indexOf(20);
        System.out.println(in);

    }
}