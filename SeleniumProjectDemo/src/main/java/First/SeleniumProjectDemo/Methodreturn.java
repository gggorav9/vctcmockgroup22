package First.SeleniumProjectDemo;

public class Methodreturn {
	int max()
	{
		int x=56;
		int y=89;
		System.out.println("x = " + x + "\ny = " + y);
		if(x>y)
          return x;
		else
			return y;
	}

	public static void main(String[] args) {
		Methodreturn r= new Methodreturn();
		 int result =r.max();
		System.out.println("The greater number among x and y is: " + result);
		

	}

}
