package Lan_Chat_and_File_Sharing;

import data.Data;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Client extends javax.swing.JFrame {

    public Client() {
        initComponents();
    }

    public JTextArea getTextField() {
        return txt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        conn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        msg = new javax.swing.JTextField();
        txtIp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("File_Client");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(153, 255, 204));

        conn.setBackground(new java.awt.Color(255, 0, 51));
        conn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        conn.setText("Connect");
        conn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connMouseClicked(evt);
            }
        });
        conn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connActionPerformed(evt);
            }
        });

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(204, 204, 204));
        txt.setColumns(20);
        txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("File");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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

        txtIp.setBackground(new java.awt.Color(204, 226, 255));
        txtIp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("IP");

        list.setBackground(new java.awt.Color(204, 204, 204));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\wsakr\\Desktop\\8\\Computer Networking Lab\\Project\\Code\\logo2.png")); // NOI18N

        con.setBackground(new java.awt.Color(241, 255, 255));
        con.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        con.setForeground(new java.awt.Color(51, 0, 51));
        con.setText("Message");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("File List");

        user.setBackground(new java.awt.Color(204, 255, 204));
        user.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(255, 0, 0));
        user.setText("No one is connected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 74, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(con)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIp)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(conn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(user)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Socket socket;
    public ObjectOutputStream out;
    public DataOutputStream out2;
    public DataInputStream input;
    public DataOutputStream dos;
    public DataInputStream dis;
    public DefaultListModel mod = new DefaultListModel();


    private void connActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connActionPerformed
        try {
            socket = new Socket(txtIp.getText().trim(), 9999);
            conn.setBackground(new java.awt.Color(0, 255, 102));
            jButton2.setBackground(new java.awt.Color(0, 255, 102));
            txt.setBackground(new java.awt.Color(235, 251, 244));
            list.setModel(mod);
            list.setBackground(new java.awt.Color(204, 255, 204));
            conn.setText("Connected");
            out = new ObjectOutputStream(socket.getOutputStream());
            Data data = new Data();
            data.setStatus("new");
            data.setName("Washim Akram");
            out.writeObject(data);
            out.flush();
            if (socket.isConnected()) {
                user.setText("Connected to server: " + socket.getInetAddress());
                user.setForeground(Color.magenta);
            }
            if (!socket.isConnected()) {
                user.setText("Disconnected to server: " + socket.getInetAddress());
                user.setForeground(Color.red);
            }
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            txt.setText(txt.getText() + " Server says: : " + dis.readUTF() + "\n");
            Thread t = new clientHelper(socket, dis, dos, txt);
            t.start();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_connActionPerformed

    public void run() throws IOException {
        //System.out.println("Inside run2");
        try {
            dis = new DataInputStream(socket.getInputStream());
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (true) {
            String rec = "";
            rec = dis.readUTF();
            if (!rec.equals("")) {
                try {
                    txt.setText(txt.getText() + " Server says: : " + dis.readUTF() + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF("File");
            //check again and again the server is connected or not and update the status
            if (socket.isConnected()) {
                user.setText("Connected to server: " + socket.getInetAddress());
                user.setForeground(Color.magenta);
            }
            if (!socket.isConnected()) {
                user.setText("Disconnected to server: " + socket.getInetAddress());
                user.setForeground(Color.red);
            }

            JFileChooser ch = new JFileChooser();
            int c = ch.showOpenDialog(this);
            if (c == JFileChooser.APPROVE_OPTION) {
                File f = ch.getSelectedFile();
                String filename = ch.getSelectedFile().getName();

                String extension = "";

                int filetype = filename.lastIndexOf('.');
                if (filetype > 0) {
                    extension = filename.substring(filetype + 1);
                }

                FileInputStream in = new FileInputStream(f);
                byte b[] = new byte[in.available()];
                in.read(b);
                Data data = new Data();
                data.setName(filename);

                data.setFile(b);
                //System.out.println("this level");
                out.writeObject(data);
                mod.addElement(filename);
                out.flush();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void msgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgActionPerformed

    }//GEN-LAST:event_msgActionPerformed

    private void msgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msgKeyPressed

        if (socket.isConnected()) {
            user.setText("Connected to server: " + socket.getInetAddress());
            user.setForeground(Color.magenta);
        }
        if (!socket.isConnected()) {
            user.setText("Disconnected to server: " + socket.getInetAddress());
            user.setForeground(Color.red);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String send = "";
                send = msg.getText();
                dos = new DataOutputStream(socket.getOutputStream());
                dis = new DataInputStream(socket.getInputStream());
                dos.writeUTF(send);
                msg.setText(send);
                txt.setText(txt.getText() + " Client says: : " + send + "\n");
                msg.setText("");
            } catch (IOException ex) {
                System.out.println("Error Occuring");;
            }
        }
    }//GEN-LAST:event_msgKeyPressed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if (evt.getClickCount() == 2) {
            if (evt.getClickCount() == 2) {
                if (!list.isSelectionEmpty()) {
                    if (SwingUtilities.isLeftMouseButton(evt)) {
                        //open();
                    } else if (SwingUtilities.isRightMouseButton(evt)) {
                        save();
                    }

                }
            }
        }
    }//GEN-LAST:event_listMouseClicked

    private void connMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connMouseClicked

    }//GEN-LAST:event_connMouseClicked
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel con;
    private javax.swing.JButton conn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> list;
    private javax.swing.JTextField msg;
    public javax.swing.JTextArea txt;
    private javax.swing.JTextField txtIp;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

class clientHelper extends Thread {

    final Socket soc;
    final DataInputStream input;
    final DataOutputStream output;
    final JTextArea txt;
    private ObjectOutputStream dout;
    private ObjectInputStream din;

    public clientHelper(Socket s, DataInputStream dis, DataOutputStream dos, JTextArea tx) {
        this.soc = s;
        this.output = dos;
        this.input = dis;
        this.txt = tx;
    }

    @Override
    public void run() {
        txt.setText("");
        while (true) {
            try {
                while(true){
                    //txt.apends(txt.getText() + " Server says: : " + input.readUTF() + "\n");
                    txt.append(" Server says: : " + input.readUTF() + "\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(clientHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}

