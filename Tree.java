class Tree {
private String treeName;
private String treeType;
private boolean leavesFall;
private String leafColor;

Tree() {
treeName = "";
treeType = "";
leavesFall = false;
leafColor = "";
}

Tree(String name, String type, boolean leaves, String color) {
  treeName = name;
  treeType = type;
  leavesFall = leaves;
  leafColor = color;
}

void setName(String tName){
  treeName = tName;
}

void setType (String type){
  treeType = type;
}

void setLeaves (boolean leaves){
  leavesFall = leaves;
}

void setColor (String color){
  leafColor = color;
}

String getName() {
  return treeName;
}

String getType() {
  return treeType;
}

boolean getLeaves(){
  return leavesFall;
}

String getColor() {
  return leafColor;
}

void Print() {
System.out.println("This is a "+ getName()+ " tree. It is a " + getType() + " and its leaves are currently "+ getColor()+". It "+ getLeaves() + " lose its leaves for the winter.");
}
}