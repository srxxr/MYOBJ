package H1;

public class Q7 {
    public static void main(String[] args) {
        Student student[]=new Student[3];

        student[0]=new Student("sara",18);
        student[1]=new Student("sara2",8);
        student[2]=new Student("sara3",100);
        System.out.println();
        display(student);

    }
    public static void display(Student array[]){
        for (Student el: array)
            System.out.println(el);



    }
}
