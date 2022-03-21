package com.sgtesting.interfacedemo;
interface University
{
	void showUniversityName(String name);
}

interface EnggCollege
{
	void displayEnggCollegeName(String name);
}

class SLNEngg implements University,EnggCollege
{
	public void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
	
	public void displayEnggCollegeName(String name)
	{
		System.out.println("Engineering College Name :"+name);
	}
	
	public void showAddress(String address)
	{
		System.out.println("Address of the College:"+address);
	}
}
public class InterfaceExampleDemo {
	public static void main(String[] args) {
		University sln=new SLNEngg();
		sln.showUniversityName("VTU");
		
		EnggCollege engg=(EnggCollege) sln;
		engg.displayEnggCollegeName("SLN Engineering College");
	}

}
