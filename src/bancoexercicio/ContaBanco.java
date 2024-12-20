package bancoexercicio;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados 
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
        
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Sua conta não foi fechada pois ainda existe saldo positivo nela!");
        } else if(this.getSaldo()<0) {
            System.out.println("Sua conta não foi fechada pois ainda existe saldo negativo nela!");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float v) {
        if(this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo( this.getSaldo() + v);
        }
    }

    public void sacar() {

    }

    public void pagarMensal() {

    }

    //Metodos especias 

    public ContaBanco() {
      this.saldo = 0;
      this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
