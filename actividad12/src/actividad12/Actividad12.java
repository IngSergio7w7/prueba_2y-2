package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prueba_2 extends JFrame {

    // labels de texto que acompañan a los campos
    JLabel lblNombre, lblEdad, lblCorreo, lblUsuario, lblContrasena;
    // campos de texto donde el usuario captura los datos
    JTextField txtNombre, txtEdad, txtCorreo, txtUsuario;
    // campo especial para que la contraseña salga oculta con asteriscos
    JPasswordField txtContrasena;

    // label que sirve de titulo para el area de informacion
    JLabel lblInformacion;
    // area de texto donde se muestra informacion, con su scroll
    JTextArea areaInformacion;
    JScrollPane scrollInformacion;

    // botones de la parte de abajo
    JButton btnNuevo, btnAgregar;

    public Prueba_2() {
        setTitle("Práctica 1");
        setSize(750, 500);
        setLayout(null); // acomodo los componentes a mano
        setLocationRelativeTo(this); // centra la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }

    public void componentes() {

        // ---------- lado izquierdo: labels y campos ----------
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 30, 100, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(150, 30, 250, 30);
        add(txtNombre);

        lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 90, 100, 25);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(150, 90, 250, 30);
        add(txtEdad);

        lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(20, 150, 100, 25);
        add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(150, 150, 250, 30);
        add(txtCorreo);

        lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(20, 210, 100, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 210, 250, 30);
        add(txtUsuario);

        lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(20, 270, 100, 25);
        add(lblContrasena);

        // campo de contraseña, oculta lo que se escribe con asteriscos
        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(150, 270, 250, 30);
        add(txtContrasena);

        // ---------- lado derecho: informacion y area de texto ----------
        lblInformacion = new JLabel("Información");
        lblInformacion.setBounds(430, 30, 120, 30);
        add(lblInformacion);

        // area de texto donde se va a mostrar informacion
        areaInformacion = new JTextArea();

        // el scroll va alrededor del JTextArea, con las barras siempre visibles
        scrollInformacion = new JScrollPane(areaInformacion);
        scrollInformacion.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollInformacion.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollInformacion.setBounds(430, 90, 280, 210);
        add(scrollInformacion);

        // ---------- parte de abajo: botones ----------
        btnNuevo = new JButton("Nuevo");
        btnNuevo.setBounds(230, 330, 120, 35);
        add(btnNuevo);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(400, 330, 120, 35);
        add(btnAgregar);

        // todavia sin funcion, listos para agregarles logica despues
        btnNuevo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // aqui va la logica para limpiar los campos
            }
        });

        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // aqui va la logica para agregar el registro
            }
        });
    }
}