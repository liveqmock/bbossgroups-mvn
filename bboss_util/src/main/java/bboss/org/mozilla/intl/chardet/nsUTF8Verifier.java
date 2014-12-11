/* -*- Mode: C; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 2 -*-
 *
 * The contents of this file are subject to the Netscape Public
 * License Version 1.1 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.mozilla.org/NPL/
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * The Original Code is mozilla.org code.
 *
 * The Initial Developer of the Original Code is Netscape
 * Communications Corporation.  Portions created by Netscape are
 * Copyright (C) 1998 Netscape Communications Corporation. All
 * Rights Reserved.
 *
 * Contributor(s): 
 */
/* 
 * DO NOT EDIT THIS DOCUMENT MANUALLY !!!
 * THIS FILE IS AUTOMATICALLY GENERATED BY THE TOOLS UNDER
 *    AutoDetect/tools/
 */

package bboss.org.mozilla.intl.chardet ;

import java.lang.*;

public class nsUTF8Verifier extends nsVerifier {

	 static int[]  cclass   ; 
	 static int[]  states   ; 
	 static int    stFactor ; 
	 static String charset  ; 

	 public int[]  cclass()   { return cclass ;   }
	 public int[]  states()   { return states ;   }
	 public int    stFactor() { return stFactor ; }
	 public String charset()  { return charset ;  }

