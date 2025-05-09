public class numberToDig {

    static String[] oneTo19=
    {
        "", "One", "Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve", "Thirteen","Fourteen","Fifteen",
        "Sixteen", "Seventeen" ,"Eighteen","Nineteen"

    };

    static String[] tens=
    {
        "", "","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"
    };

    public static String numTowords(int num)
    {
        if (num == 0)
        return "Zero";

        StringBuilder result = new StringBuilder();

        if(num >=1000)
        {
            result.append(oneTo19[num/1000]).append(" Thousand");
            num = num/1000;
            if(num > 0)
            result.append(" ");
        }

        if(num >=100)
        {
            result.append(oneTo19[num/100]).append(" Hundred");
            num = num/100;
            if(num > 0)
            result.append(" ");
        }

        if(num >=10)
        {
            result.append(tens[num]);
            num = num/100;
            if(num > 0)
            result.append(" ");
        }

        if(num > 0 && num<10)
        {
            result.append(oneTo19[num]);
        }

        return result.toString();



    }
    public static void main(String[] args) {
        int a = 123;
        System.out.println(numTowords(a));
    }
    
}
