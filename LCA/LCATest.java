import org.junit.jupiter.api;

public class LCATest {

    @Test
    void testFindLCA(){
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7);
        Assertions.assertEquals(2, findLCA(4, 5));

    }
}