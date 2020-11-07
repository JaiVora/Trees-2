/*
Time Complexity: O(n) | Since we are traversing the entire tree
Space Complexity: O(h) | h is the height of the tree. Space Complexity is taking into account the recursive stack space
Program ran successfully
Algorithm: 1. We are traversing the tree with two modifications:
            -Keeping track of the current number that is formed
            -Additional base condition checks if the given node is a leaf node and adds the result accordingly  
*/
class rootLeaf{
    int result = 0;
    public int sumNumbers(TreeNode root) {
        helper(root,0);
        return result;
    }
    private void helper(TreeNode root, int currSum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            result += currSum*10 + root.val;
        }
        helper(root.left, currSum*10 + root.val);
        helper(root.right, currSum*10 + root.val);       
    }
}
