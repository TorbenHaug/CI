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

/**
 *
 * @author abq329
 */
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
        IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
        IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
        IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
        IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
        IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
        IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
        IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
        IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
        IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
        IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
        model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
        addConstraintLine(
                Arrays.asList(d,o,n,a,l,d), 
                Arrays.asList(g,e,r,a,l,d),
                Arrays.asList(r,o,b,e,r,t)
        );
        
        Solver s = new CPSolver();
        s.read(model);
        boolean result = s.solve();
        
        if (result) {
            // Print name value
            System.out.print("d = " + s.getVar(d).getVal());
            System.out.print("o = " + s.getVar(o).getVal());
            System.out.print("n = " + s.getVar(n).getVal());
            System.out.print("a = " + s.getVar(a).getVal());
            System.out.print("l = " + s.getVar(l).getVal());
            System.out.print("d = " + s.getVar(d).getVal());
            System.out.println();
            System.out.print("g = " + s.getVar(g).getVal());
            System.out.print("e = " + s.getVar(e).getVal());
            System.out.print("r = " + s.getVar(r).getVal());
            System.out.print("a = " + s.getVar(a).getVal());
            System.out.print("l = " + s.getVar(l).getVal());
            System.out.print("d = " + s.getVar(d).getVal());
            System.out.println();
            System.out.print("r = " + s.getVar(r).getVal());
            System.out.print("o = " + s.getVar(o).getVal());
            System.out.print("b = " + s.getVar(b).getVal());
            System.out.print("e = " + s.getVar(e).getVal());
            System.out.print("r = " + s.getVar(r).getVal());
            System.out.print("t = " + s.getVar(t).getVal());
            //System.out.print("u6 = " + s.getVar(u6).getVal());
        } else {
            System.err.println("ERROR!");
        }
    }
}
