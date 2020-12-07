import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LCATest {

	@Before
	public void setUp() throws Exception {
		
		LCA tree = new LCA(); 
		Node a =new Node(1);
		Node b =new Node(2);
		Node c =new Node(3);
		Node d =new Node(4);
		Node e =new Node(5);
		
		
		
        tree.root = a;
        a.successors.add(b);
        a.successors.add(c);
        a.successors.add(d);
        a.successors.add(e);
        
        b.successors.add(d);
        
        c.successors.add(d);
        c.successors.add(e);
        
        d.successors.add(e);
		
	}

	@Test
	public void testFindLCA() {
		assertEquals("failure - lca did not work :(", findLCA(1, 2), 1);
        assertEquals("failure - lca did not work :(", findLCA(1, 3), 1);
        assertEquals("failure - lca did not work :(", findLCA(1, 4), 1);
        assertEquals("failure - lca did not work :(", findLCA(1, 5), 1);
        assertEquals("failure - lca did not work :(", findLCA(2, 3), 1);
        assertEquals("failure - lca did not work :(", findLCA(2, 4), 1);
        assertEquals("failure - lca did not work :(", findLCA(2, 5), 1);
        assertEquals("failure - lca did not work :(", findLCA(3, 4), 1);
        assertEquals("failure - lca did not work :(", findLCA(3, 5), 1);
        assertEquals("failure - lca did not work :(", findLCA(4, 5), 1);
	}

}
