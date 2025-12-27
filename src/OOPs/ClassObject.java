package OOPs;

public class ClassObject {

    //Class -> Blueprint for student!
    static class Student{
        int roll;
        int age;
        String name;
        String branch;

        //Default Constructor
        Student(){};

        //Parameterized Constructor
        Student(int roll,int age,String name,String branch){
            this.roll=roll;
            this.age=age;
            this.name=name;
            this.branch=branch;
        }

        //Methods
        //display
        public void display(){
            System.out.println("Student Details!");
            System.out.println("Roll : "+this.roll);
            System.out.println("Name : "+this.name);
            System.out.println("Branch : "+this.branch);
            System.out.println("Age : "+this.age);
        }
    }
    public static void main(String[] args){
        //Objects of Student class
        Student st1=new Student(1,21,"Aashvi Tekade","CSE-IOT");
        Student st2=new Student(14,21,"Maithili Ghodhmare","CSE-IOT");
        Student st3=new Student(43,23,"Dipak Mundhe","CSE-IOT");

        Student[] students={st1,st2,st3};
        //display student details
        int count=1;
        for(Student obj:students){
            System.out.println("Student : "+count++);
            obj.display();
            System.out.println();
        }

    }
}
