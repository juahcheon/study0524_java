package com.mycompony.study.ch08.second;

public class ExImplementationC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodC();
		interfaceC.methodA();
		interfaceC.methodB();
		
		
	}

}
