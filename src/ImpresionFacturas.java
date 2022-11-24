public class ImpresionFacturas {
    public void print(Facturas factura1) {
        System.out.println("-------------------");
        System.out.println("FACTURA-" + factura1.getId());
        System.out.println("FECHA: " + factura1.getFecha());
        System.out.println("CLIENTE:");
        System.out.println("cif/nif: " + factura1.getCliente().getCode());
        System.out.println("nombre: " + factura1.getCliente().getName());
        System.out.println("direccion: " + factura1.getCliente().getDireccionPostal());
        System.out.println("poblacion: " + factura1.getCliente().getPoblacion());
        System.out.println("provincia: " + factura1.getCliente().getProvincia());
        System.out.println("email: " + factura1.getCliente().getEmail());
        System.out.println("VENTA:");
        System.out.println("codigo: " + factura1.getVenta().getId());
        System.out.println("nombre: " + factura1.getVenta().getName());
        System.out.println("precio: " + factura1.getVenta().getPrecio());
        System.out.println("tipo IVA: " + factura1.getVenta().getIva());
        System.out.println("Total: " + (factura1.getVenta().getPrecio()*(1+factura1.getVenta().getIva())));
        System.out.println("--------------");
        System.out.println("codigo: " + factura1.getVenta().getId());
        System.out.println("nombre: " + factura1.getVenta().getName());
        System.out.println("precio: " + factura1.getVenta().getPrecio());
        System.out.println("tipo IVA: " + factura1.getVenta().getIva());
        System.out.println("Total: " + (factura1.getVenta().getPrecio()*(1+factura1.getVenta().getIva())));
        System.out.println("TOTAL:");
        System.out.println("Total: " + (factura1.getVenta().getPrecio()+factura1.getVenta().getPrecio()));
        System.out.println("-------------------");
    }
}
