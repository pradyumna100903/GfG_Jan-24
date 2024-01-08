/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	if(node1==null && node2==null) {
            return null;
        }
        
        Node curr = null;
        
        while(node1!=null || node2!=null) {
            if(node1==null) {
                Node temp = new Node(node2.data);
                temp.next = curr;
                curr = temp;
                node2 = node2.next;
            } else if(node2==null) {
                Node temp = new Node(node1.data);
                temp.next = curr;
                curr = temp;
                node1 = node1.next;
            } else if(node1.data > node2.data) {
                Node temp = new Node(node2.data);
                temp.next = curr;
                curr = temp;
                node2 = node2.next;
            } else {
                Node temp = new Node(node1.data);
                temp.next = curr;
                curr = temp;
                node1 = node1.next;
            }
        }
        

        
        return curr;	
    }
}
