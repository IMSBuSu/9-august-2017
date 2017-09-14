package org.ims.ignou.view.finance;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import java.awt.Color;
 
public class ProfitVsExpenditureView extends ApplicationFrame {
   
	
	private static double Expenditure=0;
	private static double profit=0;
   public ProfitVsExpenditureView( String title,double Expenditure,double profit ) {
	      super( title ); 

	   this.Expenditure=Expenditure;
	   this.profit=profit;
      setBackground(Color.ORANGE);
      setResizable(false);
      
      setContentPane(createDemoPanel( ));
   }
   
   private static PieDataset createDataset( ) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Profit (Rs.)" , profit );  
  
      dataset.setValue( "Expenditure (Rs.) " ,  Expenditure);    
      return dataset;         
   }
   
   private static JFreeChart createChart( PieDataset dataset ) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Profit Vs Expenditure",   // chart title 
         dataset,          // data    
         true,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public static JPanel createDemoPanel( ) {
      JFreeChart chart = createChart(createDataset( ) );  
      return new ChartPanel( chart ); 
   }

  
}

