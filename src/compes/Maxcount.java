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
import java.util.Collections;
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
            for(int j=0;j<noOfElements;j++){
                results.put(elements.get(j), Collections.frequency(elements, elements.get(j)));
            }
            int number=0;
            int maxValue=-1;
            for(Integer value:results.keySet()){
                if(results.get(value)>maxValue){
                    maxValue=results.get(value);
                    number=value;
                }
                else if(results.get(value)==maxValue){
                    if(value<number)
                        number=value;
                }
            }
            testNumbers[testCases-1]=number;
            testResults[testCases-1]=maxValue;
            testCases--;
        }
        for(int k=testNumbers.length-1;k>=0;k--){
            System.out.println(testNumbers[k]+" "+testResults[k]);
        }
    }
    
}
