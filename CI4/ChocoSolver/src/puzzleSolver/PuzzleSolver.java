/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


        model.addConstraint(Choco.allDifferent(A, B, C, D, E, F, G));

        addConstraintLine(
                        Arrays.asList(A, B, C), 
                        Arrays.asList(C, B),
                        Arrays.asList(A, E, E)
                );
                
        addConstraintLine(
                        Arrays.asList(A, B, C), 
                        Arrays.asList(D, D, E),
                        Arrays.asList(F, C, F)
                );
                
        addConstraintLine(
                        Arrays.asList(C, B), 
                        Arrays.asList(B, G, E),
                        Arrays.asList(B, C, A)
                );
                
        addConstraintLine(
                        Arrays.asList(A, E, E), 
                        Arrays.asList(C, B, G),
                        Arrays.asList(D, G, A, E)
                );
                
        addConstraintLine(
                        Arrays.asList(F, C, F), 
                        Arrays.asList(B, C, A),
                        Arrays.asList(D, G, A, E)
                );
                
        addConstraintLine(
                        Arrays.asList(D, D, E), 
                        Arrays.asList(B, G, E),
                        Arrays.asList(C, B, G)
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

            

        } else {
            System.err.println("ERROR!");
        }
    }
}
