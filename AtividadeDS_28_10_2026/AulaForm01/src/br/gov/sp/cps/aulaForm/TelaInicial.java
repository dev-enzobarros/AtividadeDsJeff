
package br.gov.sp.cps.aulaForm;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lblTitulo;
    private JLabel lblMensagem;
    private JButton btnAgendar;
    public TelaInicial() {
    	
        setTitle("Sistema de Consultas Médicas");
        setSize(450, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        lblTitulo = new JLabel("sistema de Consultas ");
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblMensagem = new JLabel("bem-vindo!");
        lblMensagem.setHorizontalAlignment(JLabel.CENTER);
        btnAgendar = new JButton("agendar consulta");
        
        JPanel painelTitulo = new JPanel(new BorderLayout());
        
        painelTitulo.add(lblTitulo, BorderLayout.CENTER);
        JPanel painelMensagem = new JPanel(new BorderLayout());
        
        painelMensagem.add(lblMensagem, BorderLayout.CENTER);
        JPanel painelBotao = new JPanel(new FlowLayout());
        
        painelBotao.add(btnAgendar);
        add(painelTitulo, BorderLayout.NORTH);
        add(painelMensagem, BorderLayout.CENTER);
        add(painelBotao, BorderLayout.SOUTH);

        btnAgendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaAgendamento tela = new TelaAgendamento();
                tela.setVisible(true);
                dispose();}});}

    public static void main(String[] args) {
        TelaInicial tela = new TelaInicial();
        tela.setVisible(true);}}