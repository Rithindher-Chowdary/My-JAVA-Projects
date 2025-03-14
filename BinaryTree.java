import java.util.Scanner;

class BinaryTree {

  private static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  // Constructor
  public BinaryTree() {}

  // Method to insert elements into the tree
  public void populate(Scanner scanner) {
    System.out.println("Enter the root Node: ");
    int value = scanner.nextInt();
    root = new Node(value);
    populate(scanner, root);
  }

  private void populate(Scanner scanner, Node node) {
    System.out.println("Do you want to enter left of " + node.value + "? (true/false)");
    boolean left = scanner.nextBoolean();
    if (left) {
      System.out.println("Enter the value of the left of " + node.value + ": ");
      int value = scanner.nextInt();
      node.left = new Node(value);
      populate(scanner, node.left);
    }

    System.out.println("Do you want to enter right of " + node.value + "? (true/false)");
    boolean right = scanner.nextBoolean();
    if (right) {
      System.out.println("Enter the value of the right of " + node.value + ": ");
      int value = scanner.nextInt();
      node.right = new Node(value);
      populate(scanner, node.right);
    }
  }

  // Method to display the tree structure
  public void display() {
    display(this.root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  // Pretty display of the tree
  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    prettyDisplay(node.left, level + 1);
  }

  // Pre-order traversal
  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  // In-order traversal
  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }

  // Post-order traversal
  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }

  // Main method to run the program
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(scanner);

    System.out.println("Tree structure:");
    tree.prettyDisplay();

    System.out.println("Pre-order traversal:");
    tree.preOrder();
    System.out.println();

    System.out.println("In-order traversal:");
    tree.inOrder();
    System.out.println();

    System.out.println("Post-order traversal:");
    tree.postOrder();
    System.out.println();
  }
}