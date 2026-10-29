
package br.gov.sp.cps.aulaForm;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import br.gov.sp.cps.controllers.ConsultaController;

public class TelaAgendamento extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lblTitulo;
    private JLabel lblNome;
    private JLabel lblEspecialidade;
    private JTextField txtNome;
    private JTextField txtEspecialidade;
    private JButton btnConfirmar;
    private JButton btnLimpar;
    private JButton btnVoltar;

    public TelaAgendamento() {
        setTitle("Agendamento de Consultas");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        lblTitulo = new JLabel("agendamento de Consultas");
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblNome = new JLabel("nome:");
        lblEspecialidade = new JLabel("especialidade:");
        txtNome = new JTextField();
        txtEspecialidade = new JTextField();
        
        JPanel painelCampos = new JPanel(new GridLayout(2, 2, 10, 15));
        
        painelCampos.add(lblNome);
        painelCampos.add(txtNome);
        painelCampos.add(lblEspecialidade);
        painelCampos.add(txtEspecialidade);
        
        btnConfirmar = new JButton("confirmar agendamento");
        btnLimpar = new JButton("limpar");
        btnVoltar = new JButton("voltar");
        
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnConfirmar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnVoltar);
        
        JPanel painelCentral = new JPanel(new BorderLayout(10, 10));
        painelCentral.add(painelCampos, BorderLayout.CENTER);
        add(lblTitulo, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.CENTER);
        add(painelBotoes, BorderLayout.SOUTH);

        ConsultaController controller = new ConsultaController(
                txtNome,
                txtEspecialidade,
                this);
        
        btnConfirmar.addActionListener(controller.acaoConfirmar());
        btnLimpar.addActionListener(controller.acaoLimpar());
        btnVoltar.addActionListener(controller.acaoVoltar());}}
