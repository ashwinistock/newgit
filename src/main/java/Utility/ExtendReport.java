package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReport {

	public static ExtentReports addReport() {
		ExtentSparkReporter htmlReport = new ExtentSparkReporter("ExtentReport.html");
		ExtentReports Reports = new ExtentReports();
		Reports.attachReporter(htmlReport);
		Reports.setSystemInfo("Env", "UAT");
		Reports.setSystemInfo("Testing Type", "Regression test");
		
		return Reports;
	}
}
