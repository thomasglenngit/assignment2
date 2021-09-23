//use a linked list to maintain a sorted list of numbers in descending order

import java.io.*;
import java.util.Scanner;

class ListNode
{
	int value;
	ListNode next;

	//class constructor
	ListNode (int input_value, ListNode input_next)
	{
		value = input_value;
		next = input_next;
	}
}

//define a class for the linked list
class LinkedList
{
	private ListNode head;// the head of the linked list

	public LinkedList() 
	{
		head = null;
		
	}

    //insert a new number to the list; please complete the following function
	public void insert(int x) 
	{
		ListNode newNode = new ListNode(int x);

		if(head == null) {
			head = newNode;
			head.next = newNode;
		}
		else {
			ListNode newbie = head;
			head = newNode;
			head.next = newbie;
		}
	}
    
	//remove a number x from the list; please complete the following function
	public void remove(int x)
	{
	}

    //reverse the list; please complete the following function
	void reverse()
	{
	}

    //print the list to the console (computer's screen)
	public void printList() 
	{
		ListNode p = head;
		while (p != null)
		{
			if (p.next == null)
				System.out.println(p.value);
			else
				System.out.print(p.value + " -> ");

			p = p.next;
		}
	}
}

public class hw2_Q1
{
	public static void main(String[] args) throws IOException
	{
		final int ARRAY_SIZE = 100;
		int[] A = new int[ARRAY_SIZE];// store numbers for insert
		int[] B = new int[ARRAY_SIZE]; // store numbers for remove
		int n = 0;// the number of elements that will be stored in A
		int m = 0;// the number of elements that will be stored in B
		String inputFile1 = "hw2_Q1_insertData.txt"; // file with data for insert 
		String inputFile2 = "hw2_Q1_removeData.txt"; // file with data for remove 

		//input data from the insert file and return the total number
		//of the numbers in the file
		n = input(A, inputFile1); 
		
		//input data from the remove file and return the total number
		//of the numbers in the file
		m = input(B, inputFile2); 

		LinkedList list = new LinkedList();

		//perform insert operations
		for (int i = 0; i < n; i++)
			list.insert(A[i]);
		
		//perform remove operations
		for (int i = 0; i < m; i++)
			list.remove(B[i]);

		//list.printList();
		
		//reverse the list
		list.reverse();

		//print the list out
		list.printList();
	}

	private static int input(int[] A, String fileName) throws IOException
    {
        File myFile = new File(fileName);
        Scanner input = new Scanner(myFile);

        int i = 0;

        while(input.hasNext())
        {
            int value = input.nextInt();
            A[i] = value;
            i++;
        }

        input.close();

        return i;
    }
}

