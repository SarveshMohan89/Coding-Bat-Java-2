public List<Integer> noNeg(List<Integer> nums) {
  Iterator<Integer> it =nums.listIterator();
	while(it.hasNext())
	{
		if(it.next()<0)
		{
			it.remove();
		}
	}
	return nums;
}

//Given a list of integers, return a list of the integers, omitting any that are less than 0.

//noNeg([1, -2]) → [1]
//noNeg([-3, -3, 3, 3]) → [3, 3]
//noNeg([-1, -1, -1]) → []
