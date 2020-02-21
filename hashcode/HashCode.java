/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author int320
 */
public class HashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = new String("ABCD");
        String b = new String("CDEF");
        String c = new String("ABCD");
        System.out.println(Long.toHexString(a.hashCode()));
        System.out.println(Long.toHexString(b.hashCode()));
        System.out.println(Long.toHexString(c.hashCode()));
        Student st1 = new Student(1001, "Somchai");
        Student st2 = new Student(1002, "Somchart");
        Student st3 = new Student(1003, "Somsri");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(Long.toHexString(st1.hashCode()));
        System.out.println(Long.toHexString(st2.hashCode()));
        Map<Integer, Student> students = new HashMap<>();
        students.put(st1.getId(), st1);
        students.put(st2.getId(), st2);
        Student tmp = students.get(1002);
        System.out.println(tmp.getName());

    }

}

class Student {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