   public nsUTF8Verifier() {

      cclass = new int[256/8] ;

      cclass[0] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[1] = ((int)(((  ((int)(((  ((int)((( 0) << 4) | (0)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[2] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[3] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((0) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[4] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[5] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[6] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[7] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[8] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[9] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[10] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[11] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[12] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[13] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[14] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[15] = ((int)(((  ((int)(((  ((int)((( 1) << 4) | (1)))  ) << 8) | (((int)(((1) << 4) | ( 1))) ))) ) << 16) | (  ((int)(((  ((int)(((1) << 4) | (1))) ) << 8) | (   ((int)(((1) << 4) | (1))) )))))) ;
      cclass[16] = ((int)(((  ((int)(((  ((int)((( 3) << 4) | (3)))  ) << 8) | (((int)(((3) << 4) | ( 3))) ))) ) << 16) | (  ((int)(((  ((int)(((2) << 4) | (2))) ) << 8) | (   ((int)(((2) << 4) | (2))) )))))) ;
      cclass[17] = ((int)(((  ((int)(((  ((int)((( 4) << 4) | (4)))  ) << 8) | (((int)(((4) << 4) | ( 4))) ))) ) << 16) | (  ((int)(((  ((int)(((4) << 4) | (4))) ) << 8) | (   ((int)(((4) << 4) | (4))) )))))) ;
      cclass[18] = ((int)(((  ((int)(((  ((int)((( 4) << 4) | (4)))  ) << 8) | (((int)(((4) << 4) | ( 4))) ))) ) << 16) | (  ((int)(((  ((int)(((4) << 4) | (4))) ) << 8) | (   ((int)(((4) << 4) | (4))) )))))) ;
      cclass[19] = ((int)(((  ((int)(((  ((int)((( 4) << 4) | (4)))  ) << 8) | (((int)(((4) << 4) | ( 4))) ))) ) << 16) | (  ((int)(((  ((int)(((4) << 4) | (4))) ) << 8) | (   ((int)(((4) << 4) | (4))) )))))) ;
      cclass[20] = ((int)(((  ((int)(((  ((int)((( 5) << 4) | (5)))  ) << 8) | (((int)(((5) << 4) | ( 5))) ))) ) << 16) | (  ((int)(((  ((int)(((5) << 4) | (5))) ) << 8) | (   ((int)(((5) << 4) | (5))) )))))) ;
      cclass[21] = ((int)(((  ((int)(((  ((int)((( 5) << 4) | (5)))  ) << 8) | (((int)(((5) << 4) | ( 5))) ))) ) << 16) | (  ((int)(((  ((int)(((5) << 4) | (5))) ) << 8) | (   ((int)(((5) << 4) | (5))) )))))) ;
      cclass[22] = ((int)(((  ((int)(((  ((int)((( 5) << 4) | (5)))  ) << 8) | (((int)(((5) << 4) | ( 5))) ))) ) << 16) | (  ((int)(((  ((int)(((5) << 4) | (5))) ) << 8) | (   ((int)(((5) << 4) | (5))) )))))) ;
      cclass[23] = ((int)(((  ((int)(((  ((int)((( 5) << 4) | (5)))  ) << 8) | (((int)(((5) << 4) | ( 5))) ))) ) << 16) | (  ((int)(((  ((int)(((5) << 4) | (5))) ) << 8) | (   ((int)(((5) << 4) | (5))) )))))) ;
      cclass[24] = ((int)(((  ((int)(((  ((int)((( 6) << 4) | (6)))  ) << 8) | (((int)(((6) << 4) | ( 6))) ))) ) << 16) | (  ((int)(((  ((int)(((6) << 4) | (6))) ) << 8) | (   ((int)(((0) << 4) | (0))) )))))) ;
      cclass[25] = ((int)(((  ((int)(((  ((int)((( 6) << 4) | (6)))  ) << 8) | (((int)(((6) << 4) | ( 6))) ))) ) << 16) | (  ((int)(((  ((int)(((6) << 4) | (6))) ) << 8) | (   ((int)(((6) << 4) | (6))) )))))) ;
      cclass[26] = ((int)(((  ((int)(((  ((int)((( 6) << 4) | (6)))  ) << 8) | (((int)(((6) << 4) | ( 6))) ))) ) << 16) | (  ((int)(((  ((int)(((6) << 4) | (6))) ) << 8) | (   ((int)(((6) << 4) | (6))) )))))) ;
      cclass[27] = ((int)(((  ((int)(((  ((int)((( 6) << 4) | (6)))  ) << 8) | (((int)(((6) << 4) | ( 6))) ))) ) << 16) | (  ((int)(((  ((int)(((6) << 4) | (6))) ) << 8) | (   ((int)(((6) << 4) | (6))) )))))) ;
      cclass[28] = ((int)(((  ((int)(((  ((int)((( 8) << 4) | (8)))  ) << 8) | (((int)(((8) << 4) | ( 8))) ))) ) << 16) | (  ((int)(((  ((int)(((8) << 4) | (8))) ) << 8) | (   ((int)(((8) << 4) | (7))) )))))) ;
      cclass[29] = ((int)(((  ((int)(((  ((int)((( 8) << 4) | (8)))  ) << 8) | (((int)(((9) << 4) | ( 8))) ))) ) << 16) | (  ((int)(((  ((int)(((8) << 4) | (8))) ) << 8) | (   ((int)(((8) << 4) | (8))) )))))) ;
      cclass[30] = ((int)(((  ((int)(((  ((int)((( 11) << 4) | (11)))  ) << 8) | (((int)(((11) << 4) | ( 11))) ))) ) << 16) | (  ((int)(((  ((int)(((11) << 4) | (11))) ) << 8) | (   ((int)(((11) << 4) | (10))) )))))) ;
      cclass[31] = ((int)(((  ((int)(((  ((int)((( 0) << 4) | (0)))  ) << 8) | (((int)(((15) << 4) | ( 14))) ))) ) << 16) | (  ((int)(((  ((int)(((13) << 4) | (13))) ) << 8) | (   ((int)(((13) << 4) | (12))) )))))) ;



      states = new int[26] ;

      states[0] = ((int)(((  ((int)(((  ((int)(((      10) << 4) | (     12)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eStart) << 4) | (eError))) )))))) ;
      states[1] = ((int)(((  ((int)(((  ((int)(((      3) << 4) | (     4)))  ) << 8) | (((int)(((     5) << 4) | (      6))) ))) ) << 16) | (  ((int)(((  ((int)(((     7) << 4) | (     8))) ) << 8) | (   ((int)(((     11) << 4) | (     9))) )))))) ;
      states[2] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[3] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[4] = ((int)(((  ((int)(((  ((int)((( eItsMe) << 4) | (eItsMe)))  ) << 8) | (((int)(((eItsMe) << 4) | ( eItsMe))) ))) ) << 16) | (  ((int)(((  ((int)(((eItsMe) << 4) | (eItsMe))) ) << 8) | (   ((int)(((eItsMe) << 4) | (eItsMe))) )))))) ;
      states[5] = ((int)(((  ((int)(((  ((int)((( eItsMe) << 4) | (eItsMe)))  ) << 8) | (((int)(((eItsMe) << 4) | ( eItsMe))) ))) ) << 16) | (  ((int)(((  ((int)(((eItsMe) << 4) | (eItsMe))) ) << 8) | (   ((int)(((eItsMe) << 4) | (eItsMe))) )))))) ;
      states[6] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     5) << 4) | (      5))) ))) ) << 16) | (  ((int)(((  ((int)(((     5) << 4) | (     5))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[7] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[8] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     5) << 4) | (      5))) ))) ) << 16) | (  ((int)(((  ((int)(((     5) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[9] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[10] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     7) << 4) | (      7))) ))) ) << 16) | (  ((int)(((  ((int)(((     7) << 4) | (     7))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[11] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[12] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     7) << 4) | (      7))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[13] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[14] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     9) << 4) | (      9))) ))) ) << 16) | (  ((int)(((  ((int)(((     9) << 4) | (     9))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[15] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[16] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     9) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[17] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[18] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     12) << 4) | (      12))) ))) ) << 16) | (  ((int)(((  ((int)(((     12) << 4) | (     12))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[19] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[20] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((     12) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[21] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[22] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | (      12))) ))) ) << 16) | (  ((int)(((  ((int)(((     12) << 4) | (     12))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[23] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[24] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eStart) << 4) | ( eStart))) ))) ) << 16) | (  ((int)(((  ((int)(((eStart) << 4) | (eStart))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;
      states[25] = ((int)(((  ((int)(((  ((int)((( eError) << 4) | (eError)))  ) << 8) | (((int)(((eError) << 4) | ( eError))) ))) ) << 16) | (  ((int)(((  ((int)(((eError) << 4) | (eError))) ) << 8) | (   ((int)(((eError) << 4) | (eError))) )))))) ;



      charset =  "UTF-8";
      stFactor =  16;

   }

   public boolean isUCS2() { return  false; } ;


}
