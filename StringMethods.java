public class StringMethods {
    public static void main(String[] args) {
        String strvar = "ennala mudiyala";
        String strvarr = "";
        String strvarrr = null; // there is always an issue with null
        System.out.println(strvar.contains("enn")); // true
        System.out.println(strvar.contains("ennnnnnnnnn")); // false

        System.out.println(strvar.equalsIgnoreCase("ENNALA MUDIYALA")); // TURE

        System.out.println(strvar.indexOf("a")); // 3

        System.out.println(strvar.isEmpty());// false has a data
        System.out.println(strvarr.isEmpty());// true

        // System.out.println(strvarrr.isEmpty());

        System.out.println(strvar.length()); // 15

        String sub =strvar.substring(4);
        System.out.println(sub);

        //trim leading and trailing spaces

        String s ="    I am sanjana        ";
        System.out.println(s.trim());


        String words[] ={"flower" , "flow", "Flight"};

    }

}
