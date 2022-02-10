package Anno.com.annotationconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class samsung {
	@Autowired
	redmi us;
	
	@Autowired
	MobileProcessor cpu;
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}


	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println("octa core 4gb rom");
		cpu.process();
		us.brand();
	}

}
