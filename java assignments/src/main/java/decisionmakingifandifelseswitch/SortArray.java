package decisionmakingifandifelseswitch;

public class SortArray {

	public static void main(String[] args) {
		int a[]= {26,71,61,90,46};
		
		int temp=0;
		//ascending order
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];//temp=71
//					a[i]=a[j];//61
//					a[j]=temp;//71
//				}
//			}
//			System.out.println(a[i]);
//		}
		
		
		//descending order
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];//temp=71
					a[i]=a[j];//61
					a[j]=temp;//71
				}
			}
			System.out.println(a[i]);
		}		
		
		
		
		
		
		
		
		
		
	}

}
