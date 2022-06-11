package controller;

import java.util.List;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Aluno;

public class TelaController {

	private Alert alerta = new Alert(AlertType.WARNING);

	@FXML
	private TableView<Aluno> tabelaAluno;

	@FXML
	private TableColumn<Aluno, Long> colId;

	@FXML
	private TableColumn<Aluno, String> colNome;

	@FXML
	private TableColumn<Aluno, String> colCpf;

	@FXML
	private TableColumn<Aluno, String> colFone;

	@FXML
	private TextField txtCpf;

	@FXML
	private TextField txtFone;

	@FXML // inje��o de depend�ncia
	private TextField txtId;

	@FXML
	private TextField txtNome;

	@FXML
	private Label labelMsg;

	// m�todo caregado automaticamente assim que a tela � exibida
	@FXML
	void initialize() {
		List<Aluno> alunos = Principal.daoAluno.listar();
		ObservableList<Aluno> listaAlunos = FXCollections.observableArrayList(alunos);

		colId.setCellValueFactory(new PropertyValueFactory<Aluno, Long>("id"));
		colNome.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
		colCpf.setCellValueFactory(new PropertyValueFactory<Aluno, String>("cpf"));
		colFone.setCellValueFactory(new PropertyValueFactory<Aluno, String>("fone"));

		tabelaAluno.setItems(listaAlunos);

		// tabela gr�fica -> dados -> evento
		tabelaAluno.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Aluno>() {

			@Override
			public void changed(ObservableValue<? extends Aluno> valor, Aluno oldAluno, Aluno newAluno) {
				txtId.setText(newAluno.getId().toString());
				txtNome.setText(newAluno.getNome());
				txtCpf.setText(newAluno.getCpf());
				txtFone.setText(newAluno.getFone());
			}
		});

	}

	void limpar() {
		txtId.clear();
		txtNome.clear();
		txtCpf.clear();
		txtFone.clear();
	}

	@FXML
	void acaoLimpar(ActionEvent event) {
		limpar();

	}

	@FXML
	void acaoSalvar(ActionEvent event) {
		String strId = txtId.getText();
		String nome = txtNome.getText();
		String cpf = txtCpf.getText();
		String fone = txtFone.getText();

		// salva aluno
		if (strId.isEmpty()) {
			Aluno aluno = new Aluno(nome, cpf, fone);
			Principal.daoAluno.inserir(aluno);
			labelMsg.setText("Dados salvos");
			// atualiza aluno
		} else {
			long id = Long.parseLong(strId);
			Aluno retorno = Principal.daoAluno.buscar(id);

			if (retorno == null)
				labelMsg.setText("ID do aluno n�o encontrado para atualizar dados!");
			else {
				Aluno aluno = new Aluno(nome, cpf, fone);
				aluno.setId(id);
				Principal.daoAluno.atualizar(aluno);
				labelMsg.setText("Dados atualizados!");

			}
		}

	}

	@FXML
	void acaoBuscar(ActionEvent event) {
		String strId = txtId.getText();
		if (strId.isEmpty()) {
			alerta.setTitle("Aviso");
			alerta.setHeaderText("Voc� esqueceu!");
			alerta.setContentText("Faltou digitar o id do aluno");
			alerta.showAndWait();
		} else {
			// converte string para long
			long id = Long.parseLong(strId);
			Aluno aluno = Principal.daoAluno.buscar(id);
			if (aluno != null) {
				txtNome.setText(aluno.getNome());
				txtCpf.setText(aluno.getCpf());
				txtFone.setText(aluno.getFone());
			} else {
				alerta.setTitle("Aviso");
				alerta.setHeaderText("N�o achou!");
				alerta.setContentText("O aluno com ID=" + strId + "n�o foi encontrado.");
				alerta.showAndWait();
			}
			System.out.println("Buscar");
		}
	}

	@FXML
	void acaoApagar(ActionEvent event) {
		String strId = txtId.getText();

		if (strId.isEmpty()) {
			alerta.setTitle("Aviso");
			alerta.setHeaderText("Voc� esqueceu!");
			alerta.setContentText("Faltou digitar o id do aluno");
			alerta.showAndWait();
		} else {
			// converte string para long
			long id = Long.parseLong(strId);
			boolean apagou = Principal.daoAluno.apagar(id);
			if (apagou) {
				labelMsg.setText("Dados deletados com sucesso!");
				limpar();
			} else {
				alerta.setTitle("Aviso");
				alerta.setHeaderText("N�o apagou!");
				alerta.setContentText("ID n�o encontrado ou falha ao apagar");
				alerta.showAndWait();
			}

		}
	}

	@FXML
	void acaoImprimir(ActionEvent event) {
		labelMsg.setText("Imprimindo tabela...");

		// obt�m a impressora padr�o do sistema
		Printer impressora = Printer.getDefaultPrinter();

		// cria uma p�gina A4, retrato com margem padr�o
		PageLayout pagina = impressora.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.DEFAULT);

		// cria uma fila de impress�o baseada na impressora padr�o
		PrinterJob fila = PrinterJob.createPrinterJob();

		// se a fila foi criada, tenta enviar o documento
		if (fila != null) {
			System.out.println("Enviando documento para fila de impress�o...");
			
			// mostra a caixa de di�logo da impress�o 
			if (fila.showPrintDialog(null)) {
				
				tabelaAluno.setLayoutX(0);
				tabelaAluno.setLayoutY(0);
				
				
				
				//envia o documento para o spooller de impress�o
				boolean enviado = fila.printPage(pagina, tabelaAluno);
				
				// se documento foi enviado para fila com sucesso, ent�o
				// finaliza a fila e retorna true se obteve sucesso
				if (enviado && fila.endJob());
					// endJob() = true n�o significa que o documento saiu na impressora
					// mas que o servi�o de envio para fila  foi finalizado
				labelMsg.setText("Documento enviado com sucesso!");
				
			} else 
				labelMsg.setText("N�o foi poss�vel mostrar caixa de impress�o.");
			
		} else
			labelMsg.setText("N�o foi poss�vel criar fila de impress�o.");

	}

}
