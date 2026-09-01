class IllegalArgumentExceptionDemo{
    public static void main(String[] args){
        try{
            throw new IllegalArgumentException("Invalid Argument");
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
    }
}