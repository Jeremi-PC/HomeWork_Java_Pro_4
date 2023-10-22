package org.example.group;

import java.util.ArrayList;

public class Group {

    ArrayList<String> studentlist = new ArrayList<>();
    ArrayList<String> foundList = new ArrayList<>();
    public ArrayList<String> createStudents() {

        studentlist.add("Ivanov");
        studentlist.add("Petrov");
        studentlist.add("Sidorov");
        studentlist.add("Pupkin");
        studentlist.add("Ivanova");
        return studentlist;
    }

    public void  findStudent(ArrayList<String> list, String searchWord) {

        for (String string : list) {
            if (string.substring(0, 2).equals(searchWord)) {
                System.out.println("Ok");
                foundList.add(string);
            }
        }
    if (foundList.isEmpty()) System.out.println("No matches found");
    }



}
