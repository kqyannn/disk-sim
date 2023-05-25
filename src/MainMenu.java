public class MainMenu extends javax.swing.JPanel {
    public MainMenu() {
        initComponents();
    }

    private void initComponents() {
        exit = new javax.swing.JButton();
        minimize = new javax.swing.JButton();
        menu_run = new javax.swing.JButton();
        menu_help = new javax.swing.JButton();
        menu_about = new javax.swing.JButton();
        menu_exit = new javax.swing.JButton();
        menu_bg = new javax.swing.JLabel();

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

        menu_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/run.png"))); 
        menu_run.setBorder(null);
        menu_run.setBorderPainted(false);
        menu_run.setContentAreaFilled(false);
        menu_run.setFocusPainted(false);
        menu_run.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_runMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_runMouseExited(evt);
            }
        });
        menu_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_runActionPerformed(evt);
            }
        });
        add(menu_run);
        menu_run.setBounds(80, 240, 250, 80);

        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help.png"))); 
        menu_help.setBorder(null);
        menu_help.setBorderPainted(false);
        menu_help.setContentAreaFilled(false);
        menu_help.setFocusPainted(false);
        menu_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_helpMouseExited(evt);
            }
        });
        menu_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_helpActionPerformed(evt);
            }
        });
        add(menu_help);
        menu_help.setBounds(80, 320, 250, 80);

        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about.png"))); 
        menu_about.setBorder(null);
        menu_about.setBorderPainted(false);
        menu_about.setContentAreaFilled(false);
        menu_about.setFocusPainted(false);
        menu_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_aboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_aboutMouseExited(evt);
            }
        });
        menu_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_aboutActionPerformed(evt);
            }
        });
        add(menu_about);
        menu_about.setBounds(80, 400, 250, 80);

        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit.png"))); 
        menu_exit.setBorder(null);
        menu_exit.setBorderPainted(false);
        menu_exit.setContentAreaFilled(false);
        menu_exit.setFocusPainted(false);
        menu_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menu_exitMouseExited(evt);
            }
        });
        menu_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_exitActionPerformed(evt);
            }
        });
        add(menu_exit);
        menu_exit.setBounds(80, 480, 250, 80);

        menu_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backgrounds/background_menu.png"))); 
        menu_bg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_bg.setOpaque(true);
        add(menu_bg);
        menu_bg.setBounds(0, 0, 1080, 720);
    }

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close_hover.png")));
    }

    private void exitMouseExited(java.awt.event.MouseEvent evt) {
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/close.png")));
    }

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min_hover.png")));
    }

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/min.png")));
    }

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {
        DiskSim.mainFrame.setState(java.awt.Frame.ICONIFIED);
    }

    private void menu_helpMouseEntered(java.awt.event.MouseEvent evt) {
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help_hover.png")));
    }

    private void menu_helpMouseExited(java.awt.event.MouseEvent evt) {
        menu_help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/help.png")));
    }

    private void menu_helpActionPerformed(java.awt.event.ActionEvent evt) {
        DiskSim.card.show(DiskSim.mainPanel, "3");
    }

    private void menu_runMouseEntered(java.awt.event.MouseEvent evt) {
        menu_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/run_hover.png")));
    }

    private void menu_runMouseExited(java.awt.event.MouseEvent evt) {
        menu_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/run.png")));
    }

    private void menu_runActionPerformed(java.awt.event.ActionEvent evt) {
        DiskSim.card.show(DiskSim.mainPanel, "5");
    }

    private void menu_aboutMouseEntered(java.awt.event.MouseEvent evt) {
        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about_hover.png")));
    }

    private void menu_aboutMouseExited(java.awt.event.MouseEvent evt) {
        menu_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/about.png")));
    }

    private void menu_aboutActionPerformed(java.awt.event.ActionEvent evt) {
        DiskSim.card.show(DiskSim.mainPanel, "4");
    }

    private void menu_exitMouseEntered(java.awt.event.MouseEvent evt) {
        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit_hover.png")));
    }

    private void menu_exitMouseExited(java.awt.event.MouseEvent evt) {
        menu_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/exit.png")));
    }

    private void menu_exitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private javax.swing.JButton exit;
    private javax.swing.JButton menu_about;
    private javax.swing.JLabel menu_bg;
    private javax.swing.JButton menu_exit;
    private javax.swing.JButton menu_help;
    private javax.swing.JButton menu_run;
    private javax.swing.JButton minimize;
}
