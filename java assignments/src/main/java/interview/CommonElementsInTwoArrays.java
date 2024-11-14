package interview;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		int[] x= {2,5,3,7,1};

        int[] y={5,2,9,0,1};
        
        int z[]=new int[x.length];
        int k=0;
        for(int i=0;i<x.length;i++) {
        	for(int j=0;j<y.length;j++) {
        		if(x[i]==y[j]) {
        			z[k]=x[i];
        			k++;
        			break;
        		}
        		
        	}
        }
        
       for(int i=0;i<k;i++) {
    	   System.out.println(z[i]);
       }
        
        
        
        
        
	}

}
