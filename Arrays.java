

public class Arrays
{
    public static void main(String[] args)
    {
        
    }

    public static String[] expandArray(String[] a)
    {

        String[] expanded=new String[a.length*2]; // neuer String doppelte länge
        for (int i=0; i<a.length; i++) // geht durch string und setzt alle werte
                                       // in den neuen
        {
            expanded[i]=a[i];
        }
        return expanded;
    }

    public static void shiftElements(String[] a, int i)
    {
        
       for(int j = a.length -1; j>i; j--){
           a[j] = a[j-1];
       }
        
    }
}
