package com.bai.type.current;

import java.util.concurrent.*;


/**
 * 模拟 1+2+3+...+10000
 */

public class ForkJoinTaskTest {

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for(int i=0 ;i<10000;i++){
            arr[i] = i+1;
        }
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> result = pool.submit(new ForkJoinTaskTest().new SumTask(arr,0,arr.length));
        System.out.println("最终结果："+result.invoke());
        pool.shutdown();

    }


    class SumTask extends RecursiveTask<Integer> {

        private int arr[];
        private int start;
        private int end;

        public SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if((end - start)<=1000){
                return subTotal();
            }else {
                int mid = (start+end)/2;
                SumTask left = new SumTask(arr,start,mid);
                SumTask right = new SumTask(arr,mid,end);
                left.fork();
                right.fork();
                return left.join()+right.join();
            }
        }

        private Integer subTotal(){
            Integer sum = 0;
            for(int i=start;i<end;i++){
               sum+=arr[i];
            }
            System.out.println(Thread.currentThread().getName()+":∑("+start+"~"+end+")="+sum);
            return sum;
        }

    }
}
