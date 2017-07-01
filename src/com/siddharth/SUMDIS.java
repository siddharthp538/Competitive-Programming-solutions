
package com.siddharth;

import java.io.*;
import java.util.*;

public class SUMDIS {

    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);

        int n = in.nextInt();
      //  int m = in.nextInt();
        int k = in.nextInt();

        ArrayList<Node> g[] = new ArrayList[n];
        for (int i = 0; i < n; i++)
            g[i] = new ArrayList<Node>();
        
        
         int no=1;
        for (int i = 0; i < n-1; i++) {
            int x = in.nextInt() ;
            int y = in.nextInt() ;
            int z = in.nextInt();
            g[x].add(new Node(y, z, -1));
            g[y].add(new Node(x, z, -1));
        }

        for (int i = 0; i < k; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            int z = in.nextInt();
            g[x].add(new Node(y, z, i));
            g[y].add(new Node(x, z, i));
        }

        w.println(Dijkstra(0, g, k));
        w.close();
    }

    static public long Dijkstra(int s, ArrayList<Node> g[], int k) {
        long[][] dist = new long[g.length][1 << k];
        boolean[][] v = new boolean[g.length][1 << k];
        for (int i = 0; i < g.length; i++)
            Arrays.fill(dist[i], (long) 1e16);
        dist[s][0] = 0;
        Comparator<Node> comp = new MyComparator();
        PriorityQueue<Node> q = new PriorityQueue<Node>(2 * g.length, comp);
        q.add(new Node(s, 0, 0));

        while (!q.isEmpty()) {
            Node now = q.poll();
            if (!v[now.x][now.idx]) {
                v[now.x][now.idx] = true;
                for (int i = 0; i < g[now.x].size(); i++) {
                    int curr = g[now.x].get(i).x;
                    long w = g[now.x].get(i).dist;
                    int edge = g[now.x].get(i).idx;
                    int newIdx = now.idx;
                    if (edge >= 0)
                        newIdx |= 1 << edge;
                    if (dist[now.x][now.idx] + w < dist[curr][newIdx]) {
                        dist[curr][newIdx] = dist[now.x][now.idx] + w;
                        q.add(new Node(curr, dist[curr][newIdx], newIdx));
                    }
                }
            }
        }

        return dist[g.length - 1][(1 << k) - 1];
    }

    static class MyComparator implements Comparator<Node> {
        public int compare(Node n0, Node n1) {
            if (n0.dist > n1.dist)
                return 1;
            else if (n0.dist < n1.dist)
                return -1;

            return 0;
        }
    }

    static public class Node {
        int x, idx;
        long dist;

        public Node(int i, long j, int idx) {
            x = i;
            dist = j;
            this.idx = idx;
        }
    }

    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public String readString() {
            int c = snext();
            while (isSpaceChar(c)) {
                c = snext();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}