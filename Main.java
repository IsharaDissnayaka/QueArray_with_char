public class Main {
    public static void main(String[] args) {
    

        QueX q1 = new QueX(5);
    q1.Insert('A');
         q1.Insert('D');
         q1.Insert('G');
         q1.Insert('P');
         q1.Insert('T');

         Stack s1 = new Stack(5);

     
         while(!(q1.IsEmpty())){
            // System.out.println( q1.Delete());
           s1.Push(q1.Delete());
         }

         while(!(s1.ISEpmty())){
            q1.Insert(s1.Pop());
         }


         while(!(q1.IsEmpty())){
            System.out.println( q1.Delete());
        }
}
    
}
