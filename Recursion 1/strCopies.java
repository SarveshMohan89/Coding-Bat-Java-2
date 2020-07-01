public boolean strCopies(String str, String sub, int n) {
  if(func(str,sub)==n)
		return true;
	else
		return false;
}
private   int func(String str, String sub) {
	int A=str.length();
	int B=sub.length();
	if(A<B)
		return 0;
	if(str.substring(0,B).equals(sub))
		return 1+ func(str.substring(1),sub);

	else
		return func(str.substring(1),sub);
}

//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

//strCopies("catcowcat", "cat", 2) → true
//strCopies("catcowcat", "cow", 2) → false
//strCopies("catcowcat", "cow", 1) → true
