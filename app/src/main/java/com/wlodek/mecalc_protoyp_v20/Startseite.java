package com.wlodek.mecalc_protoyp_v20;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Startseite extends Fragment {


    private Button btn_info;


    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_startseite, container, false);
            }
        }



        /* <Button
        android:id="@+id/btn_info"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:text="Informationen"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/mecalc_logo_start" />

        <Button
        android:id="@+id/btn_rechner"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="9dp"
        android:layout_marginRight="9dp"
        android:text="Kalorienrechner"
        app:layout_constraintBottom_toTopOf="@+id/btn_tb"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_info" />

    <Button
        android:id="@+id/btn_tb"
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:layout_marginStart="8dp"
        android:layout_marginLeft="8dp"
        android:layout_marginTop="32dp"
        android:layout_marginEnd="8dp"
        android:layout_marginRight="8dp"
        android:layout_marginBottom="40dp"
        android:text="Tagebuch"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/btn_rechner"
        app:layout_constraintVertical_bias="0.0" />*/

