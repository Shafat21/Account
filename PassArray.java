public class PassArray 
{   
    public static void main(String[] args) 
    {
        int [] arraay = {1,2,3,4,5};
        System.out.println("Array Declared: ");
        for(int value:arraay)
        {
            System.out.println(value);
        }

        modifyArray(arraay);
        
        System.out.println("After Modification Array: ");
        for(int value:arraay)
        {
            System.out.println(value);
        }

        System.out.println("After Element Modification: ");
        modifyElement(arraay[3]);
        System.out.println(arraay[3]);

       
    }
    // End of Main
    
    public static void modifyArray(int [] array)
    {
        for(int i=0;i<array.length;i++)
        {
            array[i] = array[i]*2; 
        }
    }

    // End of Modify Array
    public static void modifyElement(int element)
    {
       
            element = element*3; 
       
    }
}