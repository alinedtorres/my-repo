import java.util.Hashtable;

public class Estacionamento {

  private Hashtable<String,String> veiculos;

  public Estacionamento() {
    veiculos = new Hashtable<String, String>();
  }

  public void estaciona(String placa, String veiculo) {
    veiculos.put(placa, veiculo);
  }

  public static void main(String[] args) {
    Estacionamento e = new Estacionamento();
    e.estaciona("GVE-3003", "Palio");
  }
}