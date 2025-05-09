import java.util.ArrayList;

public class restoreip {
    public static void main(String[] args) {
        String input = "101023";

        // multiple solution to store it create an array list

        ArrayList<String> list = new ArrayList<>();
        String addr = "";
        int start = 0;
        int segments = 0;
        

        // recursive method
        restore(list, input, addr, segments, start);
        System.out.println(list);      // 0 -> total no of segments

    }

    private static void restore(ArrayList<String> list, String input, String addr, int segments, int start) {
        // base condition
        if (segments >= 4) {
            if (start == input.length()) {
                list.add(addr);

            }
            return;

        }
        // optimise
        for (int i = start; i < input.length(); i++) {
            String current =  input.substring(start, i+1);//to get them iteratively use substring method
            if (isValid(current))// if the current addr is valid
            {
                restore(list, input, addr+current+".", segments+1, i+1);
            }

        }

    }

    private static boolean isValid(String current) 
    {
        if(
            current.isEmpty() || 
            Integer.parseInt(current)>=255 ||
            (current.startsWith("0") && current.length()>1)
        )
        {
            return false;
        }
        return true;
        
    }
}
