package soot.jimple.toolkits.pointer;
import java.util.*;
import soot.*;

/** Represents the read or write set of a statement. */
public class SiteRWSet extends RWSet {
    protected HashSet sets = new HashSet();
    protected boolean callsNative = false;

    public String toString() {
        final StringBuffer ret = new StringBuffer();
        for( Iterator keyIt = sets.iterator(); keyIt.hasNext(); ) {
            final Object key = (Object) keyIt.next();
            ret.append( key.toString() );
        }
        return ret.toString();
    }

    public boolean getCallsNative() {
	return callsNative;
    }

    public boolean setCallsNative() {
	boolean ret = !callsNative;
	callsNative = true;
	return ret;
    }

    /** Returns an iterator over any globals read/written. */
    public Set getGlobals() {
	HashSet ret = new HashSet();
	for( Iterator sIt = sets.iterator(); sIt.hasNext(); ) {
	    final RWSet s = (RWSet) sIt.next();
	    ret.addAll( s.getGlobals() );
	}
	return ret;
    }

    /** Returns an iterator over any fields read/written. */
    public Set getFields() {
	HashSet ret = new HashSet();
	for( Iterator sIt = sets.iterator(); sIt.hasNext(); ) {
	    final RWSet s = (RWSet) sIt.next();
	    ret.addAll( s.getFields() );
	}
	return ret;
    }

    /** Returns a set of base objects whose field f is read/written. */
    public PointsToSet getBaseForField( Object f ) {
	Union ret = null;
	for( Iterator sIt = sets.iterator(); sIt.hasNext(); ) {
	    final RWSet s = (RWSet) sIt.next();
	    PointsToSet os = s.getBaseForField( f );
	    if( os == null ) continue;
	    if( os.isEmpty() ) continue;
	    if( ret == null ) ret = G.v().Union_factory.newUnion();
	    ret.addAll( os );
	}
	return ret;
    }

    public boolean hasNonEmptyIntersection( RWSet oth ) {
	if( sets.contains( oth ) ) return true;
	for( Iterator sIt = sets.iterator(); sIt.hasNext(); ) {
	    final RWSet s = (RWSet) sIt.next();
	    if( oth.hasNonEmptyIntersection( s ) ) return true;
	}
	return false;
    }

    /** Adds the RWSet other into this set. */
    public boolean union( RWSet other ) {
	if( other == null ) return false;
	boolean ret = false;
	if( other.getCallsNative() ) ret = setCallsNative();
	if( other.getFields().isEmpty() && other.getGlobals().isEmpty() ) return ret;
	return sets.add( other ) | ret;
    }

    public boolean addGlobal( SootField global ) {
	throw new RuntimeException( "Not implemented; try MethodRWSet" );
    }
    public boolean addFieldRef( PointsToSet otherBase, Object field ) {
	throw new RuntimeException( "Not implemented; try MethodRWSet" );
    }
    public boolean isEquivTo( RWSet other ) {
	if( !( other instanceof SiteRWSet ) ) return false;
	SiteRWSet o = (SiteRWSet) other;
	if( o.callsNative != callsNative ) return false;
	return o.sets.equals( sets );
    }
}
