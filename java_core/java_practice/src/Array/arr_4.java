package Array;

public class arr_4 {

	public static void main(String[] args) {


		int arr []= {70,77,67,55,-4,};
		int hieghts=100;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<hieghts)
			{
				hieghts=arr[i];
			}
		}
		System.out.println(hieghts);
		
	}

}
