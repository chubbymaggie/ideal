package typestate;

import java.util.Collection;
import java.util.Set;

import boomerang.accessgraph.AccessGraph;
import heros.EdgeFunction;
import heros.solver.Pair;
import soot.SootMethod;
import soot.Unit;
import typestate.finiteautomata.Transition;

public interface TypestateChangeFunction {
  Set<? extends Transition> getReturnTransitionsFor(AccessGraph callerD1, Unit callSite,
      SootMethod calleeMethod, Unit exitStmt, AccessGraph exitNode, Unit returnSite,
      AccessGraph retNode);

  Collection<Pair<AccessGraph, EdgeFunction<TypestateDomainValue>>> generate(Unit stmt,
      Collection<SootMethod> optional);

  Set<? extends Transition> getCallTransitionsFor(AccessGraph callerD1, Unit callSite,
      SootMethod calleeMethod, AccessGraph srcNode, AccessGraph destNode);

  boolean seedInApplicationClass();

}
