/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gg;

/**
 *
 * @author ravi
 */
public class Possible_sum_of_consecutive_number {
    public static void main(String args[])
    {
        int i=18;
        possible(i);
    }

    private static void possible(int n) {
        int start=1;
        int end=1;
        int sum=1;
        while(start<=end/2)
        {
            if(sum<n)
            {
                end+=1;
                sum+=end;
                
            }
            if(sum>n)
            {
                sum-=start;
                start+=1;
            }
            if(sum==start)
            {
                for(int i=start;i<=end;i++)
                    System.out.print(i+" ");
                sum-=start;
                start-=1;
            }
        }
        
        
    }
    
}
