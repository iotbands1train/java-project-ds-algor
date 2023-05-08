package mod09.treesAlgorithms;

import models.mod01mod09.Users;

public class TestUsersBST {
	  public static UsersBST<Users> main(Users[] randomArr) {
	    // Create a UsersBST 
		  UsersBST<Users> tree=new UsersBST<>(randomArr);
		  tree.preorder();
		  tree.forEach(e->System.out.println(e));
		  return tree;
		  
	  }
	}