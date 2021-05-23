/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worstfit;
import java.util.Scanner;
/**
 *
 * @author royla
 */
public class WorstFIT {

    /**
     * @param args the command line arguments
     */
    
      public final static int MAX = 25;

	private static int[] bf = new int[MAX], ff = new int[MAX];

	public static void main(String[] args) {
		int[] frag = new int[MAX], b = new int[MAX], f = new int[MAX];
		int nb, nf, temp, highest = 0;




		System.out.print("\nEnter the number of blocks:");

		nb = STDIN_SCANNER.nextInt();

		System.out.print("Enter the number of files:");

		nf = STDIN_SCANNER.nextInt();

		System.out.println("\nEnter the size of the blocks:-");

		for(int i = 1; i <= nb; i++) {
			System.out.print("Block " + i + ":");

			b[i] = STDIN_SCANNER.nextInt();
		}

		System.out.println("Enter the size of the files:-");

		for(int i = 1; i <= nf; i++) {
			System.out.print("File " + i + ":");

			f[i] = STDIN_SCANNER.nextInt();
		}

		for(int i = 1; i <= nf; i++) {
			for(int j = 1; j <= nb; j++) {
				if(bf[j] != 1 /* if bf[j] is not allocated */) {
					temp = b[j] - f[i];

					if(temp >= 0) {
						if(highest < temp) {
							ff[i] = j;

							highest = temp;
						}
					}
				}
			}

			frag[i] = highest;

			bf[ff[i]] = 1;

			highest = 0;
		}

		System.out.print("\nFile_no  \tFile_size  \tBlock_no  \tBlock_size  \tFragment");

		for(int i = 1; i <= nf; i++) {
			System.out.print("\n" + i + "\t\t" + f[i] + "\t\t" + ff[i] + "\t\t" + b[ff[i]] + "\t\t" + frag[i]);
		}
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}
    
    

