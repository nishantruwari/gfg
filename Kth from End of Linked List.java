class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        Node temp=head;
        int count=0;
        
        while(temp!=null){
            
            ++count;
            temp=temp.next;
        }
        
        if(k>count){
            return -1;
        }
        
        temp=head;
        for(int i=1;i<=count-k+1;i++){
            if(i==count-k+1){
                return temp.data;
            }
            temp=temp.next;
        }
        
        return -1;
        // Your code here
    }
}
