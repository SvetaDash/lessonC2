public class Main {

    private static Object String;

    public static void main (String[] args) {
        try {
                     stringText();
        } catch (MyArraySizeException e){
            System.out.println("Размер массива неверный!");
           }catch (MyExten e){
            System.out.println("Ошибка в ячуйке "+e.i+"*"+e.j);
        }
        /* String[][] arr =  {
                  {"hff", "bj", "hjd", "jf"},
                  {"ghj", "shs", "hjw", "gdgs"},
                  {"bd", "gdg", "gwg", "dfqt"},
          };*/
    }
    
    public static int stringText()  throws MyArraySizeException, MyExten {
        int count = 0;
        String[][] arr = {
                {"hff", "bj", "hjd", "jf"},
                {"ghj", "shs", "hjw", "gdgs"},
                {"bd", "gdg", "gwg", "dfqt"},
                {"ghr", "dgs", "kjgf", "fet"}
        };
        if (arr.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyExten(i, j);
                }

            }
        }
        return count;
    }


    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message){
            super(message);
        }

        public MyArraySizeException() {

        }
    }

    public static class MyExten extends Exception{
        public int i;
        public int j;

        public MyExten(int i, int j) {
            this.i = i;
            this.j = j;
        }


        }
}
