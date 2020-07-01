public boolean makeBricks(int small, int big, int goal) {
  int A=goal%10;
	if(goal> small+(big*5))
		return false;
	if(A<5 && small<A)
		return false;
	else if (A > 5 && A > small+5)
		return false;
	else
		return true;
}

//We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops.

//makeBricks(3, 1, 8) → true
//makeBricks(3, 1, 9) → false
//makeBricks(3, 2, 10) → true
