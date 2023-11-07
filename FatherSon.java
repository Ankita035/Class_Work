/* Create a class father, son and baby. All three classes have a method move. Write specific comment inside that like for father "I can walk with the help of stick", for son "I can run fast" and for  baby "I can crawl nicely" using multilevel inheritance. */

class Father 
{
    public void move() 
	{
        	System.out.println("I can walk with the help of a stick.");
    	}
}

class Son extends Father 
{
    @Override
    public void move() 
	{
        	System.out.println("I can run fast.");
    	}
}

class Baby extends Son 
{
    @Override
    public void move() 
	{
        	System.out.println("I can crawl nicely.");
    	}
}

public class FatherSon 
{
	public static void main(String args[]) 
	{
        	Father father = new Father();
        	Son son = new Son();
        	Baby baby = new Baby();

        	System.out.println("Father:");
        	father.move();

        	System.out.println("Son:");
        	son.move();

        	System.out.println("Baby:");
        	baby.move();
    	}
}