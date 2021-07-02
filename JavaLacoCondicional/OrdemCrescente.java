/*
* Faça um programa que entre com três números e coloque em ordem crescente*/

package LacoCondicional;

import javax.swing.JOptionPane;

/**
 *
 * @author daian
 */
public class OrdemCrescente {

    public double a;
    public double b;
    public double c;


    public void entrada () {

        a = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite  o primeiro valor: "," 1º valor", JOptionPane.QUESTION_MESSAGE));
        b = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o segundo valor:  ", " 2º valor", JOptionPane.QUESTION_MESSAGE));
        c = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite o terceiro valor: ","3º valor", JOptionPane.QUESTION_MESSAGE));

    }

    public void imprimir (){
        String msg;
        if ( a > b )
            if  (b > c) {
                msg = "A ordem crescente dos valores é \n" + c + "\n" + b + "\n" + a;
                JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                if (a > c){
                    msg = "A ordem crescente dos valores é \n" + b + "\n" + c + "\n" + a;
                    JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                    msg = "A ordem crescente dos valores é \n" + b + "\n" + a + "\n" + c;
                    JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }

        else {
            if(b > c) {
                if(a > c) {
                    msg = "A ordem crescente dos valores é \n" + c + "\n" + a + "\n" + b;
                    JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                else{
                    msg = "A ordem crescente dos valores é \n" + a + "\n" + c + "\n" + b;
                    JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                msg = "A ordem crescente dos valores é \n" + a + "\n" + b + "\n" + c;
                JOptionPane.showMessageDialog(null, msg, "Ordem Crescente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }

    public static void main(String[] args) {

        OrdemCrescente obj = new OrdemCrescente();
        obj.entrada();
        obj.imprimir();

    }
}
