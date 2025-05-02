import solutions.problems1.ComboMasterIMS2;
import solutions.problems1.HashMarathon;
import solutions.problems1.StackReverseWord;
import solutions.string.KakaoMBTISurvey;
import solutions.string.StringAnalysis;
import solutions.string.StringArrSplitX;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {

        try {
            //test.testMain();
            //String result = HashMarathon.marathon(new String[]{"test1", "test2"}, new String[]{"test1"});
            //System.out.println(result);
            //StackReverseWord.reverseWords();
            //ComboMasterIMS2.combo();
            //StringAnalysis.analysis();
            //StringAnalysis.cmd();
            //StringAnalysis.factorialRefactor();

            //String result = KakaoMBTISurvey.Solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5});
            //System.out.println(result);
            int[] lengths = StringArrSplitX.solution("oxooxoxxox");

        } catch(Exception e) {
            logger.log(Level.SEVERE, "An IOException occurred", e);
        }

    }

}