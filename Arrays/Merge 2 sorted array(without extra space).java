class Solution
{
    //Function to merge the arrays
    public static int gapval(int n){
        if(n<=1)
            return 0;
        return ((n/2)+(n%2));
    }
    
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int gap=n+m;
        int i=0,j=0;
        long temp=0;
        for(gap=gapval(gap);gap>0;gap=gapval(gap)){
            for(i=0;i+gap<n;i++){
                if(arr1[i]>arr1[i+gap]){
                    temp=arr1[i+gap];
                    arr1[i+gap]=arr1[i];
                    arr1[i]=temp;
                }
            }
            
            for(j=(gap>n)?(gap-n):0;i<n && j<m;i++,j++){
                if(arr1[i]>arr2[j]){
                    temp=arr2[j];
                    arr2[j]=arr1[i];
                    arr1[i]=temp;
                }
            }
            
            if(j<m){
                for(j=0;j+gap<m;j++){
                    if(arr2[j]>arr2[j+gap]){
                    temp=arr2[j+gap];
                    arr2[j+gap]=arr2[j];
                    arr2[j]=temp;
                }
                }
            }
        }
    }
}