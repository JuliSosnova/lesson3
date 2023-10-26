package croc.education.ws2023spb.knightsmove;

import croc.education.ws2023spb.knightsmove.IllegalMoveException;
import croc.education.ws2023spb.knightsmove.IllegalPositionException;
import croc.education.ws2023spb.knightsmove.KnightsMoveChecker;

public class KnMoveCh  implements KnightsMoveChecker {
    public void check(String[] positions) throws IllegalMoveException {



        for (int i = 1; i < positions.length-1; i++) {
           String begin = positions[i];
            String end=positions[i+1];
            int[][] s={{-1,2},{1,2},{-1,-2},{1,-2},{-2,1},{2,1},{-2,-1},{2,-1}};
            boolean ok=false;
            int byn = Character.digit(positions[i].charAt(1), 10) - 1;
            int bxn = positions[i].charAt(0) - 'a';
            int byn2 = Character.digit(positions[i+1].charAt(1), 10) - 1;
            int bxn2 = positions[i+1].charAt(0) - 'a';
            for(int[] st:s){
                if((bxn-bxn2)==st[0]  && (byn-byn2)==st[1] || (bxn-bxn2)==st[1]  && (byn-byn2)==st[0]){
                    ok=true;break;
                }

            }
            if(!ok){
               throw new IllegalMoveException(" "+begin+" -> "+end);

            }
        }
    }
}
