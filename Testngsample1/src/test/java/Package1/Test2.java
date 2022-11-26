package Package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.*;

public class Test2 {
	
	@Test(dataProvider="data2")
	public void testData( String d1 )
	{
		//List<ArrayList<String> >data2=data();
		//System.out.println(data2.get(0).get(0));
		//System.out.println(d1.toString()+" "+d2.toString()+" "+d3.toString()+" "+d4.toString());
		System.out.println(d1);
	}
	@DataProvider(name="data2")
	public Iterator<String> data()
	{
		ArrayList<String>  data1= new ArrayList<String>();
		List<ArrayList<String> >data2= new ArrayList<ArrayList<String>>();
		
		data1.add("aa");
		data1.add("bb");
		data1.add("cc");
		data2.add(data1);
		return data1.iterator();
		
		//System.out.println(data2.get(0).get(0));
		
	}
	/*@DataProvider(name="dimention")
	public  Object[][] dataDimention()
	{
		Object[][] sample=new Object [3][4];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				sample[i][j]=i+" "+j;
			}
		}
		return sample;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
			System.out.println(sample[i][j]);
			}
		}
		*/
		

	
	

}
