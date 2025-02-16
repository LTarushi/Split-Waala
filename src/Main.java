import java.util.*;
class Split
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your group's name:");
        String groupName = sc.nextLine();
        System.out.println("Enter the number of members in your group:");
        int memberCount = sc.nextInt();
        sc.nextLine();
        HashMap<String, HashMap<String, Double>[]> hisaab = new HashMap<>();
        for(int i=0;i<memberCount;i++)
        {
            System.out.println("Enter the name of " + (i+1) + " person:");
            String name = sc.nextLine();
            System.out.println(name);
        }
    }
}