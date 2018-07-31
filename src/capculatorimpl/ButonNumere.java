package capculatorimpl;
import javax.swing.JButton;
import javax.swing.JTextArea;

import interfaceimpl.Comanda;

/*
 * Copyright (c) 2018 SSI Schaefer Noell GmbH
 *
 * $Header: $
 */

/**
 * @author <a href="mailto:Sorin@ssi-schaefer-noell.com">Sorin</a>
 * @version $Revision: $, $Date: $, $Author: $
 */

public class ButonNumere extends JButton implements Comanda {

  private JTextArea textDisplay;

  public ButonNumere(JTextArea textDisplay) {
    this.textDisplay = textDisplay;
  }

  @Override
  public void executa() {
    //textDisplay.setText();

  }

}
