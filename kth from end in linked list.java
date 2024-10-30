class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Node temp=head;
        int count=0;
        while(temp!=null){
            ++count;
            
            map.put(count,temp.data);
             temp=temp.next;
            
            
        }
        
        if(k>count){
            return -1;
        }
        
        return map.get(count+1-k);
        // Your code here
    }
}
