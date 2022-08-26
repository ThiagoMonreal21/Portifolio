package reservas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Menu extends JFrame {
	
	private Aviao[] aeronaves = new Aviao[10];
	private int aeronaveCont = 0;
	
	private Voo[] voos = new Voo[10];
	private int voosCont = 0;
	
	//layout do menu
	JMenuBar barra = new JMenuBar();
	JMenu parametros = new JMenu("Parâmetros do Sistema");
	JMenu reserva = new JMenu("Reserva de passagens");
	JMenu fim = new JMenu("Sair");
	
	//sub menus
	
	JMenuItem parametros1 = new JMenuItem("Cadastrar Aeronave"); //Ok
	JMenuItem parametros2 = new JMenuItem("Cadastrar Voo"); //OK
	JMenuItem parametros3 = new JMenuItem("Voltar");//Ok

	JMenuItem reservas1 = new JMenuItem("Fazer reservas"); //OK
	JMenuItem reservas2 = new JMenuItem("Assentos vazios");//Ok
	JMenuItem reservas3 = new JMenuItem("Assentos reservados");//OK
	JMenuItem reservas4 = new JMenuItem("Voltar");//ok
	JMenuItem fim1 = new JMenuItem("Fechar");
	
	Menu menu = this;
	
	JPanel panelAeronave = new JPanel();
	JPanel panelVoo = new JPanel();
	JPanel panelReserva = new JPanel();
	JPanel consultaLugares = new JPanel();
	JPanel consultaReservas = new JPanel();
	
	private void hideAllPanels() {
		panelAeronave.setVisible(false);
		panelVoo.setVisible(false);
		panelReserva.setVisible(false);
		consultaLugares.setVisible(false);
		consultaReservas.setVisible(false);
	}
	
	public Menu() {
		setJMenuBar(barra);
		barra.add(parametros);
		barra.add(reserva);
		barra.add(fim);
		
		//parametros do sistema
	
		parametros.add(parametros1); // cadastra aeronave
		parametros1.addActionListener(new ActionListener () {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				
				panelAeronave = new JPanel();
				
				//insere modelo
				
				JLabel labelModelo = new JLabel();
				labelModelo.setText("Modelo da Aeronave: ");
				
				JTextField textFieldModelo = new JTextField("", 10);
				
				//fileiras
				
				JLabel labelFileiras = new JLabel();
				labelFileiras.setText("Fileiras da aeronave: ");
				
				JTextField textFieldFileiras = new JTextField("", 10);
				
				//assentos
				
				JLabel labelAssentos = new JLabel();
				labelAssentos.setText("Assentos por fileira da aeronave: ");
				
				JTextField textFieldAssentos = new JTextField("", 10);
				
				JButton button = new JButton();
				button.setText("Cadastrar");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						try {
							if(menu.aeronaveCont < menu.aeronaves.length){
								int fileiras = Integer.parseInt(textFieldFileiras.getText());
								int assentos = Integer.parseInt(textFieldAssentos.getText());
								Aviao aeronave = new Aviao(textFieldModelo.getText(), fileiras, assentos);
								menu.aeronaves[menu.aeronaveCont] = aeronave;
								menu.aeronaveCont++;
								JOptionPane.showMessageDialog(null, "Aeronave cadastrada com sucesso!");
								textFieldModelo.setText("");
								textFieldFileiras.setText("");
								textFieldAssentos.setText("");
							}else {
								JOptionPane.showMessageDialog(null, "Limites de aeronaves excedidas!");
							}
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor Inválido");
						}
					}
				});
				
				//apresenta o painel
				menu.add(panelAeronave); //add o JPanel no JFrame
				panelAeronave.add(labelModelo);
				panelAeronave.add(textFieldModelo);
				panelAeronave.add(labelFileiras);
				panelAeronave.add(textFieldFileiras);
				panelAeronave.add(labelAssentos);
				panelAeronave.add(textFieldAssentos);
				panelAeronave.add(button);
				
				setVisible(true);
			}
		});
		
		//cadastro dos voos
		
		parametros.add(parametros2);
		parametros2.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				
				panelVoo = new JPanel();
				
				JLabel labelnroVoo = new JLabel();
				labelnroVoo.setText("Informe o número do voo: ");
				
				JTextField textFieldnroVoo = new JTextField("", 15);
				
				JLabel labelData = new JLabel ();
				labelData.setText("Informe a data do Voo: ");
				
				MaskFormatter apresentaData = null;
				try {
					apresentaData = new MaskFormatter("##/##/####");
					apresentaData.setPlaceholderCharacter('_');
					}
				catch(ParseException e) {
					System.err.println("A data informada é invalida: " + e.getMessage());
					System.exit(-1);
					}
				 
				JFormattedTextField jFormattedTextData = new JFormattedTextField(apresentaData);
				
				JLabel labelHora = new JLabel();
				labelHora.setText("Informe o horario do voo");
				
				MaskFormatter apresentaHora = null;
				try {
					apresentaHora = new MaskFormatter("##:##");
					apresentaHora.setPlaceholderCharacter('_');
				}catch(ParseException e) {
					System.err.println("O horario informado é invalido: " + e.getMessage());
					System.exit(-1);
					}
				
				JFormattedTextField jFormattedTextHora = new JFormattedTextField(apresentaHora);
				
				JLabel labelSelAviao = new JLabel();
				labelSelAviao.setText("Escolha o avião");
				
				JComboBox<Aviao> comboSelAviao = new JComboBox<Aviao>(aeronaves);
				
				JButton button = new JButton();
				button.setText("Cadastrar");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						try {
							if(menu.voosCont < menu.voos.length) {
								int num = Integer.parseInt(textFieldnroVoo.getText());
								Voo voo = new Voo ((Aviao) comboSelAviao.getSelectedItem(), num, jFormattedTextData.getText(), jFormattedTextHora.getText());
								
								menu.voos[menu.voosCont] = voo;
								menu.voosCont++;
								JOptionPane.showMessageDialog(null, "Voo cadastrado com sucesso!");
								textFieldnroVoo.setText("");
								jFormattedTextData.setText("");
								jFormattedTextHora.setText("");
							}else {
								JOptionPane.showMessageDialog(null, "Limite de voos cadastro excedido!");
							}
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor Invalido!");
						}
					}
				});
				
				menu.add(panelVoo);
				panelVoo.add(labelnroVoo);
				panelVoo.add(textFieldnroVoo);
				
				panelVoo.add(labelData);
				panelVoo.add(jFormattedTextData);
				
				panelVoo.add(labelHora);
				panelVoo.add(jFormattedTextHora);
				
				panelVoo.add(labelSelAviao);
				panelVoo.add(comboSelAviao);
				
				panelVoo.add(button);
				
				setVisible(true);
			}
		});
		
		//Sair
		parametros.add(parametros3);
		parametros3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				setVisible(true);
			}
		});
		
		//reservar as passagens
		
		reserva.add(reservas1);
		reservas1.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				
				panelReserva = new JPanel();
				
				JLabel labelEscolhaAviao = new JLabel();
				labelEscolhaAviao.setText("Escolha o avião");
				
				JComboBox<Aviao> comboEscolhaAviao = new JComboBox<Aviao>(aeronaves);
				
				JLabel labelEscolhaFileira = new JLabel();
				labelEscolhaFileira.setText("Escolha a fileira");
				
				JTextField textFieldEscolhaFileira = new JTextField("", 10);
				
				JLabel labelEscolhaAssento = new JLabel();
				labelEscolhaAssento.setText("Escolha o assento");
				
				JTextField textFieldEscolhaAssento = new JTextField("", 10);
				
				JLabel labelNomePassageiro = new JLabel();
				labelNomePassageiro.setText("Digite o nome do Passageiro: ");
				
				JTextField textFieldNomePassageiro = new JTextField("", 10);
				
				JLabel labelCpfPassageiro = new JLabel();
				labelCpfPassageiro.setText("Digite o Cpf do Passageiro");
				
				JTextField textFieldCpfPassageiro = new JTextField("", 11);
				
				JButton button = new JButton();
				button.setText("Reservar");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						try {
							int fileira = Integer.parseInt(textFieldEscolhaFileira.getText());
							int assento = Integer.parseInt(textFieldEscolhaAssento.getText());
							
							Aviao aviao = (Aviao) comboEscolhaAviao.getSelectedItem();
							Passageiro passageiro = new Passageiro(textFieldNomePassageiro.getText(), textFieldCpfPassageiro.getText());
							aviao.setPassageiro(fileira, assento, passageiro);
							JOptionPane.showMessageDialog(null, "Reserva efetuada com sucesso!");
							textFieldCpfPassageiro.setText("");
							textFieldNomePassageiro.setText("");
							textFieldEscolhaAssento.setText("");
							textFieldEscolhaFileira.setText("");
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor Invalido");
						}
					}
				});
				
				menu.add(panelReserva);
				panelReserva.add(labelEscolhaAviao);
				panelReserva.add(comboEscolhaAviao);
				panelReserva.add(labelEscolhaFileira);
				panelReserva.add(textFieldEscolhaFileira);
				panelReserva.add(labelEscolhaAssento);
				panelReserva.add(textFieldEscolhaAssento);
				panelReserva.add(labelNomePassageiro);
				panelReserva.add(textFieldNomePassageiro);
				panelReserva.add(labelCpfPassageiro);
				panelReserva.add(textFieldCpfPassageiro);
				panelReserva.add(button);
				setVisible(true);
			}
		});
		
		//assentos vazios
		reserva.add(reservas2);
		reservas2.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				
				panelReserva = new JPanel();
				
				JLabel labelSelecioneAviao = new JLabel();
				labelSelecioneAviao.setText("Escolha o avião");
				
				JComboBox<Aviao> comboSelAviao = new JComboBox<Aviao>(aeronaves);
				
				JButton button = new JButton();
				button.setText("Buscar");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt){
						try {
							Aviao aviao = (Aviao) comboSelAviao.getSelectedItem();
							String message = "Os assentos vazios são: \n";
							for(int x = 0; x < aviao.lugares.length; x++) {
								message += "Fileira " + (x + 1) + "\n";
								for(int y = 0; y < aviao.lugares[x].length; y++) {
									if(aviao.verificaLugarOcupado(x, y) == false) {
										message += "[ 0 ] ";
									}else
										message += "[ X ]";
								}
								message += "\n";
							}
							JOptionPane.showMessageDialog(null, message);
						} catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor Inválido");
							}	
					}
				});
					menu.add(panelReserva);
					panelReserva.add(labelSelecioneAviao);
					panelReserva.add(comboSelAviao);
					panelReserva.add(button);
					setVisible(true);
				}
			
			});
		
		//assentos ocupados
		reserva.add(reservas3);
		reservas3.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				
			panelReserva = new JPanel();
			
			JLabel labelSelecioneAviao = new JLabel();
			labelSelecioneAviao.setText("Escolha o avião");
			
			JComboBox<Aviao> comboSelecioneAviao = new JComboBox<Aviao>(aeronaves);
			
			JButton button = new JButton();
			button.setText("Buscar");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					try{
						Aviao aviao = (Aviao) comboSelecioneAviao.getSelectedItem();
						String message = "As reservas feitas são: \n";
						for(int x = 0; x < aviao.lugares.length; x++) {
							for(int y = 0; y < aviao.lugares[x].length; y++) {
								if(aviao.verificaLugarOcupado(x, y)) {
									Passageiro passageiro = aviao.getPassageiro(x, y);
									message += "[" + x + ", " + y + "] - " + passageiro.getNome() + " - " + passageiro.getCpf() + "\n";
								}
							}
						}
						JOptionPane.showMessageDialog(null, message);
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "Valor Inválido");
						}
					}
				});
					menu.add(panelReserva);
					panelReserva.add(labelSelecioneAviao);
					panelReserva.add(comboSelecioneAviao);
					panelReserva.add(button);
					setVisible(true);
			}
			
			});reservas3.addActionListener(new ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
				}
			});
		
		//Fechar
		reserva.add(reservas4);
		reservas4.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				hideAllPanels();
				setVisible(true);
			}
		});
		
		//Finalizar
		fim.add(fim1);
		fim1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("Menu");
		setSize(1200,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}


