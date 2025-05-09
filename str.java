public class str {
    public static void main(String[] args) {
        String name = "Sanj";
        String emp = "Sanj";
        System.out.println(name == emp);// true since same data same data is given

        String tenant = new String("Sanj");
        System.out.println("Shallow");
        System.out.println(name == tenant); // false new key works makes sure to create a new memory

        System.out.println("deep");
        System.out.println(name.equals(tenant));

        // shallow and deep compare in java

        // shallow search checks for the same address(here the name and emp has the same
        // address)
        // it is easier to compare a string using its address insted of checking each
        // and every thingone by one

        // for name == tenant it throws false because of shallow compare

        // deep compare can be used by dot operator

        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder("Numbers are: ");

        for(int i =0;i <10000;i++)
        {
        builder.append(" "+i);
        }
        long end = System.nanoTime();

       // System.out.println(builder);
        System.out.println("Builder time = "+ (end - start));


        long starts = System.nanoTime();

        String strings = new String("Numbers are: ");

        for(int i =0;i <10000;i++)
        {
        strings += (" "+i);
        }
        long ends = System.nanoTime();

       // System.out.println(strings);
        System.out.println("string time = "+ (ends - starts));

    }

}
