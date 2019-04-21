package androidcourse.companyname.com.petagramfragment.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;

import androidcourse.companyname.com.petagramfragment.DetalleMascota;
import androidcourse.companyname.com.petagramfragment.MainActivity;
import androidcourse.companyname.com.petagramfragment.R;
import androidcourse.companyname.com.petagramfragment.adapter.MascotaAdaptador;
import androidcourse.companyname.com.petagramfragment.pojo.Global;
import androidcourse.companyname.com.petagramfragment.pojo.Mascota;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    ArrayList<Mascota> lista = new ArrayList<>();
    private RecyclerView listaMascotas;
    ArrayList<Mascota> gustoAnimal = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        //getSupportActionBar().setTitle(R.string.app_name);
        //getSupportActionBar().setLogo(R.drawable.huella);

        lista.add(new Mascota(R.drawable.chihuahua,"Dominico",(byte)0));
        lista.add(new Mascota(R.drawable.happycat,"Perejilo",(byte)0));
        lista.add(new Mascota(R.drawable.husky,"Laboriel",(byte)0));
        lista.add(new Mascota(R.drawable.pomeranian,"Ito",(byte)0));
        lista.add(new Mascota(R.drawable.pitbull,"Brutus",(byte) 0));
        lista.add(new Mascota(R.drawable.kitty,"Hello",(byte)0));
        lista.add(new Mascota(R.drawable.pug,"Edgar", (byte)0));

        for(int ind=0;ind<lista.size();ind++)
        {
            for(int idx = 0; idx< Global.likeMascotas.size(); idx++)
            {
                if(lista.get(ind).getNombre() == Global.likeMascotas.get(idx).getNombre()){
                    lista.get(ind).setCalificacion(Global.likeMascotas.get(idx).getCalificacion());
                }
            }
        }

        listaMascotas =  v.findViewById(R.id.RVmascotas);

        LinearLayoutManager lnm = new LinearLayoutManager(getActivity());
        lnm.setOrientation(LinearLayoutManager.VERTICAL);

        //lstContactos.setLayoutManager(lnm);
        listaMascotas.setLayoutManager(lnm);

        listaMascotas.setAdapter(new MascotaAdaptador(lista,getActivity()));

        return v;
    }



}
