package MPARALLEL;

import org.testng.annotations.Test;

public class GroupTesting {
	
	
	
	@Test(groups ={"sanity"})
	public void test1()
	{
		System.out.println( " i am inside 1 "+Thread.currentThread().getId());
}
	
	
	@Test(groups ={"sanity","smoke"})
	public void test2()
	{
		System.out.println( " i am inside 2 "+Thread.currentThread().getId());
}
	
	
	@Test(groups ={"sanity","regression"})
	public void test3()
	{
		System.out.println( " i am inside 3 "+Thread.currentThread().getId());
}
	
	@Test()
	public void test4()
	{
		System.out.println( " i am inside 4 "+Thread.currentThread().getId());
}
	

}
