package Java0601;

//我用DFS爆栈了，下面是BFS
/**
 * 红与黑：https://www.nowcoder.com/questionTerminal/5017fd2fc5c84f78bbaed4777996213a
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
    static boolean[][] visited;
    static int count;
    static int[][] direction = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int x = in.nextInt();
            int y = in.nextInt();
            int a = -1, b = -1;
            char[][] ch = new char[x][y];
            count=1;
            visited = new boolean[x][y];
            for (int i = 0; i < x; i++) {
                String str = in.next();
                for (int j = 0; j < y; j++) {
                    ch[i][j] = str.charAt(j);
                    if (ch[i][j] == '@') {
                        a = i;
                        b = j;
                    }
                }
            }
            BFS(a, b, ch);
            System.out.println(count);
        }
    }
    public static void BFS(int x, int y, char[][] ch) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(new Node(x, y));
        visited[x][y] = true;
        while (!queue.isEmpty()) {
            Node cur = queue.poll();// 拿出队头
            for (int i = 0; i < 4; i++) {
                Node next = new Node(cur.x + direction[i][0], cur.y + direction[i][1]);
                if (next.x >= 0 && next.x < ch.length && next.y >= 0 && next.y < ch[0].length
                        && ch[next.x][next.y] != '#' && !visited[next.x][next.y]) {
                    count++;
                    queue.add(next);
                    visited[next.x][next.y] = true;
                }
            }
        }
    }
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

