import Utility.CustLogger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);

        CustLogger.Info("/**********************Test Start ********************************/");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        CustLogger.Info("/**********************Test Passed ********************************/");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);

    }
}
