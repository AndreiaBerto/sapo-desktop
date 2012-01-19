/*
 * Protocolo.java
 *
 * Created on 13 de Novembro de 2005, 15:55
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Anderson Zanardi de Freitas
 */



public class Protocolo {
    public String frenteLabel[] = {"Glabela",
                            "Trago direito",
                            "Trago esquerdo",
                            "Mento",
                            "Acr�mio direito",
                            "Acr�mio esquerdo",
                            "Man�brio do esterno",
                            "Epic�ndilo lateral direito",
                            "Epic�ndilo lateral esquerdo",
                            "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna direita",
                            "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna esquerda",
                            "Espinha il�aca �ntero-superior direita",
                            "Espinha il�aca �ntero-superior esquerda",
                            "Troc�nter maior do f�mur direito ",
                            "Troc�nter maior do f�mur esquerdo",
                            "Linha articular do joelho direito",
                            "Ponto medial da patela direita",
                            "Tuberosidade da t�bia direita",
                            "Linha articular do joelho esquerdo",
                            "Ponto medial da patela esquerda",
                            "Tuberosidade da t�bia esquerda",
                            "Mal�olo lateral direito",
                            "Mal�olo medial direito",
                            "Ponto entre a cabe�a do 2� e 3� metatarso direito",
                            "Mal�olo lateral esquerdo",
                            "Mal�olo medial esquerdo",
                            "Ponto entre a cabe�a do 2� e 3� metatarso esquerdo"};
       public int frenteX[] = {136,114,163,136,87,192,136,47,231,48,229,102,175,82,195,83,104,100,195,173,178,96,120,101,184,157,170};
       public int frenteY[] = {30,50,50,74,99,98,111,196,194,266,265,243,243,285,285,437,438,459,438,439,458,569,566,596,569,565,598};
                             
       public String latEsqLabel[] = {"Glabela",
                            "Trago esquerdo",
                            "Mento",
                            "Man�brio do esterno",
                            "Acr�mio esquerdo",
                            "Epic�ndilo lateral esquerdo",
                            "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna esquerda",
                            "Processo espinhoso C7",
                            "Processo espinhoso T1",
                            "Processo espinhoso T3",
                            "Processo espinhoso T5",
                            "Processo espinhoso T7",
                            "Processo espinhoso T9",
                            "Processo espinhoso T11",
                            "Processo espinhoso T12",
                            "Processo espinhoso L1",
                            "Processo espinhoso L3",
                            "Processo espinhoso L4",
                            "Processo espinhoso L5",
                            "Processo espinhoso S1",
                            "Espinha il�aca �ntero-superior esquerda",
                            "Espinha il�aca p�stero-superior esquerda",
                            "Troc�nter maior do f�mur esquerdo",
                            "Linha articular do joelho esquerdo",
                            "Ponto medial da patela esquerda",
                            "Tuberosidade da t�bia",
                            "Ponto sobre a linha m�dia da perna esquerda",
                            "Ponto sobre o tend�o de aquiles esquerdo na altura m�dia dos dois mal�olos",
                            "Calc�neo esquerdo",
                            "Mal�olo lateral esquerdo",
                            "Ponto entre a cabe�a do 2� e 3� metatarso esquerdo"};        
        public int latEsqX[] = {94,131,98,120,140,124,52,161,173,186,191,191,188,185,184,182,177,176,176,190,110,181,146,136,110,115,165,170,174,150,95};
        public int latEsqY[] = {35,49,80,111,101,218,278,80,91,108,125,142,161,178,188,198,213,226,239,253,258,251,298,443,447,470,536,593,608,598,608};
                            
