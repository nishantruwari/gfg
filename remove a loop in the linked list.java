class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        
        Node temp=head;
        
        HashMap<Node,Integer> map=new HashMap<>();
        
        while(temp!=null){
            if(map.containsKey(temp.next)){
               // System.out.println("true");
               temp.next=null;
                
                return;
            }
            map.put(temp,1);
            temp=temp.next;
        }
        
       // System.out.println("false");
        // code here
        // remove the loop without losing any nodes
    }
}
