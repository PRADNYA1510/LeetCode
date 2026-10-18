/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      if(root==null){
        return result;
      }

      Queue<TreeNode> line = new LinkedList<>();
      line.offer(root);
      while(!line.isEmpty()){
       int size = line.size();
       List<Integer> currentLevelData = new ArrayList<>();
       for(int i = 0;i<size;i++){
        TreeNode currentNode = line.poll();
        currentLevelData.add(currentNode.val);
        if(currentNode.left!=null){
            line.offer(currentNode.left);
        }
        if(currentNode.right!=null){
            line.offer(currentNode.right);
        }
       }
       result.add(currentLevelData); 
      }
      return result;  
    }
}