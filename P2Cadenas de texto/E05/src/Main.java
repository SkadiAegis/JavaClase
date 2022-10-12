import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña");
        String contrasena = sc.next();
        boolean caracteres=false;
        boolean mayuscula=false;
        boolean minuscula=false;
        boolean simbolo=false;
        boolean digito=false;


        if(contrasena.length()>=8){
            caracteres=true;
        }
        for(int i=0;i<contrasena.length();i++){
            if(Character.isUpperCase(contrasena.charAt(i))){
                mayuscula=true;
            }
            if(Character.isLowerCase(contrasena.charAt(i))){
                minuscula=true;
            }
            if(Character.isDigit(contrasena.charAt(i))){
                digito=true;
            }
            if(contrasena.charAt(i)=='!'||contrasena.charAt(i)=='@'||contrasena.charAt(i)=='#'||contrasena.charAt(i)=='$'||contrasena.charAt(i)=='%'||contrasena.charAt(i)=='^'||contrasena.charAt(i)=='&'||contrasena.charAt(i)=='*'||contrasena.charAt(i)=='('||contrasena.charAt(i)==')'||contrasena.charAt(i)=='-'||contrasena.charAt(i)=='+'||contrasena.charAt(i)=='='||contrasena.charAt(i)=='_'||contrasena.charAt(i)=='{'||contrasena.charAt(i)=='}'||contrasena.charAt(i)=='['||contrasena.charAt(i)==']'||contrasena.charAt(i)=='|'||contrasena.charAt(i)==':'||contrasena.charAt(i)==';'||contrasena.charAt(i)=='<'||contrasena.charAt(i)=='>'||contrasena.charAt(i)=='?'||contrasena.charAt(i)=='/'||contrasena.charAt(i)=='.'||contrasena.charAt(i)==','||contrasena.charAt(i)=='~'||contrasena.charAt(i)=='`'||contrasena.charAt(i)==' '){
                simbolo=true;
            }
        }
        if(caracteres && mayuscula && minuscula && simbolo && digito){
            System.out.println("Contraseña segura");
        }else{
            System.out.println("Contraseña insegura");
        }




    }

}