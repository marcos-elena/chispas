public class Servicio implements Ventas{

    private Integer id;
    private String name;
    private Integer precio;
    private Integer iva;

    public void setId(Integer id){
        this.id=id;
    }
    @Override
    public Integer getId() {
        return id;
    }

    public void setName(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setPrecio(Integer precio){
        this.precio=precio;
    }
    @Override
    public Integer getPrecio() {
        return precio;
    }

    public void setIva(Integer iva) {
        this.iva = iva;
    }

    @Override
    public Integer getIva() {
        return iva;
    }
}
