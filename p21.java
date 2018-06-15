public class Secondlargest {

    
    int a[];
    int total;
    int temp;
    int i;
    int j;
    
 
    for( i=0;i<total;i++)
    {
        
        for(j=i+1;j<total;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i] = a[j];
                a[j ]= temp;
            }
        }
    }
    return a[total-2];
    
        
    
     
    
   
   

   
     
     
    public static void main(String[] args) {
        int a[]={1,2,5,6,3,2};
        System.out.println("second Largest number");
        
        
        
        
     
    }

   



    
  
    
