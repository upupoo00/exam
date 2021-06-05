package Java0605;

/**
 * 走迷宫：https://www.nowcoder.com/questionTerminal/6276dbbda7094978b0e9ebb183ba37b9
 */

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {

            boolean[][] map = new boolean[10][10];
            int[][] steps = new int[10][10];

            for (int i = 0; i < 10; i++) {
                char[] lineChars = s.next().toCharArray();
                for (int j = 0; j < lineChars.length; j++) {
                    if (lineChars[j] == '#') {
                        map[i][j] = true;
                    }
                }
            }
            Queue<Point> queue = new LinkedList<>();
            queue.add(new Point(1, 0));

            int step = -1;
            while (!queue.isEmpty()) {

                Point cur = queue.poll();
                if (cur.x == 8 && cur.y == 9) {
                    step = steps[9][8];
                    break;
                }

                for (Point next : new Point[]{
                        new Point(cur.x + 1, cur.y),
                        new Point(cur.x - 1, cur.y),
                        new Point(cur.x, cur.y + 1),
                        new Point(cur.x, cur.y - 1)}) {

                    if (next.x >= 0 && next.x < 10 && next.y >= 0 && next.y < 10
                            && !map[next.y][next.x]) {
                        queue.add(next);
                        steps[next.y][next.x] = steps[cur.y][cur.x] + 1;
                        map[next.y][next.x] = true;
                    }
                }
            }

            System.out.println(step);
        }
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

