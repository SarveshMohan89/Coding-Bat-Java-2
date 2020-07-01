public boolean evenlySpaced(int a, int b, int c) {
  int[] A= {a,b,c};
	Arrays.sort(A);
	int B=A[1]-A[0];
	int C=A[2]-A[1];

	return(B==C);
}

//Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

//evenlySpaced(2, 4, 6) → true
//evenlySpaced(4, 6, 2) → true
//evenlySpaced(4, 6, 3) → false
