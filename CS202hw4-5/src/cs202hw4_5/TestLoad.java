package cs202hw4_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestLoad {
	public void testLoad() {
		BST b = new BST();
		String f = "t.txt";
		String line = null;
		int c = 0;
		int type = 0;
		try {
			FileReader fileReader = new FileReader(f);
			// Always wrap this in a buffer reader
			BufferedReader br = new BufferedReader(fileReader);
			while ((line = br.readLine()) != null) {
				type = type + 1;
				c = c + 1;
				if (c % 2 != 0)
					b.insertValue(c, line, type);
				else
					b.insertValue(c, line, type);
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + f + "'");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		b.checkDB();
	}

	public Boolean isType(String testStr, String type) {
		try {
			if (type.equalsIgnoreCase("int")) {
				Integer.parseInt(testStr);
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int askInt() {
		Scanner ent = new Scanner(System.in);
		Boolean error = false;
		String userInp = "";
		do {
			System.out.println("1. Automated test function(s).");
			System.out.println("2. Translate three constructs.");
			System.out.println("3. Exit Translation Application. ");
			userInp = ent.nextLine();
			if (!this.isType(userInp, "int")) {
				error = true;
				System.err.println("Error: must be an interger noob ");
			} else {
				error = false;
			}
		} while (error == true);
		return Integer.parseInt(userInp);
	}

	public void testLoad(int value) {
		BST b = new BST();
		String f = "t.txt";
		String line = null;
		int c = 0;
		int type = 0;
		try {
			FileReader fileReader = new FileReader(f);
			// Always wrap this in a buffer reader
			BufferedReader br = new BufferedReader(fileReader);
			while ((line = br.readLine()) != null) {
				type = type + 1;
				c = c + 1;
				if (c % 2 != 0)
					b.insertValue(c, line, type);
				else
					b.insertValue(c, line, type);
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + f + "'");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	// interface class, to interface with the clients
	public void intf() {
		BST b = new BST();
		String f = "t.txt";
		String line = null;
		int c = 0;
		int type = 0;
		try {
			FileReader fileReader = new FileReader(f);
			// Always wrap this in a buffer reader
			BufferedReader br = new BufferedReader(fileReader);
			while ((line = br.readLine()) != null) {
				type = type + 1;
				c = c + 1;
				if (c % 2 != 0)
					b.insertValue(c, line, type);
				else
					b.insertValue(c, line, type);
			}
			br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + f + "'");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		Scanner reader = new Scanner(System.in);
		int opt = 0;
		boolean done = false;

		while (!done) {
			opt = askInt();
			switch (opt) {
			case 1:
				System.out.println("Loading all the translated text.");
				testLoad();
				text t = new ctq("CTQ construct 3");
				System.out.println("Testing search/reterieve function for : " + t.getString());
				b.searchString(t);
				break;
			case 2:
				break;
			case 3:
				System.out.println("Goodbye world");
				done = true;
				break;
			default:
				System.out.println("Invalid entry");
				break;
			}
		}
	}
}
