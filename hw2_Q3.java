import java.io.*;
import java.util.Scanner;

class Stack
{
    private int []A;
    private int size;
    private int top; // as discussed in class, top refers to the first empty slot of the stack

    public Stack(int input_size)
    {
        size = input_size;
        A = new int[size];
        top = 0;
    }


    public boolean isEmpty()
    {
        if(top == 0)
            return true;
        else
            return false;
    }

    public boolean isFull()
    {
        if(top == size)
            return true;
        else
            return false;
    }

	//please complete the following function
    public void push(int x)
    {
    }

	//please complete the following function
    public int pop()
    {
    }
}

public class hw2_Q3
{
    public static void main(String[] args) throws IOException
	{
		final int STACK_SIZE = 30;  
		Stack stack = new Stack(STACK_SIZE); 
		String inputFile = "hw2_Q3_input.txt";//input file with operations 

		//open the input file
        File myFile = new File(inputFile);
        Scanner input = new Scanner(myFile);

		//read operations from the input file
		String op;
		int value, x;
		while(input.hasNext())
		{
			Scanner nextLine = new Scanner(input.nextLine());
			op = nextLine.next();

			if (op.equals("pop")) // a pop operation, 
			{
				if(stack.isEmpty() == false)
				{
					x = stack.pop();
					System.out.print(x+" ");// the pop result is printed to the console/screen
				}
			}
			else // a push operation
			{
				if(stack.isFull() == false)
				{
					value = nextLine.nextInt();
					stack.push(value);
				}
			}
		}

 		System.out.println();
		input.close();
	}
}
