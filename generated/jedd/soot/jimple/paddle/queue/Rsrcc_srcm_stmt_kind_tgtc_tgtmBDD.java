package soot.jimple.paddle.queue;

import soot.util.*;
import soot.jimple.paddle.bdddomains.*;
import soot.jimple.paddle.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD extends Rsrcc_srcm_stmt_kind_tgtc_tgtm {
    private final jedd.internal.RelationContainer bdd =
      new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), stmt.v(), kind.v(), tgtc.v(), tgtm.v() },
                                          new PhysicalDomain[] { V1.v(), T1.v(), ST.v(), FD.v(), V2.v(), T2.v() },
                                          ("private <soot.jimple.paddle.bdddomains.srcc:soot.jimple.padd" +
                                           "le.bdddomains.V1, soot.jimple.paddle.bdddomains.srcm:soot.ji" +
                                           "mple.paddle.bdddomains.T1, soot.jimple.paddle.bdddomains.stm" +
                                           "t:soot.jimple.paddle.bdddomains.ST, soot.jimple.paddle.bdddo" +
                                           "mains.kind:soot.jimple.paddle.bdddomains.FD, soot.jimple.pad" +
                                           "dle.bdddomains.tgtc:soot.jimple.paddle.bdddomains.V2, soot.j" +
                                           "imple.paddle.bdddomains.tgtm:soot.jimple.paddle.bdddomains.T" +
                                           "2> bdd at /home/olhotak/soot-trunk2/src/soot/jimple/paddle/q" +
                                           "ueue/Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD.jedd:31,12-66"));
    
    void add(final jedd.internal.RelationContainer tuple) { bdd.eqUnion(tuple); }
    
    public Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD(final jedd.internal.RelationContainer bdd, String name) {
        this(name);
        this.add(new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), tgtc.v(), tgtm.v(), kind.v(), stmt.v() },
                                                     new PhysicalDomain[] { V1.v(), T1.v(), V2.v(), T2.v(), FD.v(), ST.v() },
                                                     ("this.add(bdd) at /home/olhotak/soot-trunk2/src/soot/jimple/p" +
                                                      "addle/queue/Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD.jedd:33,134-13" +
                                                      "7"),
                                                     bdd));
    }
    
    Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD(String name) {
        super(name);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
    }
    
    public Iterator iterator() {
        ;
        return new Iterator() {
            private Iterator it;
            
            public boolean hasNext() {
                if (it != null && it.hasNext()) return true;
                if (!jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD()))
                    return true;
                return false;
            }
            
            public Object next() {
                if (it == null || !it.hasNext()) {
                    it =
                      new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), tgtc.v(), tgtm.v(), kind.v(), stmt.v() },
                                                          new PhysicalDomain[] { V1.v(), T1.v(), V2.v(), T2.v(), FD.v(), ST.v() },
                                                          ("bdd.iterator(new jedd.Attribute[...]) at /home/olhotak/soot-" +
                                                           "trunk2/src/soot/jimple/paddle/queue/Rsrcc_srcm_stmt_kind_tgt" +
                                                           "c_tgtmBDD.jedd:45,25-28"),
                                                          bdd).iterator(new Attribute[] { srcc.v(), srcm.v(), stmt.v(), kind.v(), tgtc.v(), tgtm.v() });
                    bdd.eq(jedd.internal.Jedd.v().falseBDD());
                }
                Object[] components = (Object[]) it.next();
                return new Tuple((Context) components[0],
                                 (SootMethod) components[1],
                                 (Unit) components[2],
                                 (Kind) components[3],
                                 (Context) components[4],
                                 (SootMethod) components[5]);
            }
            
            public void remove() { throw new UnsupportedOperationException(); }
        };
    }
    
    public jedd.internal.RelationContainer get() {
        final jedd.internal.RelationContainer ret =
          new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), stmt.v(), kind.v(), tgtc.v(), tgtm.v() },
                                              new PhysicalDomain[] { V1.v(), T1.v(), ST.v(), FD.v(), V2.v(), T2.v() },
                                              ("<soot.jimple.paddle.bdddomains.srcc:soot.jimple.paddle.bdddo" +
                                               "mains.V1, soot.jimple.paddle.bdddomains.srcm:soot.jimple.pad" +
                                               "dle.bdddomains.T1, soot.jimple.paddle.bdddomains.stmt:soot.j" +
                                               "imple.paddle.bdddomains.ST, soot.jimple.paddle.bdddomains.ki" +
                                               "nd:soot.jimple.paddle.bdddomains.FD, soot.jimple.paddle.bddd" +
                                               "omains.tgtc:soot.jimple.paddle.bdddomains.V2, soot.jimple.pa" +
                                               "ddle.bdddomains.tgtm:soot.jimple.paddle.bdddomains.T2> ret =" +
                                               " bdd; at /home/olhotak/soot-trunk2/src/soot/jimple/paddle/qu" +
                                               "eue/Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD.jedd:55,63-66"),
                                              bdd);
        bdd.eq(jedd.internal.Jedd.v().falseBDD());
        return new jedd.internal.RelationContainer(new Attribute[] { srcc.v(), srcm.v(), tgtc.v(), tgtm.v(), kind.v(), stmt.v() },
                                                   new PhysicalDomain[] { V1.v(), T1.v(), V2.v(), T2.v(), FD.v(), ST.v() },
                                                   ("return ret; at /home/olhotak/soot-trunk2/src/soot/jimple/pad" +
                                                    "dle/queue/Rsrcc_srcm_stmt_kind_tgtc_tgtmBDD.jedd:57,8-14"),
                                                   ret);
    }
    
    public boolean hasNext() {
        return !jedd.internal.Jedd.v().equals(jedd.internal.Jedd.v().read(bdd), jedd.internal.Jedd.v().falseBDD());
    }
}
