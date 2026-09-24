import java.util.*;
class mark{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        int mark = sc.nextInt();
        sc.nextLine();
        String department = sc.nextLine();
        int score1 = mark/10;
        int score = mark%10;
        System.out.println("My name is "+Name);
        System.out.println("My score is "+score1+"."+score);
        System.out.println("My department is "+department);
    }
}