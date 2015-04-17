package presentacion;

import juego.Ciudad;
import juego.Interseccion;
import juego.Calle;

public class GUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciudad miCiudad = new Ciudad("Tijuana");

		
		Interseccion i1 = new Interseccion("x", 100, 100);
		Interseccion i2 = new Interseccion("y", 300, 300);
		
		Calle r1 = new Calle("r1",i1,i2);
		
		i1.getCalles().add(r1);
		i2.getCalles().add(r1);
		
		miCiudad.getMapaDeCiudad().getIntersecciones().add(i1);
		miCiudad.getMapaDeCiudad().getIntersecciones().add(i2);
		
		miCiudad.getMapaDeCiudad().getcalles().add(r1);
		
		
		
		System.out.println(miCiudad);
	}

}
