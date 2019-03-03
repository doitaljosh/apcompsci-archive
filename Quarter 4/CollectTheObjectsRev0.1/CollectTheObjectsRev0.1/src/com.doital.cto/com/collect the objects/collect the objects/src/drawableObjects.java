public class drawableObjects {
    public enum Tile { Start, End, Empty, Blocked };
    private Tile[] cells;
    public int width;
    public int height;

    public void maze(int width, int height) {
         this.width = width;
         this.height = height;
         this.cells = new Tile[width * height];
         java.util.Arrays.fill(this.cells, Tile.Empty);
    }

    public int height() {
        return height;
    }

    public int width() {
        return width;
    }

    public Tile get(int x, int y) {
        return cells[index(x, y)];
    }

    public void set(int x, int y, Tile tile) {
         cells[index(x, y)] = tile;
    }

    private int index(int x, int y) {
        return y * width + x;
    }
}