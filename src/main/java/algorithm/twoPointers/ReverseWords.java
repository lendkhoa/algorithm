package algorithm.twoPointers;

import java.util.*;

public class ReverseWords {
	public ReverseWords() {

	}

	public String reverse(String string) {
		StringBuilder res = new StringBuilder();
    StringBuilder word = new StringBuilder();
    int n = string.length();

    for(int i = n - 1; i >= 0; i--) {
      char current = string.charAt(i);
      if(current == ' ') {
        if(word.length() > 0) {
          res.append(word.toString());
          // clear word
          word.setLength(0);
        }
        res.append(' ');
      } else {
        word.insert(0, current);
      }
    }
    res.append(word.toString());

    return res.toString();
	}

	public void reverseArray(char[] ars) {
		int n = ars.length;
		if(n == 0) return;
		int left = 0;
		int right = n - 1;
		while(left < right) {
			char temp = ars[left];
			ars[left] = ars[right];
			ars[right] = temp;
		}
	}
}
