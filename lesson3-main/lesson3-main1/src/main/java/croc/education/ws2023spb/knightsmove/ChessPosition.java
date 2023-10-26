package croc.education.ws2023spb.knightsmove;

public class ChessPosition implements ChessPosition1 {
    public int x1,y1;
    public ChessPosition(int x1, int y1) throws IllegalPositionException {
        if(x1<0 || x1>7|| y1<0 || y1>7){
            throw new IllegalPositionException("Неверный ввод");
        }
        this.x1=x1;
        this.y1=y1;
    }
    @Override
    public int x() {
        return x1;
    }

    @Override
    public int y() {
        return y1;
    }

    public String toString(){
        String s=String.valueOf((char)(x1+'a')) +String.valueOf(y1+1);
        return s;
    }
}
