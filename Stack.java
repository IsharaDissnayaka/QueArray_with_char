public class Stack {
    private int MaxSize;
    private int Top;
    private char array[];


    public boolean ISEpmty(){
        return(Top==-1);
    }

    public boolean IsFull(){
        return(Top==MaxSize-1);
    }

    public Stack(int size){
        Top=-1;
        MaxSize=size;
        array = new char[MaxSize];
    }

    public void Push(char Key){
         if(Top==MaxSize-1){
           System.out.println("array Is Full");
         }else{
            array[++Top]=Key;
         }
    }

    public char Pop(){
        if(Top==-1){
            System.out.println("Arra Is Empty");
        }else{
            return array[Top--];
        }
        return 0;
    }
    

    public char Peek(){
        if(Top==-1){
            System.out.println("Arra Is Empty");
        }else{
            return array[Top];
        }
        return 0;
    }


}
