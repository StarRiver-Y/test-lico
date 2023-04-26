package com.example.test.lico;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 *
 * 你可以按 任何顺序 返回答案。
 * 输入：n = 4, k = 2
 * 输出：
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 */
public class Test77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> temp = new ArrayDeque<>();

        def(1,n,k,temp,res);
        return res;
    }

    private void def(int index, int n, int k, Deque<Integer> temp,List<List<Integer>> res) {
        if (temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index;i<=n - (k- temp.size())+1;i++){
            temp.addLast(i);
            def(i+1,n,k,temp,res);
            temp.removeLast();
        }
    }

    public static void main(String[] args) {
        Test77 test77 = new Test77();
        List<List<Integer>> combine = test77.combine(4, 2);
        System.out.println(combine);
    }
}
