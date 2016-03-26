/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CalcModel;
import view.CalcView;

/**
 *
 * @author blegoh
 */
public class CalcController {
    
    private CalcModel theModel;
    private CalcView theView;

    public CalcController(CalcModel theModel, CalcView theView) {
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addHitungListener(new HitungListener());
    }
    
    class HitungListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theModel.setBil1(theView.getBil1());
            theModel.setBil2(theView.getBil2());
            theModel.setOperator(theView.getOperator());
            theView.setHasil(theModel.hitung());
        }
        
    }
}
