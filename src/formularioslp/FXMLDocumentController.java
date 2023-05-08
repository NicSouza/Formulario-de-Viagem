package formularioslp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author nicol
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane formLugar;

    @FXML
    private Button formLugar_btn;

    @FXML
    private AnchorPane formPessoa;

    @FXML
    private Button formPessoa_btn;

    @FXML
    private AnchorPane formVeiculo;

    @FXML
    private Button formVeiculo_btn;

    @FXML
    private AnchorPane formViagem;

    @FXML
    private Button formViagem_btn;
    
    @FXML
    private TableColumn<Pessoa, String> tNacionalidade;

    @FXML
    private TableColumn<Pessoa, String> tNome;

    @FXML
    private TableColumn<Pessoa, String> tSexo;

    @FXML
    private TableView<Pessoa> table1;
    
    @FXML
    private TextField txtNome;  
    
    @FXML
    private TextField txtSexo;
    
    @FXML
    private TextField txtNacionalidade;
    
    @FXML
    private TableColumn<Veiculo, String> cor;

    @FXML
    private TableColumn<Veiculo, String> modelo;
    
    @FXML
    private TableColumn<Veiculo, String> tipo;

    @FXML
    private TableView<Veiculo> table2;
    
    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtModelo;
    
    @FXML
    private TextField txtTipo;
      
    @FXML
    private TableColumn<Lugar, String> endereco; 
    
    @FXML
    private TableColumn<Lugar, String> local;
    
    @FXML
    private TableView<Lugar> table3;
    
    @FXML
    private TextField txtLocal;
    
    @FXML
    private TextField txtEndereco;
    
    @FXML
    private TableColumn<Viagem, String> origem;

    @FXML
    private TableColumn<Viagem, String> destino;
    
    @FXML
    private TableView<Viagem> table4;
    
    @FXML
    private TextField txtOrigem;
    
    @FXML
    private TextField txtDestino;        
    
    ObservableList<Pessoa>initialData1(){
        Pessoa p1 = new Pessoa("Nicole Souza", "Feminino", "BR");
        Pessoa p2 = new Pessoa("Adriana", "Feminino", "BR");
        return FXCollections.observableArrayList(p1,p2);
    }
    
    ObservableList<Veiculo>initialData2(){
        Veiculo v1 = new Veiculo("Carro", "Azul", "Fusca");
        Veiculo v2 = new Veiculo("Moto", "Branca", "Honda");
        return FXCollections.observableArrayList(v1,v2);
    }
    
    ObservableList<Lugar>initialData3(){
        Lugar l1 = new Lugar("Fatec", "Avenida Cesare Monsueto Giulio Lattes");
        Lugar l2 = new Lugar("Etec", "Avenida Salmão");
        return FXCollections.observableArrayList(l1,l2);
    }
    
    ObservableList<Viagem>initialData4(){
        Viagem vi1 = new Viagem("São Paulo", "Itália");
        Viagem vi2 = new Viagem("São Paulo", "Japão");
        return FXCollections.observableArrayList(vi1,vi2);
    }
    
    @FXML
    private void btnInsert(ActionEvent event){
        Pessoa newData = new Pessoa(txtNome.getText(),txtSexo.getText(), txtNacionalidade.getText());
        table1.getItems().add(newData);
        txtNome.clear();
        txtSexo.clear();
        txtNacionalidade.clear();
    }
    
    @FXML
    private void btnInsert2(ActionEvent event){
        Veiculo newData = new Veiculo(txtTipo.getText(),txtCor.getText(), txtModelo.getText());
        table2.getItems().add(newData);
        txtTipo.clear();
        txtCor.clear();
        txtModelo.clear();
    }
    
    @FXML
    private void btnInsert3(ActionEvent event){
        Lugar newData = new Lugar(txtLocal.getText(),txtEndereco.getText());
        table3.getItems().add(newData);
        txtLocal.clear();
        txtEndereco.clear();
    }
    
    @FXML
    private void btnInsert4(ActionEvent event){
        Viagem newData = new Viagem(txtOrigem.getText(),txtDestino.getText());
        table4.getItems().add(newData);
        txtOrigem.clear();
        txtDestino.clear();
    }
    
    public void switchForm(ActionEvent event){
        
        if(event.getSource() == formPessoa_btn){
            formPessoa.setVisible(true);
            formVeiculo.setVisible(false);
            formLugar.setVisible(false);
            formViagem.setVisible(false);
        
        }else if(event.getSource() == formVeiculo_btn){
            formPessoa.setVisible(false);
            formVeiculo.setVisible(true);
            formLugar.setVisible(false);
            formViagem.setVisible(false); 
        }else if(event.getSource() == formLugar_btn){
            formPessoa.setVisible(false);
            formVeiculo.setVisible(false);
            formLugar.setVisible(true);
            formViagem.setVisible(false); 
        }else if(event.getSource() == formViagem_btn){
            formPessoa.setVisible(false);
            formVeiculo.setVisible(false);
            formLugar.setVisible(false);
            formViagem.setVisible(true); 
        }
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tNome.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("tNome"));
        tSexo.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("tSexo"));
        tNacionalidade.setCellValueFactory(new PropertyValueFactory<Pessoa, String>("tNacionalidade"));
       
        tipo.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("tipo"));
        cor.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("cor"));
        modelo.setCellValueFactory(new PropertyValueFactory<Veiculo, String>("modelo"));
        
        local.setCellValueFactory(new PropertyValueFactory<Lugar, String>("local"));
        endereco.setCellValueFactory(new PropertyValueFactory<Lugar, String>("endereco"));
        
        origem.setCellValueFactory(new PropertyValueFactory<Viagem, String>("origem"));
        destino.setCellValueFactory(new PropertyValueFactory<Viagem, String>("destino"));
        
        table1.setItems(initialData1());
        table2.setItems(initialData2());
        table3.setItems(initialData3());
        table4.setItems(initialData4());
    }    
    
}
