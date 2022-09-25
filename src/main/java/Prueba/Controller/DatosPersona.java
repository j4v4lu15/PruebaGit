package Prueba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Prueba.Model.RequestDatoPersona;
import Prueba.Model.ResponseContenedor;
import Prueba.Model.ResponseDatosPersona;
import Prueba.Service.DatosPersonaService;

@RestController
@RequestMapping("/Persona")
public class DatosPersona {
	
	@Autowired
	private	DatosPersonaService datosPersonaService;
	
	@PostMapping("/mostrar")
	
	public ResponseContenedor datosPersona(@RequestBody RequestDatoPersona request){
		ResponseContenedor datoFinal= new ResponseContenedor ();
		ResponseDatosPersona datopersona= new ResponseDatosPersona();
		
		datopersona = datosPersonaService.obtenerDatos(request.getCurp());
		
		if(datopersona != null) {
			datoFinal.setCodigo(200);
			datoFinal.setDescripcion("Consulta Exitosa");
			datoFinal.setData(datopersona);
			
		}else {
			datoFinal.setCodigo(500);
			datoFinal.setData(null);
			datoFinal.setDescripcion("No hay datos");
				}
		
		return datoFinal;
	}

}

