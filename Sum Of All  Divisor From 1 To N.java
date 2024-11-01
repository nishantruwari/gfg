//java code

class Solution {
    public static long sumOfDivisors(int n) {
        
        long ans=0;
        for(int i=1;i<=n;i++){
            ans+=(int)n/i*i;
            
        }
        return ans;
        // code here
    }
}

//C++ code
class Solution {
  public:
    long long sumOfDivisors(int n) {
        
        long long ans=0;
        for(int i=1;i<=n;i++){
            ans+=(int)(n/i)*i;
        }
        return ans;
        // Write Your Code here
    }
};
