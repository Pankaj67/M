package MfailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	
	int CountforRetryAttempt = 0 ;
	
	//set max limit 
	int setMaxLimitForRetry = 3;
	
	
	
	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess())
		{
		if(CountforRetryAttempt< setMaxLimitForRetry) {
			CountforRetryAttempt++;
			return true;
		}
		}
		
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

}
