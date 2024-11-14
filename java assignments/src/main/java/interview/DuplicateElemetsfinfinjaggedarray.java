package interview;

import java.util.Arrays;

public class DuplicateElemetsfinfinjaggedarray {

	public static void main(String[] args) {

		int a1[][]= { {1,2,1},{9,7,2},{7,6,4}};
		int a2[][]= {{2,6,8,6},{0,1,3,9,7},{7,2,0},{8,3}};

		System.out.println("input:");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(Arrays.toString(a1[i]));
		}
		System.out.println("input:");  
		for (int i = 0; i < a2.length; i++) {
			System.out.println(Arrays.toString(a2[i]));
		}

		//iterate  a array rows and columns and then iterate b array also then compare with a array element with b array
		boolean isfound=false;
		for (int i = 0; i < a1.length; i++) {// a1 array rows

			for (int j = 0; j < a1[i].length; j++) {//iterate a1 rows with columns
				int tagetelment=a1[i][j];
				for (int k = 0; k < a2.length; k++) {//a2 rows
					isfound=false;
					for (int l = 0; l < a2[i].length; l++) {//iterate a2 rows with colums
						if(tagetelment==a1[k][l]) {
							System.out.println(tagetelment);
						isfound=true;
						break;
					}

				}
				if(isfound)
					break;

			}
			
		}



		}







			}

		}
