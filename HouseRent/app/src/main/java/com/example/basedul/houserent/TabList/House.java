package com.example.basedul.houserent.TabList;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.basedul.houserent.Home.HomeDetails;
import com.example.basedul.houserent.Home.HomeDetailsAdapt;
import com.example.basedul.houserent.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link House.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link House#newInstance} factory method to
 * create an instance of this fragment.
 */
public class House extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private int photosOFHome[] = {R.drawable.first, R.drawable.second, R.drawable.third};
    private String NameOfHome[] = {"ABC", "ABC", "ABC"};
    private String LocationOfHome[] = {"ABC", "ABC", "ABC"};
    private int numberOfBedRoomsAndKitchen[] = {2,2,2};
    private int ratingValue[] = {2,2,2};

    private HomeDetailsAdapt homeDetailsAdapt;
    private ArrayList<HomeDetails> arrayList = new ArrayList<>();

    private ListView listView;

    private View view;

    public House() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment House.
     */
    // TODO: Rename and change types and number of parameters
    public static House newInstance(String param1, String param2) {
        House fragment = new House();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("Hello", "onCreateView: ");
        if(view == null){

            view = inflater.inflate(R.layout.fragment_house, container, false);

        }else {

            ViewGroup parent = (ViewGroup) view.getParent();
            parent.removeView(view);

        }



        int len = NameOfHome.length;//len is length


        for(int i = 0; i < len; i++){

            arrayList.add(new HomeDetails(
                    photosOFHome[i],
                    NameOfHome[i],
                    LocationOfHome[i],
                    numberOfBedRoomsAndKitchen[i],
                    ratingValue[i]
            ));

            Log.d("TAG0", " "+photosOFHome[i]);
            Log.d("TAG1", NameOfHome[i]);
            Log.d("TAG2", LocationOfHome[i]);
            Log.d("TAG3", " "+numberOfBedRoomsAndKitchen[i]);
            Log.d("TAG4", " "+ratingValue[i]);
        }

        listView = (ListView)view.findViewById(R.id.listViewInFragment_homes_xml_file);

        homeDetailsAdapt = new HomeDetailsAdapt(getActivity(),R.layout.list_item_container, arrayList);

        listView.setAdapter(homeDetailsAdapt);

        return view;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
