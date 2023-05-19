package FewBasicPractice;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list=list();
        System.out.println(list);

    }
    public static ArrayList list(){
        ArrayList list=new ArrayList(10);
        list.add(12);
        list.add(13);
        return list;
    }
}
