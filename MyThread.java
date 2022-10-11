package com.sj.empmanagementapplication;



public class MyThread implements Runnable{
    public void run()
    {
    //task
    	for(int i=1; i<=3; i++)
    	{
    		System.out.println(i);
    	
    	try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
    	
        }

	 System.out.println("go");	
	
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("This");
		
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("is");
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("my");
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("first");
		
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("java");
		try {
    		Thread.sleep(1000);
    	}
    	catch (InterruptedException e)
    	    {
    		e.printStackTrace();
    	    }
		System.out.println("project");
		
		
    }
}