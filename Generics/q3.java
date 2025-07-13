class Mygen<T>{
    T x ;
    static  int count ;
    Mygen(){
        count++;
    }
    public static void main(String args[]){
    Mygen<Integer>s = new Mygen();
    System.out.println(Mygen.count);
    Mygen<String> k = new Mygen();
    System.out.println(Mygen.count);
}
}