        public String latDirLabel[] = {"Glabela",
                            "Trago direito",
                            "Mento",
                            "Man�brio do esterno",
                            "Acr�mio direito",
                            "Epic�ndilo lateral direito",
                            "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna direita",
                            "Processo espinhoso C7",
                            "Processo espinhoso T1",
                            "Processo espinhoso T3",
                            "Processo espinhoso T5",
                            "Processo espinhoso T7",
                            "Processo espinhoso T9",
                            "Processo espinhoso T11",
                            "Processo espinhoso T12",
                            "Processo espinhoso L1",
                            "Processo espinhoso L3",
                            "Processo espinhoso L4",
                            "Processo espinhoso L5",
                            "Processo espinhoso S1",
                            "Espinha il�aca �ntero-superior direita",
                            "Espinha il�aca p�stero-superior direita",
                            "Troc�nter maior do f�mur direito",
                            "Linha articular do joelho direito",
                            "Ponto medial da patela direita",
                            "Tuberosidade da t�bia",
                            "Ponto sobre a linha m�dia da perna direita",
                            "Ponto sobre o tend�o de aquiles direito na altura m�dia dos dois mal�olos",
                            "Calc�neo direito",
                            "Mal�olo lateral direito",
                            "Ponto entre a cabe�a do 2� e 3� metatarso direito"};
        public int latDirX[] = {172,136,169,147,127,143,215,106,94,81,76,76,79,81,83,85,89,91,91,76,157,86,121,131,156,151,101,97,93,116,171};
        public int latDirY[] = {35,49,80,111,101,219,278,80,91,107,125,142,161,178,188,198,213,226,239,253,258,252,299,443,447,470,536,593,608,598,609};
                           
        public String posteriorLabel[] =  {"Trago direito",
                                "Trago esquerdo",
                                "Acr�mio direito",
                                "Acr�mio esquerdo",
                                "Intersec��o entre a margem medial e a espinha da esc�pula direita",
                                "Intersec��o entre a margem medial e a espinha da esc�pula esquerda",
                                "�ngulo inferior da esc�pula direito",
                                "�ngulo inferior da esc�pula esquerdo",
                                "Espinha il�aca p�stero-superior direita",
                                "Espinha il�aca p�stero-superior esquerda",
                                "Epic�ndilo lateral direito",
                                "Epic�ndilo lateral esquerdo",
                                "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna direita",
                                "Ponto m�dio entre o processo estil�ide do r�dio e a cabe�a da ulna esquerda",
                                "Processo espinhoso C7",
                                "Processo espinhoso T1",
                                "Processo espinhoso T3",
                                "Processo espinhoso T5",
                                "Processo espinhoso T7",
                                "Processo espinhoso T9",
                                "Processo espinhoso T11",
                                "Processo espinhoso T12",
                                "Processo espinhoso L1",
                                "Processo espinhoso L3",
                                "Processo espinhoso L4",
                                "Processo espinhoso L5",
                                "Processo espinhoso S1",
                                "Troc�nter maior do f�mur direito",
                                "Troc�nter maior do f�mur esquerdo",
                                "Linha articular do joelho direito",
                                "Linha articular do joelho esquerdo",
                                "Ponto sobre a linha m�dia da perna direita",
                                "Ponto sobre a linha m�dia da perna esquerda",
                                "Mal�olo lateral direito",
                                "Ponto sobre o tend�o de aquiles direito na altura m�dia dos dois mal�olos",
                                "Mal�olo medial direito",
                                "Calc�neo direito",
                                "Mal�olo lateral esquerdo",
                                "Ponto sobre o tend�o de aquiles esquerdo na altura m�dia dos dois mal�olos",
                                "Mal�olo medial esquerdo",
                                "Calc�neo esquerdo"};                    
        public int posX[] = {169,114,199,86,169,109,164,113,161,119,237,49,225,62,139,139,139,139,139,138,139,138,139,139,138,139,139,200,83,199,84,178,101,186,172,157,175,96,109,125,104};
        public int posY[] = {55,55,99,99,119,119,150,150,250,249,219,219,278,277,79,91,107,124,141,160,178,186,196,212,226,239,253,309,311,435,434,525,525,586,585,583,612,585,583,581,609};
                            
        public String nome = new String();
        public ArrayList frente = new ArrayList();
        public ArrayList latEsq = new ArrayList();
        public ArrayList latDir = new ArrayList();
        public ArrayList poster = new ArrayList();       
        
        public String[] getLabels(String vista) {
        	String[] retorno = {""}; 
        	if (vista.equalsIgnoreCase("anterior")) return frenteLabel;
    		if (vista.equalsIgnoreCase("posterior")) return posteriorLabel;
    		if (vista.equalsIgnoreCase("lateral direita")) return latDirLabel;
    		if (vista.equalsIgnoreCase("lateral esquerda")) return latEsqLabel;
    		else return retorno;
        }
        
}
