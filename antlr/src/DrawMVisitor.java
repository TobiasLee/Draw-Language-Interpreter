// Generated from DrawM.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DrawMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DrawMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DrawMParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DrawMParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(DrawMParser.StatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DrawMParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(DrawMParser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#originStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOriginStat(DrawMParser.OriginStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#scaleStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScaleStat(DrawMParser.ScaleStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#rotStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotStat(DrawMParser.RotStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#colorStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColorStat(DrawMParser.ColorStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#widthStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidthStat(DrawMParser.WidthStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DrawMParser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(DrawMParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncSin}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSin(DrawMParser.FuncSinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code E}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(DrawMParser.EContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(DrawMParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(DrawMParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnarySub}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnarySub(DrawMParser.UnarySubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncTan}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTan(DrawMParser.FuncTanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pie}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPie(DrawMParser.PieContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExp}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExp(DrawMParser.FuncExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncLn}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncLn(DrawMParser.FuncLnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code T}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(DrawMParser.TContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DrawMParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCos}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCos(DrawMParser.FuncCosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DrawMParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncSqrt}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncSqrt(DrawMParser.FuncSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(DrawMParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link DrawMParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(DrawMParser.ParenContext ctx);
}