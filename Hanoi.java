public class Hanoi
{
    public static void main(String[] args)
    {
        solve(3, "A", "B", "C");
    }
    
    public static void solve(int n, String src, String aux, String dst){
        if (n == 0){
            return;
        }
        solve(n-1, src, dst, aux);
        System.out.println("Move " + src + "-> " + dst);
        solve(n-1, aux, src, dst);
    }
}
