class Solution {
    int[] pow;
    public char findKthBit(int n, int k) {
        pow=new int[21];
        initialize();
        return compute(n,k);
    }
    public void initialize(){
        for(int i=1;i<=20;i++) pow[i]=(pow[i-1]*2)+1;
    }
    public char compute(int n,int k){
        if(n==1) return '0';
        if(k<=pow[n-1]) return findKthBit(n-1,k);
        else if((pow[n-1]+1)==k) return '1';
        else{
            char c=findKthBit(n-1,pow[n-1]-(k-pow[n-1]-1)+1);
            return (c=='0')?'1':'0';
        }
    }
}