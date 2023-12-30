package Lan_Chat_and_File_Sharing;

import data.Data;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Server extends javax.swing.JFrame {

    public Server() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        msg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("File_Server");
        setBackground(new java.awt.Color(240, 187, 255));

        jButton1.setBackground(new java.awt.Color(255, 51, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Start Server");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(204, 204, 204));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        list.setBackground(new java.awt.Color(204, 204, 204));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\wsakr\\Desktop\\8\\Computer Networking Lab\\Project\\Code\\logo2.png")); // NOI18N

        con.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        con.setText("Message");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("File List");

        user.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 0, 51));
        user.setText("No one is connected");

        msg.setBackground(new java.awt.Color(242, 255, 255));
        msg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        msg.setToolTipText("Name");
        msg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgActionPerformed(evt);
            }
        });
        msg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msgKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(msg, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(con)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con)
                    .addComponent(jLabel3)
                    .addComponent(user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    static private ServerSocket server;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    DataOutputStream dos;
    DataInputStream dis;
    Socket s;
    private DefaultListModel mod = new DefaultListModel();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        list.setModel(mod);
        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton3.setBackground(new java.awt.Color(102, 255, 102));
        jButton3.setVisible(true);
        list.setBackground(new java.awt.Color(204, 255, 204));
        txt.setBackground(new java.awt.Color(222, 253, 225));
        jButton1.setText("Server Started");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    server = new ServerSocket(9999);
                    s = server.accept();
                    //check again and again the server is connected or not and update the status
                    if (s.isConnected()) {
                        user.setText("Connected to client: Washim Akram");
                        user.setForeground(Color.magenta);
                    }
                    if (!s.isConnected()) {
                        user.setText("Disconnected to client: Washim Akram");
                        user.setForeground(Color.red);
                    }

                    Data data = new Data();
                    data.setStatus("new");
                    in = new ObjectInputStream(s.getInputStream());
                    data = (Data) in.readObject();
                    String name = data.getName();
                    dos = new DataOutputStream(s.getOutputStream());
                    dis = new DataInputStream(s.getInputStream());
                    String rec = "";
                    String send = "";
                    dos.writeUTF("Welcome to AlienSpot");
                    while (true) {
                        rec = dis.readUTF();
                        if (rec.equals("File")) {
                            data = (Data) in.readObject();
                            name = data.getName();
                            mod.addElement(data);
                            txt.append(" 1 File Recieved: " + name + "\n");
                            dos.writeUTF("(Received)");
                        } else {
                            txt.append(" Client says: " + rec + "\n");
                        }   
                    }
                } catch (Exception e) {
                    System.out.println("Error in run 2: " + e);
                }
                if (server.isClosed()) {
                    jButton1.setText("Server closed");
                }

            }
        }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if (evt.getClickCount() == 2) {
            if (evt.getClickCount() == 2) {
                if (!list.isSelectionEmpty()) {
                    if (SwingUtilities.isLeftMouseButton(evt)) {
                        save();
                    } else if (SwingUtilities.isRightMouseButton(evt)) {
                        save();
                    }

                }
            }
        }
    }//GEN-LAST:event_listMouseClicked

    private void save() {
        Data data = (Data) mod.getElementAt(list.getSelectedIndex());
        JFileChooser ch = new JFileChooser();
        int c = ch.showSaveDialog(this);
        if (c == JFileChooser.APPROVE_OPTION) {
            try {
                FileOutputStream out = new FileOutputStream(ch.getSelectedFile());
                out.write(data.getFile());
                out.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!list.isSelectionEmpty()) {
            save();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgActionPerformed

    }//GEN-LAST:event_msgActionPerformed

    private void msgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msgKeyPressed

        if (s.isConnected()) {
            user.setText("Connected to client: Washim Akram");
            user.setForeground(Color.magenta);
        }
        if (!s.isConnected()) {
            user.setText("Disconnected to client: Washim Akram");
            user.setForeground(Color.red);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String send = "";
                send = msg.getText();
                dos = new DataOutputStream(s.getOutputStream());
                dis = new DataInputStream(s.getInputStream());
                dos.writeUTF(send);
                msg.setText(send);
                txt.setText(txt.getText() + " Server says: : " + send + "\n");
                msg.setText("");
            } catch (IOException ex) {
                System.out.println("Error Occuring");;
            }
        }
    }//GEN-LAST:event_msgKeyPressed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Server().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel con;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField msg;
    private javax.swing.JTextArea txt;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
