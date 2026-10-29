
package br.gov.sp.cps.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import br.gov.sp.cps.aulaForm.TelaInicial;

public class ConsultaController {
    private JTextField txtNome;
    private JTextField txtEspecialidade;
    private JFrame tela;
    public ConsultaController(JTextField txtNome,JTextField txtEspecialidade, JFrame tela) {
        this.txtNome = txtNome;
        this.txtEspecialidade = txtEspecialidade;
        this.tela = tela;}

    public ActionListener acaoConfirmar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText().trim();
                String especialidade =
                        txtEspecialidade.getText().trim();
                if (nome.isEmpty() || especialidade.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            tela,
                            "preencha o nome do paciente e a especialidade.");
                    return;}
                
               
                JOptionPane.showMessageDialog(
                        tela,
                        "agendamento confirmado!\n\n"
                        + "paciente: " + nome
                        + "\nespecialidade: " + especialidade,
                        "consulta agendada",
                        JOptionPane.INFORMATION_MESSAGE);}};}

    public ActionListener acaoLimpar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtEspecialidade.setText("");
                txtNome.requestFocusInWindow();}};}

    
    public ActionListener acaoVoltar() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaInicial telaInicial = new TelaInicial();
                telaInicial.setVisible(true);
                tela.dispose();}};}}
