class thiskey{
int sum;
thiskey(){
    this (10,5);
}
  thiskey(int x, int y){
this.sum=x+y;

  }  
  void print(){
    System.out.println("Sum is:" +sum);
  }
  public static void main(String [] args){
    thiskey obj = new thiskey();
  
  obj.print();
}
}
