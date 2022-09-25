package Prueba.Service.Implement;

import org.springframework.stereotype.Service;

import Prueba.Model.ResponseDatosPersona;
import Prueba.Service.DatosPersonaService;
@Service
public class DatosPersonaServiceImplement implements DatosPersonaService {
	
	public ResponseDatosPersona obtenerDatos(String datos){ 
		ResponseDatosPersona datosPersona = new ResponseDatosPersona();
		
		if(datos.equals("curp")){
			datosPersona.setNombre("luis");
			datosPersona.setApellido("rojas");
			datosPersona.setApellidoMaterno("martinez");
			datosPersona.setApellidoPaterno("rojas");
			datosPersona.setEdad(12);
			datosPersona.setNacionalidad("mexicano");
			}
		else {
			return null;
		}
			
			
		return datosPersona;
	
		}

}
