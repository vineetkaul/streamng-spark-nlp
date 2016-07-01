/**
 * 
 */
package myapp.streamingsparknlp.com;

/**
 * @author vikaul
 *
 */
public class NLP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhatToThink.init();
            System.out.println(" Sentiment Score : " + WhatToThink.findSentiment("Definitely buying  a PC from here."));
	}

}
