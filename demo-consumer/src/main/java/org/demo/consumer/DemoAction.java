package org.demo.consumer;

import org.demo.api.ProviderDemo;

public class DemoAction {

	private ProviderDemo demoService;
	
	

	public ProviderDemo getDemoService() {
		return demoService;
	}



	public void setDemoService(ProviderDemo demoService) {
		this.demoService = demoService;
	}



	public void start(){
		
		for(int i=0;i<Integer.MAX_VALUE;i++){
			System.out.println(demoService.doMath(i, ++i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
