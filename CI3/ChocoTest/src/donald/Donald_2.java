/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donald;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

/**
 *
 * @author abq308
 */
public class Donald_2 {
    private static void addEqualsConstraint(Model model, IntegerVariable x, IntegerVariable y, IntegerVariable u_in, IntegerVariable u_out, IntegerVariable z) {
        model.addConstraint(Choco.ifThenElse(
            Choco.geq(Choco.plus(x, Choco.plus(y, u_in)), 10),
                Choco.and(
                    Choco.eq(u_out, 1),
                    Choco.eq(Choco.plus(x, Choco.plus(y, u_in)), Choco.plus(z, 10))),
                Choco.and(
                    Choco.eq(u_out, 0),
                    Choco.eq(Choco.plus(x, Choco.plus(y, u_in)), z))
        ));
    }
    
    public static void main(String[] args) {
        // Build model
        Model model = new CPModel();
        
        // Declare every letter as a variable
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
        
        IntegerVariable u0 = Choco.makeIntVar("u1", 0, 0, Options.V_ENUM);
        IntegerVariable u1 = Choco.makeIntVar("u1", 0, 1, Options.V_ENUM);
        IntegerVariable u2 = Choco.makeIntVar("u2", 0, 1, Options.V_ENUM);
        IntegerVariable u3 = Choco.makeIntVar("u3", 0, 1, Options.V_ENUM);
        IntegerVariable u4 = Choco.makeIntVar("u4", 0, 1, Options.V_ENUM);
        IntegerVariable u5 = Choco.makeIntVar("u5", 0, 1, Options.V_ENUM);
        IntegerVariable u6 = Choco.makeIntVar("u6", 0, 1, Options.V_ENUM);
        
        // Add constraints.
        model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
        model.addConstraint(Choco.eq(u6, 0));
        addEqualsConstraint(model, d, g, u5, u6, r);
        addEqualsConstraint(model, o, e, u4, u5, o);
        addEqualsConstraint(model, n, r, u3, u4, b);
        addEqualsConstraint(model, a, a, u2, u3, e);
        addEqualsConstraint(model, l, l, u1, u2, r);
        addEqualsConstraint(model, d, d, u0, u1, t);
        
        // Build a solver, read the model and solve it
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
