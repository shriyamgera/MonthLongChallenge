class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st=new Stack<>();
        Stack<Character> ts=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch!='#'){
                st.push(ch);
                
            }else if(ch=='#'&&!st.empty()){
                st.pop();
            }
        }
        
        
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(ch!='#'){
                ts.push(ch);
                
            }else if(ch=='#'&&!ts.empty()){
                ts.pop();
            }
            
            
            }
            if(st.size()!=ts.size()){
                return false;
            }else{
                while(!st.isEmpty()){

                    if(st.peek()!=ts.peek()){
                        return false;
                    }
                    st.pop();
                    ts.pop();
                }
            }           
    return true;
    }
}
