import java.util.ArrayList;
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        screen = new javax.swing.JTextField();
        num2 = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        multuply = new javax.swing.JButton();
        addUp = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        buttonResult = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kitty = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 245));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(486, 642));

        screen.setEditable(false);
        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        screen.setForeground(new java.awt.Color(51, 51, 51));
        screen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        num2.setBackground(new java.awt.Color(255, 199, 221));
        num2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num2.setForeground(new java.awt.Color(51, 51, 51));
        num2.setText("2");
        num2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num1.setBackground(new java.awt.Color(255, 199, 221));
        num1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num1.setForeground(new java.awt.Color(51, 51, 51));
        num1.setText("1");
        num1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num3.setBackground(new java.awt.Color(255, 199, 221));
        num3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num3.setForeground(new java.awt.Color(51, 51, 51));
        num3.setText("3");
        num3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num6.setBackground(new java.awt.Color(255, 199, 221));
        num6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num6.setForeground(new java.awt.Color(51, 51, 51));
        num6.setText("6");
        num6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num5.setBackground(new java.awt.Color(255, 199, 221));
        num5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num5.setForeground(new java.awt.Color(51, 51, 51));
        num5.setText("5");
        num5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num4.setBackground(new java.awt.Color(255, 199, 221));
        num4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num4.setForeground(new java.awt.Color(51, 51, 51));
        num4.setText("4");
        num4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num7.setBackground(new java.awt.Color(255, 199, 221));
        num7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num7.setForeground(new java.awt.Color(51, 51, 51));
        num7.setText("7");
        num7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setBackground(new java.awt.Color(255, 199, 221));
        num8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num8.setForeground(new java.awt.Color(51, 51, 51));
        num8.setText("8");
        num8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(255, 199, 221));
        buttonClear.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(51, 51, 51));
        buttonClear.setText("CL");
        buttonClear.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(255, 199, 221));
        num9.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num9.setForeground(new java.awt.Color(51, 51, 51));
        num9.setText("9");
        num9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        multuply.setBackground(new java.awt.Color(255, 199, 221));
        multuply.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        multuply.setForeground(new java.awt.Color(51, 51, 51));
        multuply.setText("x");
        multuply.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        multuply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multuplyActionPerformed(evt);
            }
        });

        addUp.setBackground(new java.awt.Color(255, 199, 221));
        addUp.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        addUp.setForeground(new java.awt.Color(51, 51, 51));
        addUp.setText("+");
        addUp.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUpActionPerformed(evt);
            }
        });

        subtract.setBackground(new java.awt.Color(255, 199, 221));
        subtract.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        subtract.setForeground(new java.awt.Color(51, 51, 51));
        subtract.setText("-");
        subtract.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });

        buttonResult.setBackground(new java.awt.Color(255, 199, 221));
        buttonResult.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        buttonResult.setForeground(new java.awt.Color(51, 51, 51));
        buttonResult.setText("=");
        buttonResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResultActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 199, 221));
        divide.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        divide.setForeground(new java.awt.Color(51, 51, 51));
        divide.setText("/");
        divide.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        num0.setBackground(new java.awt.Color(255, 199, 221));
        num0.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        num0.setForeground(new java.awt.Color(51, 51, 51));
        num0.setText("0");
        num0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ei-gatinha-50.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ei-gatinha-50.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ei-gatinha-50.png"))); // NOI18N

        kitty.setBackground(new java.awt.Color(255, 199, 221));
        kitty.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        kitty.setForeground(new java.awt.Color(51, 51, 51));
        kitty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-ei-gatinha-50.png"))); // NOI18N
        kitty.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(kitty, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(addUp, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(multuply, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(buttonResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 48, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(jLabel2)
                    .addContainerGap(382, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(419, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(66, 66, 66)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(419, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(16, 16, 16)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtract, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multuply, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitty, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonResult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel2)
                    .addContainerGap(582, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(576, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(576, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ArrayList<Integer> numbers = new ArrayList<Integer>();//coleta em int os numeros digitados
    private ArrayList<Integer> equation = new ArrayList<Integer>();//coleta os numeros já tratados para fazer as contas
    private ArrayList<Character> operators = new ArrayList<Character>(); //coleta os operadores
    private int total;
    private int numbersParsed;
    private boolean numberProcessed = false;
    
    private void clean(){
        screen.setText("");
        numbers.clear();
        equation.clear();
        operators.clear();
        numbersParsed = 0;
        total = 0;
    }
    
    private void buttons(javax.swing.JButton bt) {
        if (bt.isEnabled()) {
            screen.setText(screen.getText() + bt.getText());
            numbersParsed = Integer.parseInt(bt.getText());
            numbers.add(numbersParsed);
        }
    }
        
    private  ArrayList<Integer>  numTreatment(ArrayList<Integer> numbers, ArrayList<Integer> equation) {//transforma os numeros na tela (char) em int
        int j = 1;
        int sum = 0;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            sum += numbers.get(i) * j;
            j *= 10;
        }
 
        numbers.clear();
        equation.add(sum);  
        numberProcessed = true;

        return equation;
    }

    private int numTreat(String text, ArrayList<Integer> numbers){
        boolean foundOperator = false;
        for(int i = text.length() - 1; i >= 0; i--){
            char c = text.charAt(i);

            if(c == '+' || c == 'x' || c == '/' || c == '-'){
                if (i == 0) {
                    numTreatment(numbers, equation);
                    equation.set(equation.size() - 1, 0-equation.get(equation.size() - 1)); // resulta em zero se começar com um operador
                    System.out.println(equation);
                }else{
                    if(text.charAt(i - 1) == '+' || text.charAt(i - 1) == 'x' || text.charAt(i - 1) == '/' || text.charAt(i - 1) == '-'){
                        continue; //não está realiando operações do tipo 5*-1
                    }else{
                        numTreatment(numbers, equation);
                    }
                }
                operators.add(c);
                numberProcessed = false;
                foundOperator = true;
//                System.out.println(operators);
                break;
            }
        }

        if(!foundOperator){
            if(text.charAt(0) == '-'){
                numTreatment(numbers, equation);
                equation.set(equation.size() - 1, 0-equation.get(equation.size() - 1));
            }
        }
//        System.out.println(equation);
        
        return 0;
    }

    private int results(ArrayList<Character> operators, ArrayList<Integer> equation, int total) {
        numTreatment(numbers, equation);
        for (int i = operators.size() - 1; i >= 0; i--) {
            char operator = operators.get(i);

            if(operator == 'x' || operator == '/'){
                if(i + 1 <= equation.size()-1){
                    int num1 = equation.get(i);
                    int num2 = equation.get(i+1);

                    if(operator == 'x'){
                        total = num1 * num2;
                    }else{
                        if (num2 != 0) {
                            total = num1 / num2;
                        } else {
                            javax.swing.SwingUtilities.invokeLater(() -> screen.setText("ERRO"));
                            return -1;
                        }
                    }

                    equation.set(i, total);
                    equation.remove(i+1);
                    operators.remove(i);
                }else{
                    break;
                }
            }
        }

        for(int i = 0; i < operators.size(); i++){
            int num1 = equation.get(i);
            int num2 = equation.get(i + 1);
            char operator = operators.get(i);

            switch(operator){
                case '+':
                    total = num1 + num2;
                    break;
                case '-':
                    total = num1 - num2;
                    break;
                default:
                    javax.swing.SwingUtilities.invokeLater(() -> screen.setText("Syntax ERROR")); 
                    return total;
            }
            equation.set(i+1, total);
            equation.remove(i);
            operators.remove(i);
            i--;
        }


        equation.clear();
        operators.clear();
        numbers.add(total);
        System.out.println("Total final = " + total);
        return total;
    }
    
    
    private void addUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUpActionPerformed
        screen.setText(screen.getText() + "+");
        numTreat(screen.getText(), numbers);
    }//GEN-LAST:event_addUpActionPerformed

    private void buttonResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResultActionPerformed
        int finalR = results(operators, equation, total);
        screen.setText(Integer.toString(finalR));
        total = finalR;
    }//GEN-LAST:event_buttonResultActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        buttons(num1);
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        buttons(num2);
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
       buttons(num3);
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        buttons(num4);
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        buttons(num5);
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        buttons(num6);
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        buttons(num7);
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        buttons(num8);
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        buttons(num9);
    }//GEN-LAST:event_num9ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        if (buttonClear.isEnabled()){
            clean();
        }
    }//GEN-LAST:event_buttonClearActionPerformed

    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        screen.setText(screen.getText() + "-");
        numTreat(screen.getText(), numbers);
    }//GEN-LAST:event_subtractActionPerformed

    private void multuplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multuplyActionPerformed
        screen.setText(screen.getText() + "x");
        numTreat(screen.getText(), numbers);
    }//GEN-LAST:event_multuplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        screen.setText(screen.getText() + "/");
        numTreat(screen.getText(), numbers);
    }//GEN-LAST:event_divideActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        buttons(num0);
    }//GEN-LAST:event_num0ActionPerformed
 
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUp;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonResult;
    private javax.swing.JButton divide;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kitty;
    private javax.swing.JButton multuply;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField screen;
    private javax.swing.JButton subtract;
    // End of variables declaration//GEN-END:variables
}
