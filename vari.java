public class vari {
    public static void main(String[] args) {
        int age = 24;
        inc(age);
        System.out.println("age 2 " + age);


        String[] depts = {"AIDS","IOT","AIML"};
        changeDept(depts);
        System.out.println("first index in main  " + depts[0]);



    }

    public static void inc(int age)
    {
        age++;
        System.out.println("age 1 " + age);
    }
    public static void changeDept(String[] depts)
    {
        depts[0]= "Artificial Intelligence and Data Science";
        System.out.println("first index inside method  " + depts[0]);

    }
}
