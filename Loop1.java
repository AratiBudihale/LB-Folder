public class Solution {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        
        if(n%2==1)
        {
            ans="Weired";
        }
        else 
        {
            if((n>=2) && (n<=5))
            {
               ans="Not Weired";
            }
            else if((n>=6) && (n<=20))
            {
                ans=" Weired";
            }
            else
            {
                ans="Not Weired";
            }
             
        }
        System.out.println(ans);
        
    }
}
