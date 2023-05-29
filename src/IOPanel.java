import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import org.w3c.dom.events.Event;

public class IOPanel extends javax.swing.JPanel {
    public IOPanel() {
        initComponents();
    }
    int selected;
    double speed;
    final int cylinder_line = 199;
    final int req_caps = 40;
    int[] main_queue;
    int head;
    private ArrayList<Integer> temp_array;


    public void reset(){
        // speed = 1;
        // selected = 0;
        removeAll();
        initComponents();
    }

    public void initComponents() {
        
        speed = 1;
        
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        io_save_panel = new javax.swing.JPanel();
        io_save_label = new javax.swing.JLabel();
        io_save_png = new javax.swing.JButton();
        io_save_pdf = new javax.swing.JButton();
        io_directory_label = new javax.swing.JLabel();
        io_directory_input = new javax.swing.JTextField();
        io_directory_bg = new javax.swing.JLabel();
        io_return_panel = new javax.swing.JButton();
        io_save_bg = new javax.swing.JLabel();
        io_backpanel = new javax.swing.JPanel();
        io_output_panel_scroll = new javax.swing.JScrollPane();
        io_output_panel = new javax.swing.JPanel();
        io_add = new javax.swing.JButton();
        io_minus = new javax.swing.JButton();
        io_import = new javax.swing.JButton();
        io_start = new javax.swing.JButton();
        io_random = new javax.swing.JButton();
        io_save = new javax.swing.JButton();
        io_return = new javax.swing.JButton();
        io_algo_select = new javax.swing.JComboBox<>();
        io_queue_input = new javax.swing.JTextField();
        io_position_input = new javax.swing.JTextField();
        io_dot_fcfs = new javax.swing.JLabel();
        io_dot_sstf = new javax.swing.JLabel();
        io_dot_scan = new javax.swing.JLabel();
        io_dot_cscan = new javax.swing.JLabel();
        io_dot_look = new javax.swing.JLabel();
        io_dot_clook = new javax.swing.JLabel();
        io_algo_select_label = new javax.swing.JLabel();
        io_algo_label = new javax.swing.JLabel();
        io_speed_value = new javax.swing.JLabel();
        io_position_bg = new javax.swing.JLabel();
        io_speed_label = new javax.swing.JLabel();
        io_timer_label = new javax.swing.JLabel();
        io_timer_bg = new javax.swing.JLabel();
        io_speed_bg = new javax.swing.JLabel();
        io_bg = new javax.swing.JLabel();

        setEnabled(false);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setLayout(null);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close.png"))); 
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(1030, 10, 40, 30);

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min.png"))); 
        minimize.setBorder(null);
        minimize.setBorderPainted(false);
        minimize.setContentAreaFilled(false);
        minimize.setFocusPainted(false);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        add(minimize);
        minimize.setBounds(990, 10, 40, 30);

        io_save_panel.setOpaque(false);
        io_save_panel.setVisible(false);
        io_save_panel.setLayout(null);

        io_save_label.setFont(new java.awt.Font("Poppins ExtraBold", 0, 36)); 
        io_save_label.setForeground(new java.awt.Color(255, 255, 255));
        io_save_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_save_label.setText("Save as");
        io_save_label.setToolTipText("");
        io_save_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_save_panel.add(io_save_label);
        io_save_label.setBounds(250, 260, 580, 40);

        io_save_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/png.png"))); 
        io_save_png.setBorder(null);
        io_save_png.setBorderPainted(false);
        io_save_png.setContentAreaFilled(false);
        io_save_png.setFocusPainted(false);
        io_save_png.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_save_pngMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_save_pngMouseExited(evt);
            }
        });
        io_save_png.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_save_pngActionPerformed(evt);
            }
        });
        io_save_panel.add(io_save_png);
        io_save_png.setBounds(320, 380, 200, 70);

        io_save_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/pdf.png"))); 
        io_save_pdf.setBorder(null);
        io_save_pdf.setBorderPainted(false);
        io_save_pdf.setContentAreaFilled(false);
        io_save_pdf.setFocusPainted(false);
        io_save_pdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_save_pdfMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_save_pdfMouseExited(evt);
            }
        });
        io_save_pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_save_pdfActionPerformed(evt);
            }
        });
        io_save_panel.add(io_save_pdf);
        io_save_pdf.setBounds(560, 380, 200, 70);

        io_directory_label.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); 
        io_directory_label.setForeground(new java.awt.Color(255, 255, 255));
        io_directory_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        io_directory_label.setText("Enter Directory:");
        io_directory_label.setToolTipText("");
        io_directory_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_save_panel.add(io_directory_label);
        io_directory_label.setBounds(280, 290, 350, 30);

        io_directory_input.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); 
        io_directory_input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        io_directory_input.setToolTipText("");
        io_directory_input.setBorder(null);
        io_directory_input.setOpaque(false);
        io_save_panel.add(io_directory_input);
        io_directory_input.setBounds(290, 330, 500, 30);

        io_directory_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_directory_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/directory_input.png"))); 
        io_directory_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_save_panel.add(io_directory_bg);
        io_directory_bg.setBounds(250, 310, 580, 70);

        io_return_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return.png"))); 
        io_return_panel.setBorder(null);
        io_return_panel.setBorderPainted(false);
        io_return_panel.setContentAreaFilled(false);
        io_return_panel.setFocusPainted(false);
        io_return_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_return_panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_return_panelMouseExited(evt);
            }
        });
        io_return_panel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_return_panelActionPerformed(evt);
            }
        });
        io_save_panel.add(io_return_panel);
        io_return_panel.setBounds(780, 430, 80, 90);

        io_save_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/save_bg.png"))); 
        io_save_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_save_panel.add(io_save_bg);
        io_save_bg.setBounds(0, 0, 1080, 720);

        add(io_save_panel);
        io_save_panel.setBounds(0, 0, 1080, 720);

        io_backpanel.setPreferredSize(new java.awt.Dimension(1080, 720));
        io_backpanel.setLayout(null);

        io_output_panel_scroll.setBackground(new java.awt.Color(255, 255, 255));
        io_output_panel_scroll.setBorder(null);

        io_output_panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout io_output_panelLayout = new javax.swing.GroupLayout(io_output_panel);
        io_output_panel.setLayout(io_output_panelLayout);
        io_output_panelLayout.setHorizontalGroup(
            io_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        io_output_panelLayout.setVerticalGroup(
            io_output_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );



        io_output_panel_scroll.setViewportView(io_output_panel);

        io_backpanel.add(io_output_panel_scroll);
        io_output_panel_scroll.setBounds(70, 260, 940, 330);

        io_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/add.png"))); 
        io_add.setBorder(null);
        io_add.setBorderPainted(false);
        io_add.setContentAreaFilled(false);
        io_add.setFocusPainted(false);
        io_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_addMouseExited(evt);
            }
        });
        io_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_addActionPerformed(evt);
            }
        });
        io_backpanel.add(io_add);
        io_add.setBounds(790, 40, 40, 40);

        io_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/minus.png"))); 
        io_minus.setBorder(null);
        io_minus.setBorderPainted(false);
        io_minus.setContentAreaFilled(false);
        io_minus.setFocusPainted(false);
        io_minus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_minusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_minusMouseExited(evt);
            }
        });
        io_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_minusActionPerformed(evt);
            }
        });
        io_backpanel.add(io_minus);
        io_minus.setBounds(750, 40, 40, 40);

        io_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/import.png"))); 
        io_import.setBorder(null);
        io_import.setBorderPainted(false);
        io_import.setContentAreaFilled(false);
        io_import.setFocusPainted(false);
        io_import.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_importMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_importMouseExited(evt);
            }
        });
        io_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_importActionPerformed(evt);
            }
        });
        io_backpanel.add(io_import);
        io_import.setBounds(550, 90, 130, 40);

        io_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/start.png"))); 
        io_start.setBorder(null);
        io_start.setBorderPainted(false);
        io_start.setContentAreaFilled(false);
        io_start.setFocusPainted(false);
        io_start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_startMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_startMouseExited(evt);
            }
        });
        io_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_startActionPerformed(evt);
            }
        });
        io_backpanel.add(io_start);
        io_start.setBounds(840, 40, 140, 120);

        io_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/random.png"))); 
        io_random.setBorder(null);
        io_random.setBorderPainted(false);
        io_random.setContentAreaFilled(false);
        io_random.setFocusPainted(false);
        io_random.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_randomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_randomMouseExited(evt);
            }
        });
        io_random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_randomActionPerformed(evt);
            }
        });
        io_backpanel.add(io_random);
        io_random.setBounds(680, 90, 140, 40);

        io_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/save.png"))); 
        io_save.setBorder(null);
        io_save.setBorderPainted(false);
        io_save.setContentAreaFilled(false);
        io_save.setFocusPainted(false);
        io_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_saveMouseExited(evt);
            }
        });
        io_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_saveActionPerformed(evt);
            }
        });
        io_backpanel.add(io_save);
        io_save.setBounds(800, 610, 80, 90);

        io_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return.png"))); 
        io_return.setBorder(null);
        io_return.setBorderPainted(false);
        io_return.setContentAreaFilled(false);
        io_return.setFocusPainted(false);
        io_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                io_returnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                io_returnMouseExited(evt);
            }
        });
        io_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                io_returnActionPerformed(evt);
            }
        });
        io_backpanel.add(io_return);
        io_return.setBounds(880, 610, 80, 90);

        io_algo_select.setBackground(new java.awt.Color(197, 211, 221));
        io_algo_select.setFont(new java.awt.Font("Poppins SemiBold", 0, 11)); 
        io_algo_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Come First Serve", "Shortest Seek Time First", "Scan", "C-Scan", "Look", "C-Look" }));
        io_algo_select.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                io_algoSelectActionPerformed(evt);
            }

            public void io_algoSelectActionPerformed(ActionEvent evt) {
             System.out.println(io_algo_select.getSelectedItem().toString());
            //1. FCFS, 2. SSTF, 3. SCAN 4.C-SCAN 5. LOOK 6. C-LOOK
            int index = io_algo_select.getSelectedIndex();
            int x = 220;
            int y = 20;
            int width = 300;
            int height = 110;
            set_dot(index);
            //[x=220,y=20,width=300,height=110]
            switch(index){
                
                case 0:
                    io_algo_label.setText("FCFS");
                    io_algo_label.setBounds(x+50, y, width, height);
                    
                break;
                case 1:
                    io_algo_label.setText("SSTF");
                    io_algo_label.setBounds(x+50, y, width, height);
                break;
                case 2:
                    io_algo_label.setText("SCAN");
                    io_algo_label.setBounds(x+50, y, width, height);
                break;
                case 3:
                    io_algo_label.setText("C-SCAN");
                    io_algo_label.setBounds(x, y, width, height);
                break;
                case 4:
                    io_algo_label.setText("LOOK");
                    io_algo_label.setBounds(x+50, y, width, height);
                break;
                case 5:
                    io_algo_label.setText("C-LOOK");
                    io_algo_label.setBounds(x, y, width, height);
                break;
            }

            }
        });
        io_algo_select.setBorder(null);
        io_backpanel.add(io_algo_select);
        io_algo_select.setBounds(40, 60, 170, 30);

        io_queue_input.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); 
        io_queue_input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        io_queue_input.setToolTipText("");
        io_queue_input.setBorder(null);
        io_queue_input.setOpaque(false);
        io_backpanel.add(io_queue_input);
        io_queue_input.setBounds(180, 180, 360, 30);

        io_position_input.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); 
        io_position_input.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        io_position_input.setToolTipText("");
        io_position_input.setBorder(null);
        io_position_input.setOpaque(false);
        io_backpanel.add(io_position_input);
        io_position_input.setBounds(770, 180, 90, 30);

        io_dot_fcfs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        
        io_dot_fcfs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_fcfs);
        io_dot_fcfs.setBounds(40, 100, 20, 20);
        set_dot(0);

        io_dot_sstf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        io_dot_sstf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_sstf);
        io_dot_sstf.setBounds(70, 100, 20, 20);

        io_dot_scan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        io_dot_scan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_scan);
        io_dot_scan.setBounds(100, 100, 20, 20);

        io_dot_cscan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        io_dot_cscan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_cscan);
        io_dot_cscan.setBounds(130, 100, 20, 20);

        io_dot_look.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        io_dot_look.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_look);
        io_dot_look.setBounds(160, 100, 20, 20);

        io_dot_clook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png"))); 
        io_dot_clook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_dot_clook);
        io_dot_clook.setBounds(190, 100, 20, 20);

        io_algo_select_label.setFont(new java.awt.Font("Poppins ExtraBold", 0, 16)); 
        io_algo_select_label.setForeground(new java.awt.Color(197, 211, 221));
        io_algo_select_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_algo_select_label.setText("SELECT ALGO");
        io_algo_select_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_algo_select_label);
        io_algo_select_label.setBounds(40, 30, 170, 30);

        io_algo_label.setFont(new java.awt.Font("Poppins ExtraBold", 0, 66)); 
        io_algo_label.setForeground(new java.awt.Color(106, 171, 240));
        io_algo_label.setText("FCFS");
        io_algo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_algo_label);
        io_algo_label.setBounds(270, 20, 300, 110);

        io_speed_value.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); 
        io_speed_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_speed_value.setText(String.valueOf(speed) + "x");
        io_speed_value.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_speed_value);
        io_speed_value.setBounds(690, 40, 50, 40);

        io_position_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_position_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/position.png"))); 
        io_position_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_position_bg);
        io_position_bg.setBounds(560, 170, 310, 50);

        io_speed_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_speed_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/queue.png"))); 
        io_speed_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_speed_label);
        io_speed_label.setBounds(30, 170, 530, 50);

        io_timer_label.setFont(new java.awt.Font("Poppins ExtraBold", 0, 14)); 
        io_timer_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_timer_label.setText("0");
        io_timer_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_timer_label);
        io_timer_label.setBounds(940, 190, 70, 30);

        io_timer_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_timer_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/timer.png"))); 
        io_timer_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_timer_bg);
        io_timer_bg.setBounds(880, 170, 150, 70);

        io_speed_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        io_speed_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/speed_bg.png"))); 
        io_speed_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_backpanel.add(io_speed_bg);
        io_speed_bg.setBounds(550, 30, 200, 60);

        io_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/background_IO.png"))); 
        io_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        io_bg.setOpaque(true);
        io_backpanel.add(io_bg);
        io_bg.setBounds(0, 0, 1080, 720);

        add(io_backpanel);
        io_backpanel.setBounds(0, 0, 1080, 720);
    }

    public void set_dot(int i) {
//1. FCFS, 2. SSTF, 3. SCAN 4.C-SCAN 5. LOOK 6. C-LOOK
        switch(i){
            case 0:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            break;

            case 1:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            break;

            case 2:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            break;

            case 3:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            break;


            case 4:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            break;


            case 5:
            io_dot_fcfs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_sstf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_look.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_clook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_scan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot.png")));
            io_dot_cscan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/dot_selected.png")));
            break;


        }
        

    }

    public void exitMouseEntered(java.awt.event.MouseEvent evt) {                                  
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_hover.png")));
    }                                 

    public void exitMouseExited(java.awt.event.MouseEvent evt) {                                 
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close.png")));
    }                                

    public void exitActionPerformed(java.awt.event.ActionEvent evt) {          
        Music.sfx();                           
        System.exit(0);
    }                                    

    public void minimizeMouseEntered(java.awt.event.MouseEvent evt) {                                      
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_hover.png")));
    }                                     

    public void minimizeMouseExited(java.awt.event.MouseEvent evt) {                                     
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min.png")));
    }                                    

    public void minimizeActionPerformed(java.awt.event.ActionEvent evt) {          
        Music.sfx();                               
        DiskSim.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }                                        

    public void io_returnMouseEntered(java.awt.event.MouseEvent evt) {                                       
        io_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_hover.png")));
    }                                      

    public void io_returnMouseExited(java.awt.event.MouseEvent evt) {                                      
        io_return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return.png")));
    }                                     

    public void io_returnActionPerformed(java.awt.event.ActionEvent evt) {  
        Music.sfx();                                        
        reset();
        DiskSim.card.show(DiskSim.mainPanel, "2");
    }                                         

    public void io_saveMouseEntered(java.awt.event.MouseEvent evt) {                                     
        io_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/save_hover.png")));
    }                                    

    public void io_saveMouseExited(java.awt.event.MouseEvent evt) {                                    
        io_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/save.png")));
    }                                   

    public void io_saveActionPerformed(java.awt.event.ActionEvent evt) {    
        Music.sfx();                                    
        setPanelEnabled(io_backpanel, false);
        io_save_panel.setVisible(true);
    }                                       

    public void io_addMouseEntered(java.awt.event.MouseEvent evt) {                                    
        io_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/add_hover.png")));
    }                                   

    public void io_addMouseExited(java.awt.event.MouseEvent evt) {                                   
        io_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/add.png")));
    }                                  

    public void io_addActionPerformed(java.awt.event.ActionEvent evt) {                                       
        Music.sfx();
        if(speed < 2.5){
            speed += 0.5;
            io_speed_value.setText(String.valueOf(speed));
        }
        else{
            speed = 2.5;
            io_speed_value.setText(String.valueOf(speed));
        }

    }                                      

    public void io_minusMouseEntered(java.awt.event.MouseEvent evt) {                                      
        io_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/minus_hover.png")));
    }                                     

    public void io_minusMouseExited(java.awt.event.MouseEvent evt) {                                     
        io_minus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/minus.png")));
    }                                    

    public void io_minusActionPerformed(java.awt.event.ActionEvent evt) {       
        Music.sfx();
        Music.sfx();
        if(speed > 0.5){
            speed -= 0.5;
            io_speed_value.setText(String.valueOf(speed));
        }
        else{
            speed = 0.5;
            io_speed_value.setText(String.valueOf(speed));
        }

    }                                        

    public void io_importMouseEntered(java.awt.event.MouseEvent evt) {                                       
        io_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/import_hover.png")));
    }                                      

    public void io_importMouseExited(java.awt.event.MouseEvent evt) {                                      
        io_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/import.png")));
    }                                     

    public void io_importActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Music.sfx();
        System.out.println("importing");

        String queueline;


        io_queue_input.setText("");

        final JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File file = fc.getSelectedFile();
        import_ArrayList = new ArrayList<Integer>();
        try(Scanner read = new Scanner(file)) {

            queueline = read.nextLine();

            Scanner read2 = new Scanner(queueline);
            read2.next();
            while(read2.hasNext()){ 
              if(io_queue_input.getText().equals("")){
                io_queue_input.setText(read2.next());
              }
              else{
                io_queue_input.setText(io_queue_input.getText() + " " + read2.next());
              }

            }

           read.next();
           io_position_input.setText(read.next());
            // System.out.println(import_ArrayList);
            
            
           
            
        } catch (Exception e) {
            System.out.println(e);
            // TODO: handle exception
        }


    }                                         

    public void io_randomMouseEntered(java.awt.event.MouseEvent evt) {                                       
        io_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/random_hover.png")));
    }                                      

    public void io_randomMouseExited(java.awt.event.MouseEvent evt) {                                      
        io_random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/random.png")));
    }                                     
    
    public void io_randomActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Music.sfx();
        
        int[] random_array;

        Random rand = new Random();
        
        int len = rand.nextInt(10) + 3;
        System.out.println(len);
        
        random_array = new int[len];
        io_queue_input.setText("");

        for(int i = 0; i < len; i++){
            random_array[i] = rand.nextInt(199);

            if(io_queue_input.getText().equals("")){
                io_queue_input.setText(String.valueOf(random_array[i]));
            }
            else{
                io_queue_input.setText(io_queue_input.getText() + " " + String.valueOf(random_array[i]));
            }
            
        }

        io_position_input.setText(String.valueOf(random_array[rand.nextInt(random_array.length)]));

    }                                         

    public void io_startMouseEntered(java.awt.event.MouseEvent evt) {                                      
        io_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/start_hover.png")));
    }                                     

    public void io_startMouseExited(java.awt.event.MouseEvent evt) {                                     
        io_start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/start.png")));
    }                                    

    public void io_startActionPerformed(java.awt.event.ActionEvent evt) {               
        System.out.println("RUN");
        temp_array = new ArrayList<Integer>();
        try(Scanner read = new Scanner(io_queue_input.getText())) {

            
            // int i = 0;
            while(read.hasNext()){
                temp_array.add(read.nextInt());
            }

            // System.out.println(temp_array + " from arraylist");

            main_queue = new int[temp_array.size()];
            
            for(int i = 0; i < temp_array.size(); i++){
                main_queue[i] = temp_array.get(i);
                // System.out.println(main_queue[i] + " from array");
            }
            
            head = Integer.valueOf(io_position_input.getText());
            // System.out.println(head);

            ArrayList<Integer> sequence = new ArrayList<>();
            ArrayList<Integer> temp_results = new ArrayList<>();

            //main queue and head is set
            sequence.add(head);
            temp_results.add(head);
            for(int i = 0; i < main_queue.length; i++){
                sequence.add(main_queue[i]);
            }
            int [] results = new int[sequence.size() + 1];

            String direction = "right";
            int choose = io_algo_select.getSelectedIndex();
            // System.out.println(choose);
            switch(choose){
                case 0:
                System.out.println("FCFS");
                // results[0] = head;
                results = DiskAlgos.FCFS(main_queue, head);
                for(int i = 0; i < results.length; i++){
                    temp_results.add(results[i]);
                }

                results = new int[temp_results.size()];
                for(int i = 0; i < temp_results.size(); i++){
                    results[i] = temp_results.get(i);
                }
                

                break;

                case 1:
                System.out.println("SSTF");
                DiskAlgos.SSTF(main_queue, head);
                break;

                case 2:
                System.out.println("SCAN");
                DiskAlgos.SCAN(main_queue, head, direction);
                break;

                case 3:
                System.out.println("CSCAN");
                DiskAlgos.CSCAN(main_queue, head);
                break;

                case 4:
                System.out.println("LOOK");
                DiskAlgos.LOOK(main_queue, head, direction);
                break;

                case 5:
                System.out.println("CLOOK");
                DiskAlgos.CLOOK(main_queue, head);
                break;
            }
            

            int start = 0;

            // System.out.print("Enter the end value: ");
            int end = 199;
    
            // ArrayList<Integer> sequence = new ArrayList<>();
            // int[] array = {53,98,183,37,122,14,124,65,67};
            // int head = 53;
            // int[] results = {53,98,183,37,122,14,124,65,67};
            // for(int i = 0; i < array.length; i++){
            //     sequence.add(array[i]);
            // }
            numberline = new NumberLineDrawing(start, end, sequence, results, head);
            // numberline.setAutoscrolls(true);
            
           
            numberline.setPreferredSize(new Dimension(920, main_queue.length + 500));
            // numberline.setBounds(getX(), getY(), 200, 200);
            // io_output_panel.add(numberline);
            // io_output_panel_scroll.add(numberline);
            // io_output_panel_scroll.setViewportView(numberline);
            // numberline.setBackground(Color.red);
            // System.out.println(io_output_panel_scroll.getBounds());
            // JScrollPane scrollPane = new JScrollPane(numberline);
            // scrollPane.setBounds(100,100,numberline.true_width, 330);
            // scrollPane.setBackground(Color.red);
            // add(scrollPane);
            io_output_panel_scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            io_output_panel_scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
           io_output_panel_scroll.setViewportView(numberline);

            
        } catch (Exception e) {
            // TODO: handle exception
        }
        Music.sfx();

    }                                        

    public void io_save_pngMouseEntered(java.awt.event.MouseEvent evt) {                                         
        io_save_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/png_hover.png")));
    }                                        

    public void io_save_pngMouseExited(java.awt.event.MouseEvent evt) {                                        
        io_save_png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/png.png")));
    }                                       

    public void io_save_pngActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Music.sfx();

    }                                           

    public void io_save_pdfMouseEntered(java.awt.event.MouseEvent evt) {                                         
        io_save_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/pdf_hover.png")));
    }                                        

    public void io_save_pdfMouseExited(java.awt.event.MouseEvent evt) {                                        
        io_save_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/io_panel/pdf.png")));
    }                                       

    public void io_save_pdfActionPerformed(java.awt.event.ActionEvent evt) {                                            
        Music.sfx();

    }                                           

    public void io_return_panelMouseEntered(java.awt.event.MouseEvent evt) {                                             
        io_return_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return_hover.png")));
    }                                            

    public void io_return_panelMouseExited(java.awt.event.MouseEvent evt) {                                            
        io_return_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/return.png")));
    }                                           

    public void io_return_panelActionPerformed(java.awt.event.ActionEvent evt) {     
        Music.sfx();                                           
        setPanelEnabled(io_backpanel, true);
        io_save_panel.setVisible(false);
    }                                               

     void setPanelEnabled(javax.swing.JPanel panel, Boolean isEnabled) {
        panel.setEnabled(isEnabled);
        java.awt.Component[] components = panel.getComponents();
    
        for (java.awt.Component component : components) {
            if (component instanceof javax.swing.JPanel)
                setPanelEnabled((javax.swing.JPanel) component, isEnabled);
            component.setEnabled(isEnabled);
        }
    }
                 
    public javax.swing.JButton exit;
    public javax.swing.JButton io_add;
    public javax.swing.JLabel io_algo_label;
    public javax.swing.JComboBox<String> io_algo_select;
    public javax.swing.JLabel io_algo_select_label;
    public javax.swing.JPanel io_backpanel;
    public javax.swing.JLabel io_bg;
    public javax.swing.JLabel io_directory_bg;
    public javax.swing.JTextField io_directory_input;
    public javax.swing.JLabel io_directory_label;
    public javax.swing.JLabel io_dot_clook;
    public javax.swing.JLabel io_dot_cscan;
    public javax.swing.JLabel io_dot_fcfs;
    public javax.swing.JLabel io_dot_look;
    public javax.swing.JLabel io_dot_scan;
    public javax.swing.JLabel io_dot_sstf;
    public javax.swing.JButton io_import;
    public javax.swing.JButton io_minus;
    public javax.swing.JPanel io_output_panel;
    public javax.swing.JScrollPane io_output_panel_scroll;
    public javax.swing.JLabel io_position_bg;
    public javax.swing.JTextField io_position_input;
    public javax.swing.JLabel io_speed_value;
    public javax.swing.JTextField io_queue_input;
    public javax.swing.JButton io_random;
    public javax.swing.JButton io_return;
    public javax.swing.JButton io_return_panel;
    public javax.swing.JButton io_save;
    public javax.swing.JLabel io_save_bg;
    public javax.swing.JLabel io_save_label;
    public javax.swing.JPanel io_save_panel;
    public javax.swing.JButton io_save_pdf;
    public javax.swing.JButton io_save_png;
    public javax.swing.JLabel io_speed_bg;
    public javax.swing.JLabel io_speed_label;
    public javax.swing.JButton io_start;
    public javax.swing.JLabel io_timer_bg;
    public javax.swing.JLabel io_timer_label;
    public javax.swing.JButton minimize;             
    public ArrayList<Integer> import_ArrayList;
    public NumberLineDrawing numberline;
}
