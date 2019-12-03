
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class TaskMaster extends javax.swing.JFrame {

    ArrayList list;
    ListIterator li;
    int currentTask, toTask;
    Task t;

    public TaskMaster() {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        currentTask = 0;
        toTask = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lastbtn = new javax.swing.JButton();
        leftbtn = new javax.swing.JButton();
        rightbtn = new javax.swing.JButton();
        firstbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currentBox = new javax.swing.JTextField();
        totalBox = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionBox = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        showAllbtn = new javax.swing.JMenuItem();
        exitbtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        replacebtn = new javax.swing.JMenuItem();
        removebtn = new javax.swing.JMenuItem();
        restorebtn = new javax.swing.JMenuItem();
        clearbtn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        beforebtn = new javax.swing.JMenuItem();
        afterbtn = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        nameBox.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Description");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lastbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lastbtn.setText("<<");
        lastbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastbtnActionPerformed(evt);
            }
        });

        leftbtn.setText("<");
        leftbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftbtnActionPerformed(evt);
            }
        });

        rightbtn.setText(">");
        rightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightbtnActionPerformed(evt);
            }
        });

        firstbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        firstbtn.setText(">>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lastbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(leftbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(rightbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstbtn)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastbtn)
                    .addComponent(leftbtn)
                    .addComponent(rightbtn)
                    .addComponent(firstbtn))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Current Task");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Total Task");

        currentBox.setEditable(false);

        totalBox.setEditable(false);

        descriptionBox.setColumns(20);
        descriptionBox.setRows(5);
        jScrollPane2.setViewportView(descriptionBox);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nameBox, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(currentBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(totalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(currentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(totalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        showAllbtn.setText("Show All Tasks");
        showAllbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllbtnActionPerformed(evt);
            }
        });
        jMenu1.add(showAllbtn);

        exitbtn.setText("Exit");
        jMenu1.add(exitbtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        replacebtn.setText("Replace This As Current Task");
        jMenu2.add(replacebtn);

        removebtn.setText("Remove Current Task");
        jMenu2.add(removebtn);

        restorebtn.setText("Restore Current Task to Screen");
        jMenu2.add(restorebtn);

        clearbtn.setText("Clear Screen");
        jMenu2.add(clearbtn);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        beforebtn.setText("Before Current Task");
        jMenu3.add(beforebtn);

        afterbtn.setText("After Current task");
        afterbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterbtnActionPerformed(evt);
            }
        });
        jMenu3.add(afterbtn);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllbtnActionPerformed
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            t = (Task) list.get(i);
            result += "TASK " + (i + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_showAllbtnActionPerformed

    private void afterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afterbtnActionPerformed
        String nm = nameBox.getText();
        String d = descriptionBox.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "ERROR - Must enter all information");
            return;
        }
        if (toTask > 0) {
            li.next(); //go to past current task if there is at least one
        }
        li.add(t);
        li.previous();
        currentTask++;
        toTask++;
        totalBox.setText("" + toTask);
        currentBox.setText("" + currentTask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_afterbtnActionPerformed

    private void lastbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastbtnActionPerformed
        if (currentTask == toTask) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        t = (Task) li.previous();
        currentTask = toTask;

        currentBox.setText("" + currentTask);
        nameBox.setText(t.getName());
        descriptionBox.setText(t.getDescription());
    }//GEN-LAST:event_lastbtnActionPerformed

    private void leftbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftbtnActionPerformed
        if (currentTask == toTask) {
            return;
        }
        li.next();
        t = (Task) li.previous();
        currentTask = toTask;

        currentBox.setText("" + currentTask);
        nameBox.setText(t.getName());
        descriptionBox.setText(t.getDescription());
    }//GEN-LAST:event_leftbtnActionPerformed

    private void rightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightbtnActionPerformed

    }//GEN-LAST:event_rightbtnActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem afterbtn;
    private javax.swing.JMenuItem beforebtn;
    private javax.swing.JMenuItem clearbtn;
    private javax.swing.JTextField currentBox;
    private javax.swing.JTextArea descriptionBox;
    private javax.swing.JMenuItem exitbtn;
    private javax.swing.JButton firstbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastbtn;
    private javax.swing.JButton leftbtn;
    private javax.swing.JTextField nameBox;
    private javax.swing.JMenuItem removebtn;
    private javax.swing.JMenuItem replacebtn;
    private javax.swing.JMenuItem restorebtn;
    private javax.swing.JButton rightbtn;
    private javax.swing.JMenuItem showAllbtn;
    private javax.swing.JTextField totalBox;
    // End of variables declaration//GEN-END:variables
}
