public class prefixopti {
    public static void main(String[] args) {
        String words[] = { "flower", "flow", "flight" };
        String prefix = words[0];
        for (int i = 1; i < words.length; i++) {
            while (words[i].indexOf(prefix) != 0)// checking if the word is present and if the index is 0
            // if it is it will go out of the loop else will remove the last element
            {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0 || prefix.isEmpty()) // both same condition only
                {
                    // return
                    i = words.length;
                    break;
                }
            }
        }
        System.out.println(prefix);

    }

}
