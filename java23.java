
public class java23 {
    public static void main(String[] args) {
        for(char i = 'A'; i <= 'E'; i++)
        {
            for(char j = 'E'; j >= i; j --)
                System.out.print(Character.toString(j) + ' ');
            System.out.println();
        }
    }

}
/*

E D C B A 
E D C B 
E D C 
E D 
E 


*/