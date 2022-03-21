package com.sgtesting.tests;

public class ExecuteAutoITScriptDemo {

	public static void main(String[] args) {
		executeDemo();

	}
	
	private static void executeDemo()
	{
		try
		{
			String path="G:\\ExampleAutomation1\\AUTOIT\\SaveFileContentDemo.exe";
		//	Runtime.getRuntime().exec(path);
			Runtime obj=Runtime.getRuntime();
			obj.exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
