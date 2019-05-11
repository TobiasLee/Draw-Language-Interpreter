import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.HashMap;

/**
 * @author LiLei 16130188007 tobiaslee@ralee.cc
 **/
public class DrawMVisitorGUI extends DrawMBaseVisitor<Double> {
    // define some global variable for drawing
    private double scaleX =1 , scaleY=1, rotAngle=0, t, originX=0, originY=0;
    // swing object to control action

    private int width =3, height=3, colorR = 255, colorG = 0, colorB = 0;
    private UIBase ui;
    public DrawMVisitorGUI(UIBase ui) {
        this.ui = ui;
    }
    // support for variable usage
    private HashMap<String, Double> memory = new HashMap<>();


    @Override
    public Double visitForStat(DrawMParser.ForStatContext ctx) {
        Double start = visit(ctx.expr(0));
        Double end = visit(ctx.expr(1));
        Double step = visit(ctx.expr(2));
        // draw languages
        // print necessary information
        System.out.println("start: " + start);
        System.out.println("end: " + end);
        System.out.println("step: " + step);
        System.out.println("Scale: " + "(" + scaleX + ", " + scaleY + " )");
        System.out.println("Origin: " + "(" + originX + ", " + originY + " )");
        System.out.println("Rot angle: " + rotAngle);
        // dead loop detection
        if( start < end && step < 0 || start > end && step > 0) {
            System.out.println("Dead Loop Found ");
            ui.showError("Dead Loop");
            return 0.0;
        }
        Color c = new Color(colorR, colorG, colorB);
        for( double tmp = start ; tmp <= end; tmp += step) {
            t = tmp;
            Double x = visit(ctx.expr(3));
            Double y = visit(ctx.expr(4));
            Double xCoord = Util.calcCoordX(x, y,  originX, scaleX, rotAngle);
            Double yCoord = Util.calcCoordY(x, y, originY, scaleY, rotAngle);
            ui.drawPixel(xCoord,  yCoord, new UIPixelProperty(c, width, height));
        }
        return 0.0;
    }

    @Override
    public Double visitOriginStat(DrawMParser.OriginStatContext ctx) {
        Double x = visit(ctx.expr(0));
        Double y = visit(ctx.expr(1));
        originX =x ;
        originY = y;
        return 0.0;
    }

    @Override
    public Double visitScaleStat(DrawMParser.ScaleStatContext ctx) {
        Double x = visit(ctx.expr(0));
        Double y = visit(ctx.expr(1));
        scaleX = x;
        scaleY = y;
        return 0.0;
    }

    @Override
    public Double visitRotStat(DrawMParser.RotStatContext ctx) {
        Double rot = visit(ctx.expr());
        rotAngle = rot;
        return rot;
    }

    @Override
    public Double visitColorStat(DrawMParser.ColorStatContext ctx) {
        Double r = visit(ctx.expr(0));
        Double g = visit(ctx.expr(1));
        Double b = visit(ctx.expr(2));
        colorR = r.intValue();
        colorG = g.intValue();
        colorB = b.intValue();
        return 0.0;
    }

    @Override
    public Double visitWidthStat(DrawMParser.WidthStatContext ctx) {
        Double set_width = visit(ctx.expr());

        width = set_width.intValue();
        height = set_width.intValue();
        return 0.0;
    }

    @Override
    public Double visitAssignStat(DrawMParser.AssignStatContext ctx) {
        String id =  ctx.ID().getText();
        Double value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Double visitFuncSin(DrawMParser.FuncSinContext ctx) {
        return Math.sin(visit(ctx.expr()));
    }

    @Override
    public Double visitE(DrawMParser.EContext ctx) {
        return Math.E;
    }

    @Override
    public Double visitMulDiv(DrawMParser.MulDivContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));

//        ctx.expr(1) == DrawMLexer.MUL
        if (ctx.op.getType() == DrawMLexer.MUL)
            return left * right;
        else if (ctx.op.getType() == DrawMLexer.DIV)
            if (Math.abs(right) < 1e-8) {
                ui.showError("Divide Zero Found!");
                return 0.0;
            }   else
                return left / right;
        else
            return 0.0;
    }

    @Override
    public Double visitAddSub(DrawMParser.AddSubContext ctx) {
        Double left = visit(ctx.expr(0));
        Double right = visit(ctx.expr(1));
        if (ctx.op.getType() == DrawMLexer.ADD)
            return left + right;
        else
            return left - right;
    }

    @Override
    public Double visitUnarySub(DrawMParser.UnarySubContext ctx) {
        System.out.println("unary sub value" + -visit(ctx.expr()));
        return  -visit(ctx.expr());
    }

    @Override
    public Double visitFuncTan(DrawMParser.FuncTanContext ctx) {
        return Math.tan(visit(ctx.expr()));
    }

    @Override
    public Double visitPie(DrawMParser.PieContext ctx) {
        return Math.PI;
    }

    @Override
    public Double visitFuncExp(DrawMParser.FuncExpContext ctx) {
        return Math.exp(visit(ctx.expr()));
    }

    @Override
    public Double visitFuncLn(DrawMParser.FuncLnContext ctx) {
        return Math.log(visit(ctx.expr()));
    }

    @Override
    public Double visitT(DrawMParser.TContext ctx) {
        return t;
    }

    @Override
    public Double visitNumber(DrawMParser.NumberContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    @Override
    public Double visitFuncCos(DrawMParser.FuncCosContext ctx) {
        return Math.cos(visit(ctx.expr()));
    }

    @Override
    public Double visitId(DrawMParser.IdContext ctx) {
        String key = ctx.ID().getText();
        if (memory.containsKey(key)){
            return memory.get(key);
        } else {
            ui.showError("variable: " + key + " is not defined!");
            System.exit(1);
            return 0.0; // raise error here
        }
    }

    @Override
    public Double visitFuncSqrt(DrawMParser.FuncSqrtContext ctx) {
        Double value = visit(ctx.expr());
        if (value < 0){
            ui.showError("negative number for sqrt(): " + value+ " is not defined!");
            return 0.0;
        }
        else
            return Math.sqrt(visit(ctx.expr()));
    }

    @Override
    public Double visitPower(DrawMParser.PowerContext ctx) {
        System.out.println("power: " + Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1))));
        return Math.pow(visit(ctx.expr(0)), visit(ctx.expr(1)));
    }

    @Override
    public Double visitParen(DrawMParser.ParenContext ctx) {
        System.out.println("parent:  " + visit(ctx.expr()));

        return visit(ctx.expr());
    }
}
