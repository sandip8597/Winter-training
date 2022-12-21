package assignment.three;

class q9
{

    void print(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
        {
            int j;
            for (j = i + 1; j < size; j++)
            {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args)
    {
        q9 lead = new q9();
        int arr[] = new int[]{15,11,12,4,2,6,1};
        int n = arr.length;
        lead.print(arr, n);
    }
}