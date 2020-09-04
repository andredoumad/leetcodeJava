package test;
import main.number_of_islands;
import org.junit.Test;
import org.junit.Before;

public class number_of_islands_test {
    private number_of_islands solution;

    @Before
    public void Setup(){this.solution = new number_of_islands();}

    @Test
    public void test_a(){
        char[][] matrix_0 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int result = 0;
        result = solution.solve(matrix_0);
        System.out.println("result " + result);

        char[][] matrix_1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        result = solution.solve(matrix_1);
        System.out.println("result " + result);
    }
}
