/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package machine_learning_project;
import static java.lang.Class.forName;
import java.sql.*;





/**
 *
 * @author yarra
 */
public class Machine_learning_project  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try
        {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection con =DriverManager.getConnection("jdbc:odbc:ml_DSN");
                    Statement st=con.createStatement();
                    String s1="";
                     String s2="";
                      String s3="";
                    ResultSet rs= st.executeQuery("select * from dbo.data1");
                    while(rs.next())
                    {
                        s1=rs.getString(1);
                        s2=rs.getString(2);
                        s3=rs.getString(3);
                        System.out.println("the values are "+s1+"\t"+s2+"\t"+s3);
                    }
            }
        catch(ClassNotFoundException | SQLException ex)
        {
            System.out.println("the error is "+ ex);
        }
        
        
Many.on.the.left.are.in.denial..The..USS.Obama,.certified.as.unsinkable.a.year.ago,.is.taking.on.water.in.its.bilges..It.is.starting.to.list.portside.in.the.dark,.cold.political.seas.—.on.its.maiden.voyage,.no.less.The.Obama.is.made.of.sturdy.stuff,.the.left.contends,.designed.by.the.smartest.engineers..Its.skeleton.and.hull,.shaped.by.unbendable.liberal.principles..Its.engines.and.turbines,.powered.by.attractive.government-growing,.corporate-hating.proposals..Its.furnaces,.stoked.by.legions.of.young.and.minority.voters,.hopelessly.idealistic.and.hungry.for.change,.and.by.the.disaffected.middle.class,.sick.of.the.war.on.terror.and.disgusted.by.a.widening.income.gap.with.the.upper.classes..Its.watertight.compartments.—.solid.Democratic.congressional.majorities.In.seas.thought.to.be.smooth.as.glass,.Captain.Barack.Obama.and.his.navigators,.Rahm.Emanuel,.David.Axelrod,.Nancy.Pelosi,.and.Harry.Reid,.plotted.a.swift.course.to.a.safe,.statist.harbor..Government-run.health.care,.cap.and.tax,.card.check,.a.pork-laden.stimulus,.and.re-imposition.of.the.Fairness.Doctrine,.among.other.government-aggrandizing.measures,.would.be.achieved.by.voyage’s.end..But.the.first,.momentous.voyage.wouldn’t.be.the.ship’s.last..Not.by.a.long.shot.No,.the.Obama.would.venture.out.to.sea.again.and.again.until.the.United.States.was.transformed.into.a.reasonable.facsimile.of.a.European.welfare.state.—.a.state.like.Britain.or.France.or.Germany,.with.a.dash.of.Venezuela.for.pizazz..Equality.of.opportunity,.with.its.inevitable.disparate.results,.would.give.way.to.a.society.of.broad,.redistributed.wealth..The.satisfaction.of.achievement.would.come.not.from.material.reward,.but.from.the.compulsory.sharing.of.the.reward.
          
        }
        }