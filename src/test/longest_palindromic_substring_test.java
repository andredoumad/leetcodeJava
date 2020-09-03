package test;
import main.longest_palindromic_substring;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class longest_palindromic_substring_test {
    private longest_palindromic_substring solution;

    @Before
    public void SetUp(){this.solution = new longest_palindromic_substring();}

    @Test
    public void test_a(){
        String result = "";
        result = solution.solve("babad");
        System.out.println(result);
    }
}
