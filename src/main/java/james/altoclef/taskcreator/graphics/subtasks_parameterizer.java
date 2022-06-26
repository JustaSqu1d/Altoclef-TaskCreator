package james.altoclef.taskcreator.graphics;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import james.altoclef.taskcreator.MinecraftUtil;
import james.altoclef.taskcreator.customSubTask;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class subtasks_parameterizer extends JDialog {
    private JPanel main_panel;
    private JComboBox<String> item_selector;
    private JTable action_table;
    private JButton btn_add;
    private JButton btn_done;
    private JLabel l_type;
    private JComboBox<String> combo_itemCount_or_dimension;
    private JTextField tf_target;
    private JTextField tf_x;
    private JTextField tf_y;
    private JTextField tf_z;
    private JLabel l_action_preview;
    private JButton btn_remove_action;
    private int editing = -1;
    private final List<Object> params;
    private List<Object> params_readonly;
    private final String command;
    private boolean discard = true;

    public subtasks_parameterizer(String command) {
        setContentPane(main_panel);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(400, 250);
        setModal(true);
        this.command = command;
        params = new ArrayList<Object>();
        params_readonly = new ArrayList<Object>();
        initComponents();
        setVisible(true); // must always be last
    }

    public subtasks_parameterizer(customSubTask task) {
        setContentPane(main_panel);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setSize(400, 250);
        setModal(true);
        this.command = task.getType();
        params_readonly = new ArrayList<Object>();
        params = new ArrayList<Object>();
        Collections.addAll(params_readonly, task.getParameters());
        Collections.addAll(params, task.getParameters());
        if (!task.getType().equals("get")) {
            toggleContinuedAdd(false);
        }
        discard = false;
        initComponents();
        setVisible(true); // must always be last

    }

    private void initComponents() {
        setTitle("Squashed Item Task Creator");
        {
            switch (command) {
                // new subtasks registered here
                case "get" -> loadUI_items();
                case "equip" -> loadUI_items_equippable();
                case "goto" -> loadUI_coords();
                default -> loadUI();
            }

            action_table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getClickCount() == 2) {
                        if (action_table.getSelectedRow() != -1) {
                            editing = action_table.getSelectedRow();
                            toggleContinuedAdd(true);
                            btn_add.setText("Save");
                        }
                    }
                    btn_remove_action.setEnabled(action_table.getSelectedRow() != -1);
                }
            });
            action_table.addKeyListener(new KeyAdapter() {
                /**
                 * Invoked when a key has been typed. This event
                 * occurs when a key press is followed by a key
                 * release.
                 *
                 * @param e
                 */
                @Override
                public void keyTyped(KeyEvent e) {
                    super.keyTyped(e);
                    if (e.getKeyChar() == '\u001B') {
                        action_table.clearSelection();
                    }
                }
            });


            // ui settings
            btn_add.addActionListener(new ActionListener() {
                /**
                 * Invoked when an action occurs.
                 *
                 * @param e the event to be processed
                 */
                @Override
                public void actionPerformed(ActionEvent e) {
                    // This is where we add new kinds of subtasks
                    //TODO Make it so that the "X" cancels operations (right now it saves)
                    if (command.equals("get") || command.equals("equip")) {
                        if (editing != -1) {
                            params.remove(editing);
                            params.add(editing, new Object[]{item_selector.getSelectedItem(), combo_itemCount_or_dimension.getSelectedItem()});
                        } else {
                            params.add(new Object[]{item_selector.getSelectedItem(), combo_itemCount_or_dimension.getSelectedItem()});
                        }
                        toggleContinuedAdd(true);
                    } else if (command.equals("goto")) {
                        if (tf_x.getText().isEmpty() || tf_y.getText().isEmpty() || tf_z.getText().isEmpty()) {
                            AltoJsonWarning warning = new AltoJsonWarning("Parse Error", "One of the location fields is empty");
                        } else {
                            if (editing != -1) {
                                params.remove(editing);
                                params.add(editing, new Object[]{tf_x.getText(), tf_y.getText(), tf_z.getText(), combo_itemCount_or_dimension.getSelectedItem()});
                            } else {
                                params.add(new Object[]{tf_x.getText(), tf_y.getText(), tf_z.getText(), combo_itemCount_or_dimension.getSelectedItem()});
                            }
                            toggleContinuedAdd(false);
                        }
                    } else {
                        if (tf_target.getText().isEmpty()) {
                            AltoJsonWarning warning = new AltoJsonWarning("Parse Error", "The text field is empty");
                        } else {
                            if (editing != -1) {
                                params.remove(editing);
                                params.add(editing, new Object[]{tf_target.getText()});

                            } else {
                                params.add(new Object[]{tf_target.getText()});
                            }
                            toggleContinuedAdd(false);
                        }
                    }

                    editing = -1;
                    btn_add.setText("add");
                    refreshTable();
                }
            });

            btn_remove_action.addActionListener(e -> {
                if (action_table.getSelectedRow() != -1) {
                    params.remove(action_table.getSelectedRow());
                    btn_remove_action.setEnabled(false);
                    refreshTable();
                }
            });

            btn_done.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onDone();
                }
            });
        } // action listeners
        refreshTable();
    }


    private void toggleContinuedAdd(boolean b) {
        if (!b) {
            item_selector.setEnabled(false);
            combo_itemCount_or_dimension.setEnabled(false);
            tf_x.setEnabled(false);
            tf_y.setEnabled(false);
            tf_z.setEnabled(false);
            tf_target.setEnabled(false);
            btn_add.setEnabled(false);
        } else {
            item_selector.setEnabled(true);
            combo_itemCount_or_dimension.setEnabled(true);
            tf_x.setEnabled(true);
            tf_y.setEnabled(true);
            tf_z.setEnabled(true);
            tf_target.setEnabled(true);
            btn_add.setEnabled(true);
        }
    }

    private void onDone() {
        params_readonly = params;
        if (action_table.getRowCount() == 0) {
            discard = true;
        } else {
            discard = false;
        }
        dispose();
    }

    private void refreshTable() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"parameters"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        action_table.setModel(model);
        try {
            for (Object param : params) {
                Object[] param_inner = (Object[]) param; //will always be an object
                model.addRow(new String[]{Arrays.toString(param_inner)});
            }
        } catch (Exception ignored) {
            AltoJsonWarning aw = new AltoJsonWarning("Table error", "error loading table");
            aw.setVisible(true);
        }
        if (action_table.getRowCount() == 0) {
            btn_done.setEnabled(false);
            btn_remove_action.setEnabled(false);
        } else {
            btn_done.setEnabled(true);
        }

    }

    private void loadUI() {
        l_type.setText(command);
        item_selector.setVisible(false);
        btn_remove_action.setVisible(false);
        combo_itemCount_or_dimension.setVisible(false);
        tf_x.setVisible(false);
        tf_y.setVisible(false);
        tf_z.setVisible(false);
        tf_target.setVisible(true);
    }

    private void loadUI_coords() {
        l_type.setText("goto");
        item_selector.setVisible(false);
        btn_remove_action.setVisible(false);
        tf_target.setVisible(false);
        tf_x.setVisible(true);
        tf_y.setVisible(true);
        tf_z.setVisible(true);
        combo_itemCount_or_dimension.setVisible(true);
        combo_itemCount_or_dimension.addItem("overworld");
        combo_itemCount_or_dimension.addItem("nether");
        combo_itemCount_or_dimension.addItem("end");
        combo_itemCount_or_dimension.addItem(""); //whatever current dimension is

    }

    private void loadUI_items() {
        l_type.setText("get");
        btn_remove_action.setVisible(true);
        tf_x.setVisible(false);
        tf_y.setVisible(false);
        tf_z.setVisible(false);
        tf_target.setVisible(false);
        loadItemComboBoxes(false);
    }
    private void loadUI_items_equippable() {
        l_type.setText("equip");
        btn_remove_action.setVisible(true);
        tf_x.setVisible(false);
        tf_y.setVisible(false);
        tf_z.setVisible(false);
        tf_target.setVisible(false);
        loadItemComboBoxes(true);
    }

    private void loadItemComboBoxes(boolean equippableOnly) {
        if(equippableOnly){
            for (String s : MinecraftUtil.getEquippableItems()) {
                item_selector.addItem(s);
            }
            for (int i = 1; i < 65; i++) {
                combo_itemCount_or_dimension.addItem(i + "");
            }
        }else {
            for (String s : MinecraftUtil.getItems()) {
                item_selector.addItem(s);
            }
            for (int i = 1; i < 65; i++) {
                combo_itemCount_or_dimension.addItem(i + "");
            }
        }
    }


    public customSubTask getItems() {
        return new customSubTask(l_type.getText(), params_readonly.toArray());
    }

    public boolean shouldDiscard() {
        return discard;
    }

}
