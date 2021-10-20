class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree(); {
      tree1.setName("");
      tree1.setType("");
      tree1.setLeaves(false);
      tree1.setColor("");
      tree1.Print();
    }
  
    Tree tree2 = new Tree("maple","broadleaf",false,"red");
    tree2.Print();

    tree1.setName("spruce");
    tree1.setType("conifer");
    tree1.Print();
}  
}


