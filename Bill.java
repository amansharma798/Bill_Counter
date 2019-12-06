public class Bill extends javax.swing.JFrame {
    public Bill() {
        initComponents();
        TextField.setEditable(false);
        TextField.setText("        TOURIST RESTAURANT\n***************************************\n\n\n");
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NOODLES = new javax.swing.JSpinner();
        VEG_BURGER = new javax.swing.JSpinner();
        CHILLI_POTATO = new javax.swing.JSpinner();
        MOMOS = new javax.swing.JSpinner();
        FRY_MOMOS = new javax.swing.JSpinner();
        PIZZA_BURGER = new javax.swing.JSpinner();
        TOTAL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); 
        jLabel1.setText("                WELCOME TO TOURIST RESTAURANT");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOODLES                RS =  60");

        jLabel3.setText("  VEG BURGER          RS = 30");

        jLabel4.setText(" CHILLI POTATO      RS = 80");

        jLabel5.setText(" MOMOS                   RS = 40");

        jLabel6.setText(" FRY MOMOS            RS = 60");

        jLabel7.setText(" PIZZA BURGER        RS = 50");

        TOTAL.setText("TOTAL");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });

        TextField.setColumns(20);
        TextField.setRows(5);
        jScrollPane1.setViewportView(TextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TOTAL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PIZZA_BURGER, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(FRY_MOMOS)
                        .addComponent(MOMOS)
                        .addComponent(CHILLI_POTATO)
                        .addComponent(VEG_BURGER)
                        .addComponent(NOODLES)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NOODLES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(VEG_BURGER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(CHILLI_POTATO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MOMOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FRY_MOMOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PIZZA_BURGER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addComponent(TOTAL))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed
        int a1=(Integer)NOODLES.getValue();
        int a2=(Integer)VEG_BURGER.getValue();
        int a3=(Integer)CHILLI_POTATO.getValue();
        int a4=(Integer)MOMOS.getValue();
        int a5=(Integer)FRY_MOMOS.getValue();
        int a6=(Integer)PIZZA_BURGER.getValue();
        int res=(a1*60)+(a2*30)+(a3*80)+(a4*40)+(a5*60)+(a6*50);
        
        TextField.setText("");
        TextField.setText("        TOURIST RESTAURANT\n***************************************\n\n\n");
        
       if(a1!=0)
       {
        TextField.append("NOODLES = "+NOODLES.getValue()+"*60"+"\n");
       }
       
        if(a2!=0)
        {
        TextField.append("VEG_BURGER = "+VEG_BURGER.getValue()+"*30"+"\n");
        }
       
        if(a3!=0)
        {
        TextField.append("CHILLI_POTATO = "+CHILLI_POTATO.getValue()+"*80"+"\n");
        }
        
        if(a4!=0)
        {
        TextField.append("MOMOS = "+MOMOS.getValue()+"*40"+"\n");
        }
        
        if(a5!=0)
        {
        TextField.append("FRY_MOMOS = "+FRY_MOMOS.getValue()+"*60"+"\n");
        }
        
        if(a6!=0)
        {
        TextField.append("PIZZA_BURGER = "+PIZZA_BURGER.getValue()+"*50"+"\n");
        }
        
        if(res!=0)
        {
        TextField.append("   \n\n\nTOTAL AMOUNT = "+res+" ONLY\n\n\n");
        TextField.append("                    THANKS FOR\n                    VISITING US");
        }
    }//GEN-LAST:event_TOTALActionPerformed

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
                
            }
        });
    }

    private javax.swing.JSpinner CHILLI_POTATO;
    private javax.swing.JSpinner FRY_MOMOS;
    private javax.swing.JSpinner MOMOS;
    private javax.swing.JSpinner NOODLES;
    private javax.swing.JSpinner PIZZA_BURGER;
    private javax.swing.JButton TOTAL;
    private javax.swing.JTextArea TextField;
    private javax.swing.JSpinner VEG_BURGER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
}
