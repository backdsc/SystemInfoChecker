package resolucaodetela;

import java.awt.*;
import java.awt.Toolkit;

public class ResolucaoDeTela {
    public static void main(String[] args) {
         Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("A resolução da tela é: ");
        System.out.println(size.toString());



    }
}
