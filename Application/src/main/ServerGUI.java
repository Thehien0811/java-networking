package main;

import javax.swing.*;
import java.awt.*;

public class ServerGUI extends JFrame {
    private JTextField eventNameField;
    private JTextField dateField;
    private JTextField[] startTimeFields;
    private JTextField[] endTimeFields;
    private JTextField[] rowsFields;
    private JTextField[] seatsPerRowFields;
    private JTextField[] priceFields;
    private JButton saveButton;
    private JButton exitButton;

    public ServerGUI() {
        setTitle("Quản lý sự kiện - Server");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel eventPanel = createEventPanel();
        JPanel stagePanel = createStagePanel();
        JPanel pricePanel = createPricePanel();
        JPanel buttonPanel = createButtonPanel();

        add(eventPanel, BorderLayout.NORTH);
        add(stagePanel, BorderLayout.CENTER);
        add(pricePanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel createEventPanel() {
        JPanel eventPanel = new JPanel(new GridLayout(3, 2));
        eventPanel.setBorder(BorderFactory.createTitledBorder("Thông tin sự kiện"));

        JLabel eventNameLabel = new JLabel("Tên sự kiện:");
        eventNameField = new JTextField(20);
        JLabel dateLabel = new JLabel("Ngày diễn ra:");
        dateField = new JTextField(10);

        eventPanel.add(eventNameLabel);
        eventPanel.add(eventNameField);
        eventPanel.add(dateLabel);
        eventPanel.add(dateField);

        return eventPanel;
    }

    private JPanel createStagePanel() {
        JPanel stagePanel = new JPanel(new GridLayout(6, 2));
        stagePanel.setBorder(BorderFactory.createTitledBorder("Thông tin sân khấu"));

        JLabel stageLabel = new JLabel("Số lượng khu/khán đài:");
        JTextField stageField = new JTextField(5);
        stagePanel.add(stageLabel);
        stagePanel.add(stageField);

        rowsFields = new JTextField[5];
        seatsPerRowFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            rowsFields[i] = new JTextField(5);
            seatsPerRowFields[i] = new JTextField(5);
            stagePanel.add(new JLabel("Khu " + (i + 1) + ":"));
            stagePanel.add(new JLabel("Hàng x Ghế:"));
            stagePanel.add(rowsFields[i]);
            stagePanel.add(seatsPerRowFields[i]);
        }

        return stagePanel;
    }

    private JPanel createPricePanel() {
        JPanel pricePanel = new JPanel(new GridLayout(4, 2));
        pricePanel.setBorder(BorderFactory.createTitledBorder("Giá vé"));

        priceFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            priceFields[i] = new JTextField(10);
            pricePanel.add(new JLabel("Khu " + (i + 1) + ":"));
            pricePanel.add(priceFields[i]);
        }

        return pricePanel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        saveButton = new JButton("Lưu cấu hình");
        exitButton = new JButton("Đóng chương trình");
        buttonPanel.add(saveButton);
        buttonPanel.add(exitButton);
        return buttonPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ServerGUI::new);
    }
}

