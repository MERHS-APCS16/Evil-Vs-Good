/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evilvsgood;

import java.util.ArrayList;
/**
 *
 * @author TuckerHase
 */
public class Game {
    private ArrayList <Scenario> s;
    private int score;
    
    public Game (ArrayList <Scenario> r){
        s = r;
        score = 0;
    }
    public ArrayList<Scenario> getS(){
        return s;
    }
    public Game (){
        s = new ArrayList<Scenario>();
        score = 0;
    }
    
    public int getScore(){
        return score;
    }
    
    public void addScore(int amount){
        score += amount;
    }
    
    public void addScenario(Scenario sce){
        s.add(sce);
    }
    
    public int getRemainingScenarios (){
        return s.size();
    }
    
    public Scenario getRandomScenario(){
        int r = (int) (Math.random()* s.size());
        Scenario sc = s.get(r);
        s.remove(r);
        return sc;
    }
    
    public boolean isGood(){
    if (score >= 0){
        return true;
    } else {
        return false;
    }
}
    
    
}
