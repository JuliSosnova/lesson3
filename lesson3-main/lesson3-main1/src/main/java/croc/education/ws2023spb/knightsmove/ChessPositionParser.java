package croc.education.ws2023spb.knightsmove;

/**
 * Класс, содержащий методы преобразования в объект расположения фигуры на шахматной доске из различных форматов.
 * 
 * @author Dmitry Malenok
 * @see ChessPosition1
 */
public final class ChessPositionParser {

    /**
     * Конструктор.
     */
    private ChessPositionParser() {
        // Конструктор задан только для того, чтобы экземпляр класса случайно не создали.
    }
    public static ChessPosition create(final String position) throws IllegalPositionException {
        if(position.charAt(0)>='a'&& position.charAt(0)<='h' && position.charAt(1)>='1'&& position.charAt(1)<='8'){
            int y=Character.digit(position.charAt(1),10)-1;
            int x2=position.charAt(0)-'a';
            if(position.charAt(0)=='a'){
                x2=0;
            }
            ChessPosition n=new ChessPosition(x2,y);
            return n;
        }
        else{
            throw new IllegalPositionException("Неверное значение");
        }
    }
    public static ChessPosition parse(final String position) throws IllegalPositionException {

      try{
           ChessPosition n1= create(position);
           return n1;
       }
       catch (IllegalPositionException e){
           System.out.println("exeption");

       }
        return null;
         /* if(position.charAt(0)>='a'&& position.charAt(0)<='h' && position.charAt(1)>='1'&& position.charAt(1)<='8'){
            int y=Character.digit(position.charAt(1),10)-1;

            int x2=position.charAt(0)-'a';
            if(position.charAt(0)=='a'){
                x2=0;
            }
            System.out.println(x2+"and"+y);
            ChessPosition n=new ChessPosition(x2,y);
            return n;

        }
        else{
            throw new IllegalPositionException();
        }*/
    }




}
