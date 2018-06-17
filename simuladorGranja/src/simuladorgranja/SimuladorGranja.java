
package simuladorgranja;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class SimuladorGranja {

   
    public static void main(String[] args) {
        boolean continuar = true;
        ArrayList<Perro> perros = new ArrayList();
        ArrayList<Gato> gatos = new ArrayList();
        ArrayList<Chancho> chanchos = new ArrayList();
        ArrayList<Gallo> gallos = new ArrayList();
        ArrayList<Vaca> vacas = new ArrayList();
        short contadorPerros = 1;
        short contadorGatos=1;
        short contadorVacas=1;
        short contadorChanchos=1;
        short contadorGallos=1;
        int animalRandom ;
        while (continuar) {
            int tipoAnimal =(int)(Math.random()*5);
            switch (tipoAnimal) {
                case 0:
                    perros.add(new Perro(contadorPerros));
                    contadorPerros++;
                    animalRandom = (int) (Math.random() * perros.size());
                    System.out.println("El animal " + perros.get(tipoAnimal)
                    .getNombre() + "ha hecho el sonido " + perros.get(tipoAnimal)
                    .ladrar());
                    break;
                case 1:
                    gallos.add(new Gallo(contadorGallos));
                    animalRandom=(int)(Math.random()*gallos.size());
                    System.out.println("El animal "+gallos.get(animalRandom)
                    .getNombre()+" ha hecho el sonido de "gallos
                    .get(animalRandom).cacarear());
                    contadorGallos++;
                    break;
                case 2:
                    gatos.add(new Gato(contadorGatos));
                    System.out.println("El animal ");
                    contadorGatos++;
                    break;
                case 3:
                    vacas.add(new Vaca(contadorVacas));
                    contadorVacas++;
                    break;
                case 4: 
                    chanchos.add(new Chancho(contadorChanchos));
                    contadorChanchos++;
                    break;
            }
        }
    }
    
}
