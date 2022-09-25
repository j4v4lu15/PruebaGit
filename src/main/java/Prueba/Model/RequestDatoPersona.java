package Prueba.Model;

import lombok.Data;

@Data
public class RequestDatoPersona {
  private String curp;

public String getCurp() {
	return curp;
}

public void setCurp(String curp) {
	this.curp = curp;
}
	
}
