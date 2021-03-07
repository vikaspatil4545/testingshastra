package com.testingshastra.coustomlisterner;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerToClass implements ITestListener {

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		/*Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Rectangle rect = new Rectangle();

		rect.setRect(0, 0, 1600, 700);
		BufferedImage img = robot.createScreenCapture(rect);
		try {
			
			ImageIO.write(img, "PNG", new File("D:\\screenshot/screenshootlistener"+System.currentTimeMillis()+".PNG"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Robot robo=null;
		try {
			 robo=new Robot();
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Rectangle rect=new Rectangle();
		rect.setRect(0, 0, 1600, 700);
		BufferedImage img=robo.createScreenCapture(rect);
		try
		{
		ImageIO.write(img, "PNG", new File("C:\\Users\\Admin\\Desktop\\InterviewQuestions\\screenshot/first"+System.currentTimeMillis()+".PNG"));
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
