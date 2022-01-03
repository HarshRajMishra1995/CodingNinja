Public class Main{

 public static NewNode createLinkedList()
 {
  NewNode<String>N1=new NewNode<>("abc");
  NewNode<String>N2=new NewNode<>("def");
  NewNode<String>N3=new NewNode<>("ghi");
  NewNode<String>N4=new NewNode<>("jkl");
  NewNode<String>N5=new NewNode<>("mno");
  N1.next=N2;
  N2.next=N3;
  N3.next=N4;
  N4.next=N5;
  return N1;
 }
 public static void printLinkedList(NewNode<String>Head)
 {
  while(head!=null)
  {
   System.out.print(head.data+" ");
   head=head.next;
  }
  System.out.println();
 }
 public static int countNode(NewNode<String>Head)
 {
  NewNode<String>temp=head;
  int count=0;
  while(temp!=null)
  {
   count++;
   temp=temp.next;
  }
  return count;
 }
 public static void main(String[]args)
 {
  NewNode<String>head=createLinkedList();
  printLinkedList(head);
  int numberOfNodes=countNode(head);
  System.out.println("Number of nodes created :- "numberOfNodes);
 }
}