package behavior;

import person.PersonBase;

/**
 * Класс для позиционирования персонажей
 */
public class CoordXY {
    private int curX;
    private int curY;

    private static int width;
    private static int height;

    static {
        width = 10;
        height = 10;
    }

    public CoordXY(int x, int y)
    {
        curX = x;
        curY = y;
    }

    /*
        Геттеры и сеттеры
     */
    public void setX(int curX) {
        this.curX = curX;
    }

    public void setY(int curY) {
        this.curY = curY;
    }

    public void setXY(int x, int y)
    {
        curX = x;
        curY = y;
    }

    public int getX() {
        return curX;
    }

    public int getY() {
        return curY;
    }

    public static void setWidth(int width) {
        CoordXY.width = width;
    }

    public static void setHeight(int height) {
        CoordXY.height = height;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    /**
     * Проверка на возможность хода на заданную позицию
     *
     * @param x Предполагаемая позиция по оси X
     * @param y Предполагаемая позиция по оси Y
     * @return  true - если ход возможен
     */
    public boolean isMove(int x, int y)
    {
        return x >= 0 && x < width && y >= 0 && y < height;
    }

    /**
     * Ходим в заданном направлении
     * @param dx Направление по оси X (-1, +1)
     * @param dy Направление по оси Y (-1, +1)
     */
    public void moveTo(int dx, int dy)
    {
        if (isMove(curX+dx, curY+dy))
        {
            curX += dx;
            curY += dy;
        }
    }

    /**
     * Вычисляет расстояние расстояние до другой точки
     *
     * @param target До куда считаем
     * @return       Расстояние
     */
    public float distanceTo(CoordXY target)
    {
        float x = curX - target.getX();
        float y = curY - target.getY();
        return (float) Math.sqrt(x*x + y*y);
    }


    public String toString()
    {
        return curX + ":" + curY;
    }
    public CoordXY getDelta(CoordXY target){
        return new CoordXY
                (target.getX() - getX(), target.getY() - getY());
    }

    public  boolean check(CoordXY pt){

        return curX == pt.curX && curY == pt.curY;
    }

    public void add(int dx, int dy) {
        curX += dx;
        curY += dy;
    }
}