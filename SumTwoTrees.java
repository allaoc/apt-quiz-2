public class SumTwoTrees {
        public TreeNode add(TreeNode a, TreeNode b) {
            if (a == null && b == null) return null;
			int infoa = 0;
			int infob = 0;
			TreeNode aleft = null;
			TreeNode aright = null;
			TreeNode bleft = null;
			TreeNode bright = null;
			if (a != null) {
				infoa = a.info;
				aleft = a.left;
				aright = a.right;
			}
			if (b != null){
				infob = b.info;
				bleft = b.left;
				bright = b.right;
			}
            return new TreeNode (infoa + infob, add(aleft, bleft), add(aright, bright));
        }
    }