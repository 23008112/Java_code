public class switchdemo {
    public static void main(String[] args) {
        //in switch we cannot give condition relational condition in the switch case, 
        //only for clear cut condition it can be used in that case if and else if  can be used

        int a = 8;
        switch(a)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default :
            System.out.println("Invalid case");
            break;
        }

    }
    
}
