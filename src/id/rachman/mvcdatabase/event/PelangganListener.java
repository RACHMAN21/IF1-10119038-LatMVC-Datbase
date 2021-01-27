/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rachman.mvcdatabase.event;

import id.rachman.mvcdatabase.entity.Pelanggan;
import id.rachman.mvcdatabase.model.PelangganModel;

/**
 * @author 
 * NIM   : 10119038
 * Nama  : Rachman Aldiansyah
 * Kelas : IF-1
 */

public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();

}