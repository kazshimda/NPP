		/**
		 * @author KazumasaShimada
		 * 2019/06/06
		 */
		package org.matsim.evacuationgui.analysis.gui;
		
		
		import java.io.BufferedWriter;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.io.PrintWriter;
		import org.matsim.api.core.v01.network.Link;
		import org.matsim.evacuationgui.analysis.data.EventData;
		import org.matsim.evacuationgui.analysis.gui.EvacuationTimeGraphPanel;
		
		public class EvacuationTimeDataExport {
		
				
			 protected EventData<Link> data;
			 protected EvacuationTimeGraphPanel xs;
			 protected EvacuationTimeGraphPanel ys;
			 
			 public static void evacuationTimeDataExport(double[] xs, double[] ys) {
					
		
				PrintWriter pw = null;
		
			try {
				pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\KazumasaShimada\\MATSim_Results\\SQN\\OutputAgents.csv")));
			
				//header
				pw.print("Time [min]");
				pw.print(",");
				pw.print("Agents");
				pw.println();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0; i<xs.length;i++) {
			pw.print((xs[i]-xs[0])/60000);
			pw.print(",");
			pw.print(ys[i]);
			pw.println();
			}
			pw.flush();
			pw.close();
			//
			
		}}
