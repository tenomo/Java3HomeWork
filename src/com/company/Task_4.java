package com.company;

/**
 * Created by tenom on 31.03.2016.
 */
public class Task_4 {

    void  PascalsTriangle (int depth)
    {
        int tmp_Cnk;
        for (int n = 0; n < depth; n++)
        {
            tmp_Cnk = 1;
            System.out.print(tmp_Cnk);
            for (int k = 1; k <= n; k++)
            {
                tmp_Cnk = tmp_Cnk * (n - k + 1);
                tmp_Cnk /= k;
                System.out.print("  " + tmp_Cnk);
            }
             System.out.println();
        }
    }

}
