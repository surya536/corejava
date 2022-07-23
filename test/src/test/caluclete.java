package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class caluclete {
	private int sum(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

    caluclate cal= new caluclate();
    int sum = sum(22,21);
    int testsum = 43;
	@Test
    void test() {
		System.out.println("the sum is:" +sum+"="+testsum);
		assertEquals(sum,testsum);
	}
	
}
