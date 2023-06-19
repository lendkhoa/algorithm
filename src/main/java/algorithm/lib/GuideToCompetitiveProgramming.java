package algorithm.lib;

import java.util.*;

public class GuideToCompetitiveProgramming {
	public GuideToCompetitiveProgramming() {

	}

	public void generateSubset() {
		GenerateSubset runner = new GenerateSubset();
		runner.generatingSubset();
	}

	private static class GenerateSubset {
		public GenerateSubset() {

		}

		private void generatingSubset() {
			ArrayList<Integer> set = new ArrayList<>();
			generatingSubsetSearch(set, 1, 3);
			printList(set);
		}
		
		private void generatingSubsetSearch(ArrayList<Integer> set, int k, int n) {
			if(k > n) {
				printList(set);
			}	else {
				set.add(k);
				generatingSubsetSearch(set, k + 1, n);

				set.remove(set.size() - 1);
				generatingSubsetSearch(set, k + 1, n);
			}
		}

		private void printList(ArrayList<Integer> set) {
			if(set.size() == 0) System.out.println("WARNING: Set is empty");
			for(int i: set) {
				System.out.print(i + ", ");
			}
			System.out.println();
		}
	}
}
