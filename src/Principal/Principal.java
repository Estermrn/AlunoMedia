package Principal;

import model.Aluno;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        
        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
        aluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno: ")));
        aluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno: ")));
        aluno.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno: ")));
         
        JOptionPane.showMessageDialog(null, String.format ("A média do(a) aluno(a) " + aluno.getNome() + " é: %.2f", aluno.getMedia()));
        
    }
}
