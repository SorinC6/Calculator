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

public class ButonNine extends JButton implements Comanda {

  private JTextArea textDisplay;
  private String nrButton;

  public ButonNine(JTextArea textDisplay, String nrButton) {
    this.textDisplay = textDisplay;
    this.nrButton = nrButton;
  }

  @Override
  public void executa() {
    //String nrButton = textDisplay.getText();
    if (textDisplay.getText().length() > 12) {
      return;
    }
    if (textDisplay.getText().equalsIgnoreCase("0")) {
      textDisplay.setText(nrButton);
      return;
    }
    textDisplay.append(nrButton);

  }

}
