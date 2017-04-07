package from40417;

import java.io.IOException;

public class Main {

	public static void main(String[] a) throws IOException {
		char choice, ignore;
		for (;;) {
			do {
				System.out.println("Help on:");
				System.out.println(" 1. if");
				System.out.println(" 2. switch");
				System.out.println(" 3. for");
				System.out.println(" 4. while");
				System.out.println(" 5. do-while");
				System.out.println(" 6. break");
				System.out.println(" 7. continue\n");
				System.out.print("Choose one (q to quit): ");
				choice = (char) System.in.read();

				do {
					ignore = (char) System.in.read();
				} while (ignore != '\n');
			} while (choice < '1' | choice > '7' & choice != 'q');
			if (choice == 'q')
				break;
			System.out.println("\n");
			help(choice);
			System.out.println();
		}
	}

	public static void out(String str) {
		System.out.println(str);
	}

    public static void help(int choice){
        switch (choice) {
            case '1':
                out(helpIf());
                break;
            case '2':
                out(helpSwitch());
                break;
            case '3':
                out(helpFor());
                break;
            case '4':
                out(helpWhile());
                break;
            case '5':
                out(helpDoWhile());
                break;
            case '6':
                out(helpBreak());
                break;
            case '7':
                out(helpContinue());
                break;
        }
    }

	public static String helpIf() {
		return "The if:\n" +
				"if(condition) statement;" +
				"else statement;";
	}

	public static String helpSwitch(){
		return "The switch:\n" +
				"switch(expression) {" +
				" case constant:" +
				" statement sequence" +
				" break;" +
				" // ..." +
				"}";
	}

	public static String helpFor() {
		return "The for:\n" +
				"for(init; condition; iteration)" +
				" statement;";
	}

	public static String helpWhile(){
		return "The while:\n" +
				"while(condition) statement;";
	}

	public static String helpDoWhile(){
		return "The do-while:\n" +
				"do {" +
				" statement;" +
				"} while (condition);";
	}

	public static String helpBreak(){
		return "The break:\n" +
				"break; or break label;";
	}

	public static String helpContinue(){
		return "The continue:\n" +
				"continue; or continue label;";
	}
}