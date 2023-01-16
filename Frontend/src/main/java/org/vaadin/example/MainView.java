package org.vaadin.example;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@Route
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
public class MainView extends VerticalLayout{

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView(@Autowired ZBSService service) throws URISyntaxException, IOException, InterruptedException {

        /*

        FUNCIONA - SI INTRODUCES EL NOMBRE DE UN CENTRO, Y PULSAS EL BOTON TE MUESTRA UNA NOTIFICACION CON LA INFORMACION COMPLETA DEL CENTRO

        // Use TextField for standard text input
        TextField textField = new TextField("Your name");
        textField.addThemeName("bordered");

        // Button click listeners can be defined as lambda expressions
        Button button = new Button("Say hello",
                e -> {
                    try {
                        Notification.show(service.leeCentrosPorNombre(textField.getValue()));
                    } catch (URISyntaxException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                });

        // Theme variants give you predefined extra styles for components.
        // Example: Primary button has a more prominent look.
        button.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        // You can specify keyboard shortcuts for buttons.
        // Example: Pressing enter in this view clicks the Button.
        button.addClickShortcut(Key.ENTER);

        // Use custom CSS classes to apply styling. This is defined in shared-styles.css.
        addClassName("centered-content");

        add(textField, button);*/



        //SEGUINDA FORMAAAAAAAAAAAAAAAAAAAAAAA SOLO FUNCIONA METODO POR NOMBRE
        // Objetos para mostrar datos
        //ZonaBasicaSalud zbs = new ZonaBasicaSalud();
        /*final TextField codigoGeometria = new TextField("Codigo Geometría");
        final TextField zonaBasicaSalud = new TextField("Zona Basica Salud");
        final TextField tasaIncidenciaAcumuladaUltimos14Dias = new TextField("TIA 14 días");
        final TextField tasaIncidenciaAcumuladaTotal = new TextField("TIA Total");
        final TextField casosConfirmadosTotales = new TextField("Casos Confirmados Totales");
        final TextField casosConfirmadosUltimos14Dias = new TextField("Casos Confirmados 14 días");
        final TextField fechaInforme = new TextField("Fecha Informe");
        //ZonaBasicaSalud zbs = new ZonaBasicaSalud(codigoGeometria, zonaBasicaSalud, tasaIncidenciaAcumuladaUltimos14Dias, tasaIncidenciaAcumuladaTotal, casosConfirmadosTotales, casosConfirmadosUltimos14Dias, fechaInforme);

        HorizontalLayout inputs = new HorizontalLayout();
        VerticalLayout results = new VerticalLayout();
        ComboBox<String> comboBox = new ComboBox<>("Selecciona uno...");
        comboBox.setAllowCustomValue(false);
        comboBox.setItems("Todos los centros", "Por Nombre");
        comboBox.setHelperText("Selecciona el tipo de petición");
        Grid<ZonaBasicaSalud> grid = new Grid<>(ZonaBasicaSalud.class, true);


        grid.addColumn(ZonaBasicaSalud::getCodigo_geometria).setHeader("Codigo Geometría");
        grid.addColumn(ZonaBasicaSalud::getZona_basica_salud).setHeader("Zona Basica Salud");
        grid.addColumn(ZonaBasicaSalud::getTasa_incidencia_acumulada_ultimos_14dias).setHeader("TIA 14 días");
        grid.addColumn(ZonaBasicaSalud::getTasa_incidencia_acumulada_total).setHeader("TIA Total");
        grid.addColumn(ZonaBasicaSalud::getCasos_confirmados_totales).setHeader("Casos Conf Totales");
        grid.addColumn(ZonaBasicaSalud::getCasos_confirmados_ultimos_14dias).setHeader("Casos Conf 14 días");
        grid.addColumn(ZonaBasicaSalud::getFecha_informe).setHeader("Fecha Informe");


        inputs.add(comboBox);





        Button boton1 = new Button("Buscar Datos",
                e -> {
            String tipoPeticion = comboBox.getValue();

            try {
                results.removeAll();

                results.add(String.valueOf(service.leeCentrosPorNombre("Acacias")));
                results.add(String.valueOf(service.leeCentros().));





            } catch (Exception ex) {
            }
        });
        boton1.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        boton1.addClickShortcut(Key.ENTER);
        addClassName("centered-content");
        add(inputs, boton1, results);*/






        //3ER METODO


        HorizontalLayout horizontalLayout = new HorizontalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();


        Tab tabs = new Tab();
        Tab primerTab = new Tab("Zonas Básicas Salud");
        Tab segundoTab = new Tab("Zonas Básicas Salud Mayores 60");

        this.add(horizontalLayout);
        this.add(verticalLayout);

        tabs.add(primerTab);

        Grid<ZonaBasicaSalud> gridZBS = new Grid<>(ZonaBasicaSalud.class);
        Grid<ZonaBasicaSalud60Mayores> gridZBSMayores = new Grid<>(ZonaBasicaSalud60Mayores.class);
        primerTab.add(horizontalLayout);
        segundoTab.add(verticalLayout);

        List<ZonaBasicaSalud> zonasBS = service.leeCentros();
        List<ZonaBasicaSalud60Mayores> zonasBSM60 = service.leeCentrosMayores60();

        //Grid Primer Fichero
        gridZBS.setItems(zonasBS);
        gridZBS.addColumn(ZonaBasicaSalud::getCodigo_geometria).setHeader("Codigo Geometría");
        //gridZBS.getColumn("Codigo Geometría").setEditable(false);
        gridZBS.addColumn(ZonaBasicaSalud::getZona_basica_salud).setHeader("Zona Basica Salud");
        gridZBS.addColumn(ZonaBasicaSalud::getTasa_incidencia_acumulada_ultimos_14dias).setHeader("TIA 14 días");
        gridZBS.addColumn(ZonaBasicaSalud::getTasa_incidencia_acumulada_total).setHeader("TIA Total");
        gridZBS.addColumn(ZonaBasicaSalud::getCasos_confirmados_totales).setHeader("Casos Conf Totales");
        gridZBS.addColumn(ZonaBasicaSalud::getCasos_confirmados_ultimos_14dias).setHeader("Casos Conf 14 días");
        gridZBS.addColumn(ZonaBasicaSalud::getFecha_informe).setHeader("Fecha Informe");
        //Columna de los botones
        gridZBS.addColumn(new ComponentRenderer<>(item -> {
                    Button editBtn = new Button("Editar", VaadinIcon.EDIT.create());
                    Button saveBtn = new Button("Guardar", VaadinIcon.DATABASE.create());
                    editBtn.addClickListener(click -> {
                        //saveBtn.setVisible(true);
                        //editBtn.setVisible(false);
                        gridZBS.getEditor().editItem(item);
                    });
                    saveBtn.addClickListener(click -> {
                        //saveBtn.setVisible(false);
                        //editBtn.setVisible(true);
                        gridZBS.getEditor().save();
                    });

                    editBtn.setWidth("100%");
                    saveBtn.setWidth("100%");
                    //saveBtn.setVisible(false); show both buttons until this issue gets answered: https://vaadin.com/forum/thread/17472233/grid-componentrenderer-issue-with-button-clicklisteners-within

                    HorizontalLayout editLayout = new HorizontalLayout(editBtn, saveBtn);
                    editLayout.setWidth("100%");
                    return editLayout;
                }))
                .setKey("Editar")
                .setHeader("Editar")
                .setFlexGrow(0)
                .setWidth("300px")
                .setId("edit");










        //Grid Segundo Fichero
        gridZBSMayores.setItems(zonasBSM60);
        gridZBSMayores.addColumn(ZonaBasicaSalud60Mayores::getCodigo_geometria).setHeader("Codigo Geometría");
        gridZBSMayores.addColumn(ZonaBasicaSalud60Mayores::getZona_basica_salud).setHeader("Zona Basica Salud");
        gridZBSMayores.addColumn(ZonaBasicaSalud60Mayores::getTasa_incidencia_acumulada_P60mas_ultimos_14dias).setHeader("TIA 14 días");
        gridZBSMayores.addColumn(ZonaBasicaSalud60Mayores::getCasos_confirmados_P60mas_ultimos_14dias).setHeader("Casos Conf 14 días");
        gridZBSMayores.addColumn(ZonaBasicaSalud60Mayores::getFecha_informe).setHeader("Fecha Informe");


        add(tabs, gridZBS, gridZBSMayores);



    }//Mainview Autowired



}//MainView Principal
