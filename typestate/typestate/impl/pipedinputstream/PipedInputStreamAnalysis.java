package typestate.impl.pipedinputstream;

import ideal.debug.IDebugger;
import soot.jimple.infoflow.solver.cfg.InfoflowCFG;
import typestate.TypestateAnalysis;
import typestate.TypestateDomainValue;

public class PipedInputStreamAnalysis extends TypestateAnalysis {

  public PipedInputStreamAnalysis(InfoflowCFG icfg) {
    super(new PipedInputStreamStateMachine(icfg), icfg);
  }
  

  public PipedInputStreamAnalysis(InfoflowCFG icfg, IDebugger<TypestateDomainValue> debugger) {
    super(new PipedInputStreamStateMachine(icfg), icfg, debugger);
  }
}
