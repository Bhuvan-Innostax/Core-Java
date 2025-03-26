class CustomException {

    static void Dummy() throws IllegalAccessException{
        System.out.println("Inside Dummy() ");
        throw new IllegalAccessException("Not allowed");
    }

    public static void main(String args[]){
        try {
            Dummy();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main " + e);
        }
        finally{
            System.out.println("Custom Exception Implemented ");
        }
    }
}
