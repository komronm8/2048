public class Board {
    Tile[][] board;
    public Board(){
        board = new Tile[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                board[i][j] = new Tile();
            }
        }
    }

    public void print(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
