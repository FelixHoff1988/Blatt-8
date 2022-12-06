int a = 12                      //Semikolon fehlt
int b = 0;

while (a < 24) { 
  switch (a) {
    case : 0                    //case 0: wäre richtig
      b = b + a;                //Semantischer Schwachsinn wenn a = 0 ist ist b+a=b... b würde also reichen.
    case 1:                     //In allen cases fehlt break; außer das ist so gewünscht
      if a = 12 {{return;}}     //Klammern um den Boolschen Ausdruck fehlen und a = 12 ist eine Variablenzuweisung, kein boolscher Ausdruck und wenn a == 1 ist kann a nicht == 12 sein. Wozu das return und was soll es wohin returnen.
    default:
      a = a - 1;                
  }
}