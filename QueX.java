class QueX{
    private int Nitems;
    private int MaxSize;
    private int Front;
    private int Rear;
    private char arra[];

    public QueX(int size){
        this.MaxSize=size;
        this.Nitems=0;
        this.Front=0;
        this.Rear=-1;
        arra= new char[MaxSize];
    }

    public boolean IsEmpty(){
        return(Nitems==0);
    }

    public boolean IsFull(){
        return(Nitems==MaxSize);
    }


    public void Insert(char key){
       if(Nitems==MaxSize){
          System.out.println("Array IS Full");
       }else{
          if(Rear==MaxSize-1){
            Rear=-1;
          }

           Nitems++;
           arra[++Rear]=key;        
       }
    }


    public char Delete(){
        if(IsEmpty()){
            System.out.println("que IS Empty");
        }
        else{
            char temp = arra[Front++];
            Nitems--;
            if(Front==MaxSize){
                Front=0;
            }
            return temp;
        }

        return 0;
    }


}