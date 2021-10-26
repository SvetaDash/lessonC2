public class Main {

    public static void main (String[] args) {
        try {
                     stringText();
        } catch (MyArraySizeException e){
            System.out.println("Размер массива неверный!");
           }catch (MyExten e){
            System.out.println("Ошибка в ячeйке "+e.i+"*"+e.j+"\n");
        }

    }
    
    public static int stringText()  throws MyArraySizeException, MyExten {
        int count = 0;
        String[][] arr = {
                {"3", "1", "5", "2"},
                {"4", "9", "3", "7"},
                {"2", "6", "1", "0"},
                {"6", "4", "3", "7"}
        };
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                Integer.parseInt(arr[i][j]);
            }
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                    try {
                        count = count + Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyExten(i, j);
                    }

                }
            }  System.out.println("Сумма всех чисел = " + count);

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
