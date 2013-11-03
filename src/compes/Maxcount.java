//the site is
//www.codechef.com/problems/MAXCOUNT
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author vinnu
 */
public class Maxcount {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testCases=Integer.parseInt(br.readLine());
        int testNumbers[]=new int[testCases];
        int testResults[]=new int[testCases];
        while(testCases>0){
            int noOfElements=Integer.parseInt(br.readLine());
            ArrayList<Integer> elements=new ArrayList<Integer>();
            Map<Integer,Integer> results=new HashMap<Integer,Integer>();
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=0;i<noOfElements;i++){
                elements.add(Integer.parseInt(st.nextToken()));
            }
        }
    }
    
}
