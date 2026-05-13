package testng.failscript;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailScriptMachnisam implements IRetryAnalyzer {

    public int retryCount = 0;
    public static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < maxRetryCount) {
            retryCount++;

            return true;
        }
        return false;
    }
}
