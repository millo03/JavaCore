package LyThuyet;

import java.util.ArrayList;

public class List_ArrayList_In_JavaOOP {
    /*JAVA COLLECTION FRAMEWORK

            Collectyion               Map           Iterator
        /       |       \              |               |
     List      Set     Queue        SortedMap    ListIterator
                |          |
          SortedSet     Deque
    *
    *=========LIST===============
    - là 1 interface thuộc java Collection
    - thao tác vs 1 mang
    *============ARRAYLIST==========
    - được triển khai từ interface của List
    - 1 mảng động
    */

    public static void main(String[] args) {
        // khai bảo
        ArrayList<Integer> list = new ArrayList<>();
        // thêm thành phần
        list.add(10);
        list.add(13);
        list.add(12);
        list.add(14);
        // thêm theo chỉ số
        list.add(4,100);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(15);
        list1.add(3);
        list1.add(6);
        list1.add(9);
        // thêm cả list1 vào list
        list.addAll(list1);
        // kiểm tra phần tử có gtr = 5 có trong mang hay ko
        System.out.println(list.contains(3));
        // xóa phần thử ko thuộc Array list1 ra khỏi list
        //list.retainAll(list1);
         list.removeAll(list1) ;//ngược lại

        // lấy ra vị trí
        System.out.println(list.indexOf(10));

        // hiển thị
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"  ");
        }

    }
}
