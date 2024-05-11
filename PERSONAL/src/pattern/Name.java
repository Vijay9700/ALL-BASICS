package pattern;

public class Name {
	public static void main(String[] args) throws InterruptedException {
        printS();
        Thread.sleep(1000);
        printA();
        Thread.sleep(1000);
        printM();
    }

    public static void printS() {
        int size = 7; // Size of the letter 'S'
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 || i == size / 2 || i == size - 1) && j > 0 && j < size - 1)
                    System.out.print("s");
                else if (i < size / 2 && j == 0)
                    System.out.print("s");
                else if (i > size / 2 && j == size - 1)
                    System.out.print("s");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printA() {
        int size = 7; // Size of the letter 'A'
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size / 2 + 1; j++) {
                if ((i == 0 && j != size / 2) || (i == size / 2) || (j == 0 || j == size / 2 + 1))
                    System.out.print("a");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
    public static void printM() {
        int size = 7; // Size of the letter 'M'
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= size; j++) {
                if (j == 0 || j == size || (i == j && j <= size / 2) || (i + j == size - 1 && j >= size / 2))
                    System.out.print("m");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

}

