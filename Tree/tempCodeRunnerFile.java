   Node leftMax =  new Node(Integer.MIN_VALUE);
          Node rightMin = new Node(Integer.MAX_VALUE);
          Node temp =isBst(root,leftMax,rightMin);
          inOrder();