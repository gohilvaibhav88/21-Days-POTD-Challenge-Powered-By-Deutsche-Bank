class Solve {
    int[] findTwoElement(int arr[]) {
        
        int n=arr.length;
        int repeatingNum=0;
        for(int i=0;i<n;i++)
        {
            int ind=Math.abs(arr[i])-1;
            if(arr[ind]<0)
                repeatingNum=ind+1;
            else
                arr[ind]=-arr[ind];
        }
        
        int missingNum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                missingNum=i+1;
                break;
            }
        }
        
        int res[]=new int[2];
        res[0]=repeatingNum;
        res[1]=missingNum;
        
        return res;
    }
}