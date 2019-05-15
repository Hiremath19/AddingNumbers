public class Adding {
    public static void main(String args[]) {
        int[] arr = {10, 12, 13, 15, 17, 28, 30, 5, 27, 18};
        int sum = 0;

        for(int  i: arr)
        {
            if(i%2==0)
            {
              sum+=i;
                System.out.println("even number sum:" +sum);
            }
        }
    }

}

