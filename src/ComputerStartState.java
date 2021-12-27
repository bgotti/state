/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class ComputerStartState implements State {

	@Override
	public void doAction() {
		System.out.println("Computer is turned ON");
	}

}