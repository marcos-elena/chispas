public class Sociedad implements Clientes {

    private Integer id;
    private String name;
    private String code;
    private String direccionPostal;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    public void setId(Integer id) {
        this.id = id;
    }
    @Override
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public String getCode() {
        return code;
    }
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal = direccionPostal;
    }
    @Override
    public String getDireccionPostal() {
        return direccionPostal;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    @Override
    public String getPoblacion() {
        return poblacion;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    @Override
    public String getProvincia() {
        return provincia;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getEmail() {
        return email;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public String getTelefono() {
        return telefono;
    }
}