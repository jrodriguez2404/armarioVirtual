package com.example.pruebaproyecto;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.DialogFragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
/**
 * Ciclo formativo: Desarrollo de Aplicaciones Multiplataforma
 * Módulo profesional: Programación Multimedia y Dispositivos Móviles
 * Proyecto final 2º DAM
 * Alumno: Ismael Casado González
 * Curso académico: 2018-2019
 * Instituto Tecnológico Poniente
 */
public class MainActivityDrawer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    /*
        Este método actualizará la vista de la pantalla, es decir, se encargará de mostrar
        los elementos en los casos de que el usuario esté o no registrado.
     */
    public void updateUI() {
        /*
        SharedPreferences prefs = objeto.obtenerPreferencias();
        // Comprobamos las preferencias para ver que pantalla ponemos al inicio
        if (prefs.getString("user","").isEmpty() ||
                prefs.getString("pass","").isEmpty() ||
                prefs.getString("tok","").isEmpty() ) {
            // Abrimos la pantalla de mensaje
            layoutRegistro.setVisibility(View.VISIBLE);
            layoutMensaje.setVisibility(View.GONE);
        } else {
            // Abrimos la pantalla de registro
            layoutRegistro.setVisibility(View.GONE);
            layoutMensaje.setVisibility(View.VISIBLE);
        }
        usuarioConectado.setText(prefs.getString("user","No registrado"));
        */
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Para probar fotos
            Intent intent = new Intent(this, ActividadFotos.class);
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}