class Pattern123
{

    public static void main(String s[])
    {
        int i, j, c, N;

        N = 4;
        c = 1;
        for (i = 1; i <= N; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(c + "  ");
                c++;
            }
            System.out.println("");
        }
    }
}