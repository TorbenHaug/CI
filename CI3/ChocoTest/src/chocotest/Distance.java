package chocotest;

import static choco.Choco.*;

import choco.cp.model.CPModel;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import choco.cp.solver.CPSolver;

public class Distance {
    static boolean solve_all = true;
    static int range_min = 0;
    static int range_max = 10;
    static int distance_equals = 4;

    public static void main(String[] args) {
        Model m = new CPModel();
        Solver s = new CPSolver();

        // Create variables
        IntegerVariable firstInt = new IntegerVariable("firstInt", range_min, range_max);
        IntegerVariable secondInt = new IntegerVariable("secondInt", range_min, range_max);

        // Add variables
        m.addVariable(firstInt);
        m.addVariable(secondInt);
        
        // Add constraints
        m.addConstraints(allDifferent(firstInt, secondInt));
        m.addConstraints(distanceEQ(firstInt, secondInt, distance_equals));

        // Solve constraints
        s.read(m);
        boolean result = s.solve();
        
        // Print result
        if (result) {
            do {
                // Get values
                int first = s.getVar(firstInt).getVal();
                int second = s.getVar(secondInt).getVal();
                
                // Print result
                System.out.println("|" + first + " - " + second + "| = 4");
            } while (solve_all && s.nextSolution());
        }
    }

}
