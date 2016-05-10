
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author konrad
 */
public class Scenario {

    private String scen, option1, option2;
    private String scen1Opt1, scen1Opt2, scen2Opt1, scen2Opt2, scen3Opt1, scen3Opt2;
    private String str, str1, str2;
    private boolean oneISGood;

    public Scenario(String scenario, String opt1, String opt2, boolean oneIsG) {
        scen = scenario;
        option1 = opt1;
        option2 = opt2;
        oneISGood  = oneIsG;
    }

    public Scenario() {
     
       
    }

    public String getScenario() {
        return scen;
    }

    public String getOptionOne() {
        return option1;
    }

    public String getOptionTwo() {
        return option2;
    }
    public boolean oneIsGood(){
        return oneISGood;
    }

}
