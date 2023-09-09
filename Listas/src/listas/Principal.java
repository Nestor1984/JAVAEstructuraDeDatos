package listas;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Lista listita=new Lista();
        int opcion=0,el;
        do {
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                   "1. Agregar un elemento al inicio de la lista\n"
                    + "2. agregar un elemento al final de la lista\n"
                    + "3. Mostrar los datos de la lista\n"
                    + "4. Borrar primer elemento de la lista\n"
                    + "5. Borrar ultimo elemento de la lista\n"
                    + "6. Borrar un elemento específico\n"
                    + "7. Salir","Menú de Opciones",3));
                switch(opcion){
                    case 1:
                        try {
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ",
                               "Insertando al inicio",3));
                            //agregando al nodo
                            listita.agregarAlInicio(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null,"Error: "+ n.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento: ",
                               "Insertando al final",3));
                            //agregando al nodo
                            listita.agregarAlFinal(el);
                        } catch (NumberFormatException n) {
                            JOptionPane.showMessageDialog(null,"Error"+ n.getMessage());
                        }
                        break;
                    case 3:
                        listita.mostrarLista();
                        break;
                    case 4:
                        el=listita.borrarDelInicio();
                        JOptionPane.showMessageDialog(null,"se borro: "+el,"Borrando primer nodo",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 5:
                        el=listita.borrarDelFinal();
                        JOptionPane.showMessageDialog(null,"se borro: "+el,"Borrando ultimo nodo",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el"
                        + " elemento a borrar","Borrando nodo especifico",JOptionPane.INFORMATION_MESSAGE));
                        listita.eliminar(el);
                        JOptionPane.showMessageDialog(null,"se borro: "+el,"Nodo borrado",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        break;
                    default:
                       JOptionPane.showMessageDialog(null,"Opción Incorrecta");
                    }
                            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error... "+e.getMessage());
            }
        } while (opcion!=7);
    }
}
