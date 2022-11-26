package Package1;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="paul";
char[]data= name.toCharArray();
char[] data1=new char[data.length*2];
int i=0;
for(char a:data)
{
	
	data1[i]=a;
i=i+1;
	data1[i]=',';
	i=i+1;
	
	
}
for(char a:data1)
{
	
	System.out.println(a);
	
	
	
}
 
	}

}
