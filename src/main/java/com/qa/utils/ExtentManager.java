package com.qa.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {

        if (extent == null) {

            String path = System.getProperty("user.dir") + "/test-output/ExtentReport.html";

            ExtentSparkReporter spark = new ExtentSparkReporter(path);

            spark.config().setReportName("Automation Report");
            spark.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();
            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "Selenium Framework");
            extent.setSystemInfo("QA", "Tester");
        }

        return extent;
    }
}