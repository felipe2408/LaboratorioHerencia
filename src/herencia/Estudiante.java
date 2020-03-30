
package herencia;

import javax.swing.JOptionPane;


public class Estudiante extends Persona
{
    //Atributos de la clase
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    //Constructor de la clase
    public Estudiante()
    {

    }
    
    public Estudiante(String nombre,String apellido, int edad , double peso, String carnet,double promedioNotas,int numeroMaterias)
    {
        //Usamos el operador super para establecer el constructor de la superclase
        super(nombre,apellido,edad,peso);
        //Definimos los atributos propios de este objeto que hereda
        this.carnet= carnet;
        this.promedioNotas=promedioNotas;
        this.numeroMaterias=numeroMaterias;
    }
    
    //Metodo de encapsulamiento

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    //Metodos propios del estudiante
    //Método para calcular el promedio del estudiante
    public double calcularPromedio(int numeroMaterias)
    {
        double acum=0;
        double notas;
        for (int i = 0; i < numeroMaterias; i++)
        {
            notas=Double.parseDouble(JOptionPane.showInputDialog("Digite las notas"));
          acum+=notas;
        }
        promedioNotas=acum/numeroMaterias;
        return(promedioNotas);
    }
    
    public void imprimirPromedio (String nombre, double promedioNotas)
    {
        JOptionPane.showMessageDialog(null, "El estudiante " + nombre +"Su promedio es de: " + promedioNotas);
    }
     //Método para ingresar los datos del estudiante
    public Estudiante ingresarDatosEstudiante()
    {
        Estudiante estudiante=new Estudiante();
        String nombre;
        String apellido;
        int edad;
        double peso;
        String carnet;
        double notas;
        double promedioNotas;
        int numeroMaterias;
        carnet=leerDatoTipoCadena("Ingrese el  numer de carnet del estudiante: ");
        nombre=leerDatoTipoCadena("Ingrese el nombre del estudiante: ");
        apellido=leerDatoTipoCadena("Ingrese el apellido del estudiante: ");
        edad = leerDatoTipoEntero("Ingrese la edad del estudiante: ");
        peso = leerDatoTipoReal("Ingrese el peso del estudiante: ");
     
        
         //Obtenemos los datos que no hacen parte de la clase
         numeroMaterias=leerDatoTipoEntero("Ingrese el numero de materias del estudiante: ");
       
          
         
         
         promedioNotas=calcularPromedio(numeroMaterias);
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setCarnet(carnet);
        estudiante.setEdad(edad);
        estudiante.setPeso(peso);
        estudiante.setNumeroMaterias(numeroMaterias);
        estudiante.setPromedioNotas(promedioNotas);
       
        return (estudiante); 
    }
     public void imprimirReporteEstadoEstudiante()
    {
        imprimirDatosPersona();
        
        JOptionPane.showMessageDialog(null, "El carnet del estudiante es:" + carnet);
        JOptionPane.showMessageDialog(null,"El numero de materias es: " + numeroMaterias);
        JOptionPane.showMessageDialog(null, "El promedio del estudiante es: " + promedioNotas);
    }
   
    public void definirEstadoEstudiante(int edad)
    {
        String estado;
        if (edad < 21)
        {
            estado = "Menor de edad legal";
        }
        else
        {
            estado = "Mayor de edad legal";
        }
        JOptionPane.showMessageDialog(null, "La persona: " + " " + nombre + " " + apellido + " " +  " es:  " + " " + estado);
    }
 
}
