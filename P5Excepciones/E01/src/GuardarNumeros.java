public class GuardarNumeros {
    public static int comprobarNegativo(int num) throws NegativeNumberException{
        if (num<0)//Compruebo si el numero es negativo
            throw new NegativeNumberException("No puedes poner un numero negativo"); //si es negativo, lanzo la excepcion con el mensaje
        return num; //Tambien devuelvo el numero para poder usarlo en el main
    }
}
