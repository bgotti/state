/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ComputerBoot {

	public static void main(String[] args) {
		ComputerContext context = new ComputerContext();
		State tvStartState = new ComputerStartState();
		State tvStopState = new ComputerStopState();
		
		context.setState(tvStartState);
		context.doAction();
            
		System.out.println("|----------------------|");
                System.out.println("|                      |");
                System.out.println("|        ----          |");  
                System.out.println("|       / || |         |");  
                System.out.println("|        *  *|         |");  
                System.out.println("|        ----/         |");  
                System.out.println("|                      |");  
                System.out.println("|----------------------|");
                System.out.println("|                      |");
                System.out.println("|----------------------|");
		context.setState(tvStopState);
		context.doAction();
		
	}

}