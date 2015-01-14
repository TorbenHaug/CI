package puzzleSolver;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class PuzzleSolver {
    private static Model model = new CPModel();
    private static int uniqueNo = 0;
    private static int getUniqueNo(){
        return uniqueNo++;
    }
    private static void addEqualsConstraint(Model model, IntegerVariable x, IntegerVariable y, IntegerVariable u_in, IntegerVariable u_out, IntegerVariable z) {
        model.addConstraint(Choco.eq(Choco.plus(x, Choco.plus(y, u_in)), Choco.plus(z, Choco.mult(u_out, 10))));
    }
    private static void addConstraintLine(List<IntegerVariable> sum1, List<IntegerVariable> sum2, List<IntegerVariable> erg){
        ListIterator<IntegerVariable> itSum1 = sum1.listIterator(sum1.size());
        ListIterator<IntegerVariable> itSum2 = sum2.listIterator(sum2.size());
        ListIterator<IntegerVariable> itErg = erg.listIterator(erg.size());
        IntegerVariable zero = Choco.makeIntVar("ZERO", 0, 0, Options.V_ENUM);
        IntegerVariable u_in = zero;
        IntegerVariable u_out = Choco.makeIntVar("u" + getUniqueNo(), 0, 1, Options.V_ENUM);
        while (itSum1.hasPrevious() || itSum2.hasPrevious()){
            addEqualsConstraint(model, 
                    itSum1.hasPrevious() ? itSum1.previous() : zero, 
                    itSum2.hasPrevious() ? itSum2.previous() : zero, 
                    u_in,
                    u_out, 
                    itErg.hasPrevious() ? itErg.previous() : zero
            );
            u_in = u_out;
            u_out = Choco.makeIntVar("u" + getUniqueNo(), 0, 1, Options.V_ENUM);
        }
        if(itErg.hasPrevious()){
            Choco.eq(itErg.previous(), u_in);
        }else{
            Choco.eq(zero, u_in);
        }
    }
    public static void main(String[] args) {
        
        IntegerVariable A = Choco.makeIntVar("A", 0, 9, Options.V_ENUM); 
        IntegerVariable B = Choco.makeIntVar("B", 0, 9, Options.V_ENUM); 
        IntegerVariable C = Choco.makeIntVar("C", 0, 9, Options.V_ENUM); 
        IntegerVariable D = Choco.makeIntVar("D", 0, 9, Options.V_ENUM); 
        IntegerVariable E = Choco.makeIntVar("E", 0, 9, Options.V_ENUM); 
        IntegerVariable F = Choco.makeIntVar("F", 0, 9, Options.V_ENUM); 
        IntegerVariable G = Choco.makeIntVar("G", 0, 9, Options.V_ENUM); 
        IntegerVariable H = Choco.makeIntVar("H", 0, 9, Options.V_ENUM); 
        IntegerVariable I = Choco.makeIntVar("I", 0, 9, Options.V_ENUM); 
        IntegerVariable J = Choco.makeIntVar("J", 0, 9, Options.V_ENUM); 


        model.addConstraint(Choco.allDifferent(A, B, C, D, E, F, G, H, I, J));

        addConstraintLine(
                        Arrays.asList(A, H), 
                        Arrays.asList(A, A, A),
                        Arrays.asList(A, C, E)
                );
                
        addConstraintLine(
                        Arrays.asList(A, C, E), 
                        Arrays.asList(D, A, C),
                        Arrays.asList(J, F, D)
                );
                
        addConstraintLine(
                        Arrays.asList(D, A, C), 
                        Arrays.asList(H, F, C),
                        Arrays.asList(I, I, I)
                );
                
        addConstraintLine(
                        Arrays.asList(A, H), 
                        Arrays.asList(I, I, I),
                        Arrays.asList(J, B, J)
                );
                
        addConstraintLine(
                        Arrays.asList(G, I), 
                        Arrays.asList(H, F, C),
                        Arrays.asList(A, A, A)
                );
                
        addConstraintLine(
                        Arrays.asList(J, B, J), 
                        Arrays.asList(G, I),
                        Arrays.asList(J, F, D)
                );
                
        
        Solver s = new CPSolver();
        s.read(model);
        boolean result = s.solve();
        
        if (result) {
            System.out.println("A = " + s.getVar(A).getVal()); 
            System.out.println("B = " + s.getVar(B).getVal()); 
            System.out.println("C = " + s.getVar(C).getVal()); 
            System.out.println("D = " + s.getVar(D).getVal()); 
            System.out.println("E = " + s.getVar(E).getVal()); 
            System.out.println("F = " + s.getVar(F).getVal()); 
            System.out.println("G = " + s.getVar(G).getVal()); 
            System.out.println("H = " + s.getVar(H).getVal()); 
            System.out.println("I = " + s.getVar(I).getVal()); 
            System.out.println("J = " + s.getVar(J).getVal()); 

            

        } else {
            System.err.println("ERROR!");
        }
    }
}