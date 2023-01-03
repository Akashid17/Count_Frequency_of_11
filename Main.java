import java.lang.*;
import java.io.*;

class MathematicsX
{
	public
		int Frequency(int iArr[])
		{
			int iCount = 0;

			for(int j = 0; j < iArr.length; j++)
			{
				if(iArr[j] == 11 || iArr[j] == -11)
				{
					iCount += 1;
				}
			}

			return iCount;
		}
}

class Main
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bobj = new BufferedReader (new InputStreamReader(System.in));

		System.out.println("Enter Count of Elements");
		
		int iSize = Integer.parseInt(bobj.readLine());

		int iElements[] = new int[iSize];

		if(iElements.length == 0)
		{
			System.out.println("Unable to allocate memory");
			return;
		}

		System.out.println("Enter "+iSize+" Elements");

		for(int i = 0; i < iSize; i++)
		{
			iElements[i] = Integer.parseInt(bobj.readLine());
		}

		MathematicsX mobj = new MathematicsX();

		int iResult = mobj.Frequency(iElements);

		System.out.println("Count of 11 = "+iResult);		
	}
}