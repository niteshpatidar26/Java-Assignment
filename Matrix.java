
public class Matrix {
	public static void main(String args[]){  
		int a[][]={{4,4,4,},{5,5,5},{3,3,3}};    
		int b[][]={{9,9,9},{7,7,7},{2,2,2}};    
		int c[][]=new int[3][3];   
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		}
		System.out.print(c[i][j]+" ");
		}
		System.out.println();  
		}    
		}

}
